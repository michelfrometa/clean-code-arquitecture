package mskm.cleancode.application.usecase.user;

import mskm.cleancode.presentation.dto.user.CreateUserDto;
import mskm.cleancode.presentation.dto.user.UserDto;

public interface IUserUseCaseService {

    UserDto create(CreateUserDto dto);

}
