package mskm.cleancode.application.usecase.user.impl;

import lombok.RequiredArgsConstructor;
import mskm.cleancode.application.dto.user.CreateUserDto;
import mskm.cleancode.application.dto.user.UserDto;
import mskm.cleancode.application.usecase.user.IUserUseCaseService;
import mskm.cleancode.application.usecase.user.create.ICreateUserUseCase;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class UserUserCaseServiceImpl implements IUserUseCaseService {
    private final ICreateUserUseCase createUserUseCase;

    @Override
    public UserDto create(CreateUserDto dto) {
        return createUserUseCase.execute(dto);
    }
}
