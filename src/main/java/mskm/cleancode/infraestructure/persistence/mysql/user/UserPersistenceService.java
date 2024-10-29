package mskm.cleancode.infraestructure.persistence.mysql.user;

import mskm.cleancode.domain.user.IUserRepository;
import mskm.cleancode.domain.user.User;
import mskm.cleancode.infraestructure.persistence.IDomainModelPersistenceModelMapper;
import mskm.cleancode.infraestructure.persistence.mysql.MysqlPersistenceService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.Optional;

@Service
@Transactional
public class UserPersistenceService extends MysqlPersistenceService<User, Long, mskm.cleancode.infraestructure.persistence.mysql.user.User,
        IUserRepositoryMysql> implements IUserRepository {

    public UserPersistenceService(IUserRepositoryMysql jpaRepository,
                                  IDomainModelPersistenceModelMapper<User, mskm.cleancode.infraestructure.persistence.mysql.user.User> mapper) {
        super(jpaRepository, mapper);
    }

    @Override
    public Optional<User> findByUsername(String username) {
        return Optional.of(username)
                .map(jpaRepository::findByUsername)
                .map(mapper::toEntity);
    }


}
