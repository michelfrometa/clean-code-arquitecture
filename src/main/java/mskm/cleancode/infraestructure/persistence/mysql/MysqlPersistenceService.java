package mskm.cleancode.infraestructure.persistence.mysql;

import jakarta.transaction.Transactional;
import lombok.RequiredArgsConstructor;
import mskm.cleancode.infraestructure.persistence.IDomainModelPersistenceModelMapper;
import mskm.cleancode.infraestructure.persistence.IPersistenceService;
import org.springframework.data.domain.Example;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Collections;
import java.util.List;
import java.util.Optional;

/**
 * Abstract base class for MySQL persistence services, providing basic CRUD operations
 * and additional methods for data retrieval.
 *
 * @param <T>  the type of domain model
 * @param <ID> the type of identifier for the entity
 * @param <P>  the type of the persistence model
 * @param <R>  the type of the JPA repository used for persistence
 */
@Transactional
@RequiredArgsConstructor
public abstract class MysqlPersistenceService<T, ID, P, R extends JpaRepository<P, ID>>
        implements IPersistenceService<T, ID> {

    protected final R jpaRepository;
    protected final IDomainModelPersistenceModelMapper<T, P> mapper;

    @Override
    public T save(T example) {
        return Optional.of(example)
                .map(mapper::toPersistenceModel)
                .map(jpaRepository::save)
                .map(mapper::toEntity)
                .orElse(null);
    }

    @Override
    public List<T> findAll() {
        return jpaRepository.findAll().stream()
                .map(mapper::toEntity)
                .toList();
    }

    @Override
    public void deleteById(ID id) {
        jpaRepository.deleteById(id);
    }

    @Override
    public Optional<T> findById(ID id) {
        return jpaRepository.findById(id)
                .map(mapper::toEntity);
    }

    @Override
    public void delete(T entity) {
        Optional.of(entity)
                .map(mapper::toPersistenceModel)
                .ifPresent(jpaRepository::delete);
    }

    @Override
    public List<T> findAll(Sort sort) {
        return jpaRepository.findAll(sort).stream()
                .map(mapper::toEntity)
                .toList();
    }

    @Override
    public Page<T> findAll(Pageable pageable) {
        return jpaRepository.findAll(pageable).map(mapper::toEntity);
    }

    @Override
    public List<T> findAllByExample(Example<T> example) {
        return Optional.of(example)
                .map(mapper::toPersistenceModelExample)
                .map(jpaRepository::findAll)
                .map(mapper::toEntity)
                .orElseGet(Collections::emptyList);
    }

    @Override
    public Optional<T> findOneByExample(Example<T> example) {
        return Optional.of(example)
                .map(mapper::toPersistenceModelExample)
                .flatMap(jpaRepository::findOne)
                .map(mapper::toEntity);
    }

    @Override
    public long count() {
        return jpaRepository.count();
    }

    @Override
    public long count(Example<T> example) {
        return Optional.of(example)
                .map(mapper::toPersistenceModelExample)
                .map(jpaRepository::count)
                .orElse(0L);
    }

    @Override
    public boolean existsById(ID id) {
        return jpaRepository.existsById(id);
    }

    @Override
    public boolean existsByExample(Example<T> example) {
        return Optional.of(example)
                .map(mapper::toPersistenceModelExample)
                .map(jpaRepository::exists)
                .orElse(false);
    }
}
