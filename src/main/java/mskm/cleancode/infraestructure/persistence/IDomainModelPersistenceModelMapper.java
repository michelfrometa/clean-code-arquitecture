package mskm.cleancode.infraestructure.persistence;

import org.mapstruct.BeanMapping;
import org.mapstruct.MappingTarget;
import org.mapstruct.Named;
import org.mapstruct.NullValuePropertyMappingStrategy;
import org.springframework.data.domain.Example;

import java.util.List;
import java.util.Set;

/**
 * Contract for an entity to a persistence model mapper.
 *
 * @param <E> - Entity type parameter.
 * @param <P> - Persistence Model type parameter.
 */
public interface IDomainModelPersistenceModelMapper<E, P> {// FIXME extending beans are not being loaded

    P toPersistenceModel(E entity);

    E toEntity(P persistenceModel);

    List<P> toPersistenceModelList(List<E> entityList);

    Set<P> toPersistenceModelSet(Set<E> entityList);

    Iterable<P> toPersistenceModel(Iterable<E> entityList);

    List<E> toEntity(List<P> persistenceModelList);

    @Named("partialUpdate")
    @BeanMapping(nullValuePropertyMappingStrategy = NullValuePropertyMappingStrategy.IGNORE)
    void partialUpdate(@MappingTarget P persistenceModel, E entity);

    default Example<P> toPersistenceModelExample(Example<E> example) {
        return Example.of(toPersistenceModel(example.getProbe()), example.getMatcher());
    }
}
