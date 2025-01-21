package mskm.cleancode.application.usecase.user;

import mskm.cleancode.presentation.dto.user.CreateUserDto;
import mskm.cleancode.presentation.dto.user.GetUserDto;
import mskm.cleancode.presentation.dto.user.UpdateUserDto;
import mskm.cleancode.presentation.dto.user.UserDto;

import java.util.List;

public interface IUserUseCaseService {

    List<UserDto> filter(GetUserDto dto);

    UserDto get(GetUserDto dto);

    UserDto create(CreateUserDto dto);

    UserDto update(UpdateUserDto dto);

    UserDto delete(GetUserDto dto);

}
