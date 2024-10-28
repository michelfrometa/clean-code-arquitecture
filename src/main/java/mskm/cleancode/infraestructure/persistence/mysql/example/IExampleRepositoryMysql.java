package mskm.cleancode.infraestructure.persistence.mysql.example;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IExampleRepositoryMysql extends JpaRepository<Example, Long> {
}
