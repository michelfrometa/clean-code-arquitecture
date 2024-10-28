package mskm.cleancode.application.exceptions;

import lombok.Getter;
import lombok.RequiredArgsConstructor;
import mskm.cleancode.application.validator.VALIDATION_ERROR;

import java.io.Serial;

@Getter
@RequiredArgsConstructor
public class InvalidEntityException extends RuntimeException {

    @Serial
    private static final long serialVersionUID = 7111215781378668614L;

    private final VALIDATION_ERROR validationError;
    ;

}
