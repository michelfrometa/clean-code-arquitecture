package mskm.cleancode.application.usecase;

import mskm.cleancode.application.mapper.IEntityMapper;
import mskm.cleancode.application.validator.IValidator;
import mskm.cleancode.domain.BaseEntity;
import mskm.cleancode.infraestructure.persistence.IPersistenceService;

/**
 * Abstract class for a use case that encapsulates a create operations.
 *
 * @param <I>  the input dto type
 * @param <O>  the output dto type
 * @param <E>  the domain entity type parameter.
 * @param <ID> the type of the entity's id
 * @param <R>  the repository type
 * @param <M>  the mapper type
 * @param <IV> the input´s dto validator type
 */
public abstract class AbstractCreateUseCase<I, O, E extends BaseEntity<ID>, ID, R extends IPersistenceService<E, ID>,
        M extends IEntityMapper<I, O, E>, IV extends IValidator<I>> extends AbstractUseCase<I, O, E, ID, M, R, IV> {

    public AbstractCreateUseCase(R repository,
                                 M mapper,
                                 IV inputValidator
                                ) {
        super(inputValidator, mapper, repository);
    }

    @Override
    public E action(E source) {
        return repository.save(source);
    }
}
