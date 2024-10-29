package mskm.cleancode.application.usecase.user.create;

import mskm.cleancode.application.usecase.AbstractCreateUseCase;
import mskm.cleancode.domain.user.IUserRepository;
import mskm.cleancode.domain.user.User;
import mskm.cleancode.presentation.dto.user.CreateUserDto;
import mskm.cleancode.presentation.dto.user.UserDto;
import org.springframework.stereotype.Service;

@Service
public class CreateUserUseCase extends AbstractCreateUseCase<CreateUserDto, UserDto, User, Long, IUserRepository, ICreateUserMapper, ICreateUserValidator> {



    public CreateUserUseCase(IUserRepository repository,
                             ICreateUserMapper mapper,
                             ICreateUserValidator validator) {
        super(repository, mapper, validator);
    }

}
