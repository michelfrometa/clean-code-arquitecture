package mskm.cleancode.application.usecase.user.delete;

import mskm.cleancode.application.usecase.AbstractDeleteUseCase;
import mskm.cleancode.domain.user.IUserRepository;
import mskm.cleancode.domain.user.User;
import mskm.cleancode.presentation.dto.user.GetUserDto;
import mskm.cleancode.presentation.dto.user.UserDto;
import org.springframework.stereotype.Service;

@Service
public class DeleteUserUseCase extends AbstractDeleteUseCase<GetUserDto, UserDto, User, Long, IUserRepository, IDeleteUserMapper, DeleteUserValidator> {

    public DeleteUserUseCase(IUserRepository repository,
                             IDeleteUserMapper mapper,
                             DeleteUserValidator inputValidator) {
        super(repository, mapper, inputValidator);
    }
}
