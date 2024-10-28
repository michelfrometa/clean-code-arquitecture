package mskm.cleancode.application.usecase.user.create.impl;

import lombok.RequiredArgsConstructor;
import mskm.cleancode.application.dto.user.CreateUserDto;
import mskm.cleancode.application.dto.user.UserDto;
import mskm.cleancode.application.usecase.user.create.ICreateUserUseCase;
import mskm.cleancode.application.usecase.user.mapper.IUserMapper;
import mskm.cleancode.application.validator.user.IUserValidator;
import mskm.cleancode.domain.user.IUserRepository;
import org.springframework.stereotype.Service;

import java.util.Optional;

@RequiredArgsConstructor
@Service
public class CreateUserUseCase implements ICreateUserUseCase {
    private final IUserRepository repository;
    private final IUserMapper mapper;
    private final IUserValidator validator;

    @Override
    public UserDto execute(CreateUserDto inputDto) {
        return Optional.of(inputDto)
                .map(validator::validate)
                .map(mapper::toEntity)
                .map(repository::save)
                .map(mapper::toDto)
                .orElse(null);
    }
}
