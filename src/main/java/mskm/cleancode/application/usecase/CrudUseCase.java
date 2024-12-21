package mskm.cleancode.application.usecase;

import lombok.RequiredArgsConstructor;
import mskm.cleancode.application.mapper.IEntityMapper;
import mskm.cleancode.application.validator.IValidator;
import mskm.cleancode.domain.BaseEntity;
import mskm.cleancode.infraestructure.persistence.IPersistenceService;

/**
 * Abstract class for a use case that encapsulates the create, read, update and
 * delete operations.
 *
 * @param <I>  the input dto type
 * @param <O>  the output dto type
 * @param <E>  the domain entity type parameter.
 * @param <ID> the type of the entity's id
 * @param <R>  the repository type
 * @param <M>  the mapper type
 * @param <IV> the input´s dto validator type
 */
@RequiredArgsConstructor
public abstract class CrudUseCase<I, O, E extends BaseEntity<ID>, ID, M extends IEntityMapper<I, O, E>,
        R extends IPersistenceService<E, ID>, IV extends IValidator<I>> {

    private final R repository;
    private final M mapper;
    private final IV validator;
/*    public O execute(I input) {
        return Optional.of(input)
                .map(validator::validate)
                .map(mapper::inputDtoToEntity)
                .map(this::action)
                .map(repository::save)
                .map(mapper::entityToDto)
                .orElse(null);
    }*/
}
