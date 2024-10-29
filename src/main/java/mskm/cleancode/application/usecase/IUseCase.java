package mskm.cleancode.application.usecase;


/**
 * The interface Use case.
 *
 * @param <I> the input dto type
 * @param <O> the output dto type
 * @param <E> the entity type
 */
public interface IUseCase<I, O, E> {

    O execute(I source);

}
