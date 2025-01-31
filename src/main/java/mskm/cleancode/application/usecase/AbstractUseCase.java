package mskm.cleancode.application.usecase;

import jakarta.persistence.EntityNotFoundException;
import lombok.AllArgsConstructor;
import lombok.experimental.SuperBuilder;
import mskm.cleancode.application.mapper.IEntityMapper;
import mskm.cleancode.application.validator.IValidator;
import mskm.cleancode.domain.BaseEntity;
import mskm.cleancode.infraestructure.persistence.IPersistenceService;

import java.util.Optional;

/**
 * @param <I>  the input dto type
 * @param <O>  the output dto type
 * @param <E>  the domain entity type parameter.
 * @param <ID> the type of the entity's id
 * @param <R>  the repository type
 * @param <M>  the mapper type
 * @param <IV> the input´s dto validator type
 */
@AllArgsConstructor
@SuperBuilder
public abstract class AbstractUseCase<I, O, E extends BaseEntity<ID>, ID, M extends IEntityMapper<I, O, E>,
        R extends IPersistenceService<E, ID>, IV extends IValidator<I>> implements IUseCase<I, O, E> {

    protected IV inputValidator;
    protected M mapper;
    protected R repository;

    public O execute(I input) {
        return Optional.of(input)
                .map(this::preValidate)
                .map(this::inputToEntity)
                .map(this::preAction)
                .map(this::action)
                .map(this::postAction)
                .map(this::entityToOutput)
                .orElse(null);
    }

    protected E postAction(E source) {
        return source;
    }

    protected E preAction(E source) {
        return source;
    }

    protected I preValidate(I source) {
        return inputValidator != null ? inputValidator.validate(source) : source;
    }

    protected E inputToEntity(I source) {
        return mapper.inputDtoToEntity(source);
    }

    protected O entityToOutput(E source) {
        return mapper.entityToDto(source);
    }

    protected E action(E source) {
        return source;
    }

    protected E find(E source) {
        return repository.findById(source.getId())
                .orElseThrow(() -> new EntityNotFoundException("Entity with id: " + source.getId() + " not found"));
    }
}
