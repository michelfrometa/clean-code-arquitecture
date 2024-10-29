package mskm.cleancode.application.usecase.user.create;

import mskm.cleancode.application.validator.IValidator;
import mskm.cleancode.presentation.dto.user.CreateUserDto;
import org.springframework.stereotype.Component;

@Component
public class ICreateUserValidator extends IValidator<CreateUserDto> {

}
