package mskm.cleancode.application.usecase.user;

import mskm.cleancode.presentation.dto.user.CreateUserDto;
import mskm.cleancode.presentation.dto.user.GetUserDto;
import mskm.cleancode.presentation.dto.user.UpdateUserDto;
import mskm.cleancode.presentation.dto.user.UserDto;

public interface IUserUseCaseService {

    UserDto get(GetUserDto dto);
    UserDto create(CreateUserDto dto);

    UserDto update(UpdateUserDto dto);

    UserDto delete(GetUserDto dto);

}
