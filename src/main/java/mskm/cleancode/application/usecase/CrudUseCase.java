package mskm.cleancode.application.usecase;

import lombok.RequiredArgsConstructor;
import mskm.cleancode.application.mapper.IEntityMapper;
import mskm.cleancode.application.validator.IValidator;
import mskm.cleancode.infraestructure.persistence.IPersistenceService;

import java.util.Optional;

/**
 * Abstract class for a use case that encapsulates the create, read, update and
 * delete operations.
 *
 * @param <D>  the dto type
 * @param <E>  the entity type
 * @param <R>  the repository type
 * @param <VD> the validation dto type
 * @param <ID> the id type
 * @param <M>  the mapper type
 * @param <V>  the validator type
 */
@RequiredArgsConstructor
public abstract class CrudUseCase<D, E, R extends IPersistenceService<E, ID>, VD, ID,
        M extends IEntityMapper<VD, D, E>, V extends IValidator<VD>> implements IUseCase<VD, D, E> {

    private final R repository;
    private final M mapper;
    private final V validator;

    public D execute(VD input) {
        return Optional.of(input)
                .map(validator::validate)
                .map(mapper::customDtoToEntity)
                .map(this::action)
                .map(repository::save)
                .map(mapper::entityToDto)
                .orElse(null);
    }
}
