package mskm.cleancode.application.usecase.user.create;

import mskm.cleancode.application.dto.user.CreateUserDto;
import mskm.cleancode.application.validator.IValidator;
import org.springframework.stereotype.Component;

@Component
public class ICreateUserValidator extends IValidator<CreateUserDto> {

}
