package mskm.cleancode.application.usecase.user;

import mskm.cleancode.application.dto.user.CreateUserDto;
import mskm.cleancode.application.dto.user.UserDto;

public interface IUserUseCaseService {

    UserDto create(CreateUserDto dto);

}
