package mskm.cleancode.application.validator;

public abstract class IValidator<T> {
    /**
     * Validate the given object and return it if valid.
     *
     * @param target the object to validate
     * @return the same object if valid, null if not
     */
    public T validate(T target) {
        return target;
    }
}
