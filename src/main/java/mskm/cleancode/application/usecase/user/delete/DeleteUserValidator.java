package mskm.cleancode.application.usecase.user.delete;

import mskm.cleancode.application.validator.IValidator;
import mskm.cleancode.presentation.dto.user.GetUserDto;
import org.springframework.stereotype.Component;

@Component
public class DeleteUserValidator extends IValidator<GetUserDto> {

}
