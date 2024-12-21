package mskm.cleancode.application.usecase;

import jakarta.persistence.EntityNotFoundException;
import lombok.experimental.SuperBuilder;
import mskm.cleancode.application.mapper.IEntityMapper;
import mskm.cleancode.application.validator.IValidator;
import mskm.cleancode.domain.BaseEntity;
import mskm.cleancode.infraestructure.persistence.IPersistenceService;
import mskm.cleancode.presentation.dto.BaseDto;

/**
 * Abstract class for a use case that encapsulates a delete operation.
 *
 * @param <I>  the input dto type
 * @param <O>  the output dto type
 * @param <E>  the domain entity type parameter.
 * @param <ID> the type of the entity's id
 * @param <R>  the repository type
 * @param <M>  the mapper type
 * @param <IV> the input´s dto validator type
 */
@SuperBuilder
public abstract class AbstractDeleteUseCase<I extends BaseDto<ID>, O, E extends BaseEntity<ID>, ID, R extends IPersistenceService<E, ID>,
        M extends IEntityMapper<I, O, E>, IV extends IValidator<I>> extends AbstractUseCase<I, O, E, ID, M, R, IV> {

    public AbstractDeleteUseCase(R repository,
                                 M mapper,
                                 IV inputValidator
                                ) {
        super(inputValidator, mapper, repository);
    }

    @Override
    public E action(E source) {
        if (repository.existsById(source.getId()))
            repository.deleteById(source.getId());
        else
            throw new EntityNotFoundException("Entity with id: " + source.getId() + " not found");

        return null;
    }
}
