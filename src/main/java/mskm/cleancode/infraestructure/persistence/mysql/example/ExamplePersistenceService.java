package mskm.cleancode.infraestructure.persistence.mysql.example;

import mskm.cleancode.domain.example.Example;
import mskm.cleancode.infraestructure.persistence.IDomainModelPersistenceModelMapper;
import mskm.cleancode.infraestructure.persistence.mysql.MysqlPersistenceService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional
public class ExamplePersistenceService extends MysqlPersistenceService<Example, Long, mskm.cleancode.infraestructure.persistence.mysql.example.Example,
        IExampleRepositoryMysql> {
    private final IDomainModelPersistenceModelMapper<Example, mskm.cleancode.infraestructure.persistence.mysql.example.Example> mapper;
    private final IExampleRepositoryMysql jpaRepository;

    public ExamplePersistenceService(IExampleRepositoryMysql jpaRepository,
                                     IDomainModelPersistenceModelMapper<Example, mskm.cleancode.infraestructure.persistence.mysql.example.Example> mapper) {
        super(jpaRepository, mapper);
        this.jpaRepository = jpaRepository;
        this.mapper = mapper;
    }

}
