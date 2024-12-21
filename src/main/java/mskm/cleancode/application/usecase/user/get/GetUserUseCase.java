package mskm.cleancode.application.usecase.user.get;

import mskm.cleancode.application.usecase.AbstractCreateUseCase;
import mskm.cleancode.domain.user.IUserRepository;
import mskm.cleancode.domain.user.User;
import mskm.cleancode.presentation.dto.user.GetUserDto;
import mskm.cleancode.presentation.dto.user.UserDto;
import org.springframework.stereotype.Service;

@Service
public class GetUserUseCase extends AbstractCreateUseCase<GetUserDto, UserDto, User, Long, IUserRepository, IGetUserMapper, GetUserValidator> {

    public GetUserUseCase(IUserRepository repository,
                          IGetUserMapper mapper,
                          GetUserValidator validator) {
        super(repository, mapper, validator);
    }

}
