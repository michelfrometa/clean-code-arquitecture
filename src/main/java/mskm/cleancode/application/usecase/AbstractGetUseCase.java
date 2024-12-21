package mskm.cleancode.application.usecase;

import lombok.experimental.SuperBuilder;
import mskm.cleancode.application.mapper.IEntityMapper;
import mskm.cleancode.application.validator.IValidator;
import mskm.cleancode.domain.BaseEntity;
import mskm.cleancode.infraestructure.persistence.IPersistenceService;
import mskm.cleancode.presentation.dto.BaseDto;

/**
 * Abstract class for a use case that encapsulates a get operation.
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
public abstract class AbstractGetUseCase<I extends BaseDto<ID>, O, E extends BaseEntity<ID>, ID, R extends IPersistenceService<E, ID>,
        M extends IEntityMapper<I, O, E>, IV extends IValidator<I>> extends AbstractUseCase<I, O, E, ID, M, R, IV> {

    public AbstractGetUseCase(R repository,
                              M mapper,
                              IV inputValidator
                             ) {
        super(inputValidator, mapper, repository);
    }

    @Override
    protected E action(E source) {
        return find(source);
    }
}
