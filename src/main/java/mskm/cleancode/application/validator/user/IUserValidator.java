package mskm.cleancode.application.validator.user;


import mskm.cleancode.application.dto.user.CreateUserDto;
import mskm.cleancode.application.dto.user.UpdateUserDto;
import mskm.cleancode.application.validator.IValidator;

public interface IUserValidator extends IValidator<CreateUserDto> {

    UpdateUserDto validate(UpdateUserDto dto);

}
