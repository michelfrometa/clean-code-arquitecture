package mskm.cleancode.application.usecase.user.create;

import mskm.cleancode.application.dto.user.CreateUserDto;
import mskm.cleancode.application.dto.user.UserDto;
import mskm.cleancode.application.usecase.CrudUseCase;
import mskm.cleancode.domain.user.IUserRepository;
import mskm.cleancode.domain.user.User;
import org.springframework.stereotype.Service;

@Service
public class CreateUserUseCase extends CrudUseCase<UserDto, User, IUserRepository, CreateUserDto, Long, ICreateUserMapper, ICreateUserValidator> {
    private IUserRepository repository;
    private ICreateUserMapper mapper;
    private ICreateUserValidator validator;

    public CreateUserUseCase(IUserRepository repository,
                             ICreateUserMapper mapper,
                             ICreateUserValidator validator) {
        super(repository, mapper, validator);
    }


}
