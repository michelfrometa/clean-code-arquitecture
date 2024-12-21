package mskm.cleancode.application.usecase.user;

public interface ICrudService<G, C, U, O> {

    O get(G dto);

    O create(C dto);

    O update(U dto);

    O delete(G dto);

}
