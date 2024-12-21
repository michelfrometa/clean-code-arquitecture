package mskm.cleancode.application.usecase.user.update;

import mskm.cleancode.application.usecase.AbstractUpdateUseCase;
import mskm.cleancode.domain.user.IUserRepository;
import mskm.cleancode.domain.user.User;
import mskm.cleancode.presentation.dto.user.UpdateUserDto;
import mskm.cleancode.presentation.dto.user.UserDto;
import org.springframework.stereotype.Service;

@Service
public class UpdateUserUseCase extends AbstractUpdateUseCase<UpdateUserDto, UserDto, User, Long, IUserRepository, IUpdateUserMapper, UpdateUserValidator> {

    public UpdateUserUseCase(IUserRepository repository,
                             IUpdateUserMapper mapper,
                             UpdateUserValidator validator) {
        super(repository, mapper, validator);
    }
}
