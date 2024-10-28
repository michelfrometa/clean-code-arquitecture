package mskm.cleancode.application.usecase;

public interface IUseCase<I, O> {

    O execute(I source);
}
