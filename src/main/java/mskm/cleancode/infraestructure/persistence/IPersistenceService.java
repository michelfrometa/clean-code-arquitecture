package mskm.cleancode.infraestructure.persistence;

import org.springframework.data.domain.Example;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;

import java.util.List;
import java.util.Optional;

/**
 * Interface for persistence services, providing basic CRUD operations and additional methods for data retrieval.
 *
 * @param <E>  the type of entity being persisted
 * @param <ID> the type of identifier for the entity
 */
public interface IPersistenceService<E, ID> {

    /**
     * Retrieves all entities of type T.
     *
     * @return a list of all entities
     */
    List<E> findAll();

    /**
     * Retrieves an entity of type T by its identifier.
     *
     * @param id the identifier of the entity to retrieve
     * @return the entity with the specified identifier, or null if not found
     */
    Optional<E> findById(ID id);

    /**
     * Saves an entity of type T.
     *
     * @param entity the entity to save
     * @return the saved entity
     */
    E save(E entity);

    /**
     * Deletes an entity of type T by its identifier.
     *
     * @param id the identifier of the entity to delete
     */
    void deleteById(ID id);

    /**
     * Deletes an entity of type T.
     *
     * @param entity the entity to delete
     */
    void delete(E entity);

    /**
     * Retrieves all entities of type T, sorted by the specified sort criteria.
     *
     * @param sort the sort criteria to apply
     * @return a list of all entities, sorted by the specified criteria
     */
    List<E> findAll(Sort sort);

    /**
     * Retrieves a page of entities of type T, based on the specified pageable criteria.
     *
     * @param pageable the pageable criteria to apply
     * @return a page of entities, based on the specified criteria
     */
    Page<E> findAll(Pageable pageable);

    /**
     * Retrieves all entities of type T that match the specified example.
     *
     * @param example the example to match
     * @return a list of all entities that match the specified example
     */
    List<E> findAllByExample(Example<E> example);

    /**
     * Retrieves an entity of type T that matches the specified example, if one exists.
     *
     * @param example the example to match
     * @return an optional entity that matches the specified example, or an empty optional if no match is found
     */
    Optional<E> findOneByExample(Example<E> example);

    /**
     * Returns the total count of entities of type T.
     *
     * @return the total count of entities
     */
    long count();

    /**
     * Returns the total count of entities of type T that match the specified example.
     *
     * @param example the example to match
     * @return the total count of entities that match the specified example
     */
    long count(Example<E> example);

    /**
     * Returns whether an entity of type T with the specified identifier exists.
     *
     * @param id the identifier to check
     * @return true if an entity with the specified identifier exists, false otherwise
     */
    boolean existsById(ID id);

    /**
     * Returns whether an entity of type T that matches the specified example exists.
     *
     * @param example the example to match
     * @return true if an entity that matches the specified example exists, false otherwise
     */
    boolean existsByExample(Example<E> example);

}