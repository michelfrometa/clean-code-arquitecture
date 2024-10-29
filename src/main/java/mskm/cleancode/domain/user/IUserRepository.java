package mskm.cleancode.domain.user;

import mskm.cleancode.infraestructure.persistence.IPersistenceService;

import java.util.Optional;

public interface IUserRepository extends IPersistenceService<User, Long> {

    Optional<User> findByUsername(String username);
}
