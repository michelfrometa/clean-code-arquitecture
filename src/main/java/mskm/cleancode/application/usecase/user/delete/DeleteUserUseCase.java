package mskm.cleancode.application.usecase.user.delete;

import mskm.cleancode.application.usecase.AbstractCreateUseCase;
import mskm.cleancode.domain.user.IUserRepository;
import mskm.cleancode.domain.user.User;
import mskm.cleancode.presentation.dto.user.GetUserDto;
import mskm.cleancode.presentation.dto.user.UserDto;
import org.springframework.stereotype.Service;

@Service
public class DeleteUserUseCase extends AbstractCreateUseCase<GetUserDto, UserDto, User, Long, IUserRepository, IDeleteUserMapper, IDeleteUserValidator> {

    public DeleteUserUseCase(IUserRepository repository,
                             IDeleteUserMapper mapper,
                             IDeleteUserValidator validator) {
        super(repository, mapper, validator);
    }

}
