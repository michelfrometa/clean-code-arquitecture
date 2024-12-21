package mskm.cleancode.application.usecase.user;

import lombok.RequiredArgsConstructor;
import mskm.cleancode.application.usecase.user.create.CreateUserUseCase;
import mskm.cleancode.application.usecase.user.delete.DeleteUserUseCase;
import mskm.cleancode.application.usecase.user.get.GetUserUseCase;
import mskm.cleancode.application.usecase.user.update.UpdateUserUseCase;
import mskm.cleancode.presentation.dto.user.CreateUserDto;
import mskm.cleancode.presentation.dto.user.GetUserDto;
import mskm.cleancode.presentation.dto.user.UpdateUserDto;
import mskm.cleancode.presentation.dto.user.UserDto;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class UserUseCaseService implements IUserUseCaseService {

    private final GetUserUseCase getUserUseCase;
    private final CreateUserUseCase createUserUseCase;
    private final UpdateUserUseCase updateUserUseCase;
    private final DeleteUserUseCase deleteUserUseCase;


    @Override
    public UserDto get(GetUserDto dto) {
        return getUserUseCase.execute(dto);
    }

    @Override
    public UserDto create(CreateUserDto dto) {
        return createUserUseCase.execute(dto);
    }

    @Override
    public UserDto update(UpdateUserDto dto) {
        return updateUserUseCase.execute(dto);
    }

    @Override
    public UserDto delete(GetUserDto dto) {
        return deleteUserUseCase.execute(dto);
    }
}
