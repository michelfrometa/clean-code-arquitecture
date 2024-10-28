package mskm.cleancode.infraestructure.persistence.mysql.user;

import org.springframework.context.annotation.Primary;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
@Primary
public interface IUserRepositoryMysql extends JpaRepository<User, Long> {

    User findByUsername(String username);
}
