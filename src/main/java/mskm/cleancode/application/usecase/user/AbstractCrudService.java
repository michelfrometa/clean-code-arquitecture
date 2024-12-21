package mskm.cleancode.application.usecase.user;

public class AbstractCrudService<G, C, U, O> implements ICrudService<G, C, U, O> {


    @Override
    public O get(G dto) {
        return null;
    }

    @Override
    public O create(C dto) {
        return null;
    }

    @Override
    public O update(U dto) {
        return null;
    }

    @Override
    public O delete(G dto) {
        return null;
    }
}
