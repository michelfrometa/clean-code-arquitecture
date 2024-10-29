package mskm.cleancode.application.usecase;

public interface IUseCase<I, O, E> {

    O execute(I source);

    default E action(E source) {
        return source;
    }
}
