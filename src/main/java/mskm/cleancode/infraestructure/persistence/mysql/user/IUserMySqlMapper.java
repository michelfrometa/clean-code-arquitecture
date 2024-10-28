package mskm.cleancode.infraestructure.persistence.mysql.user;

import mskm.cleancode.application.mapper.GeneratedMapper;
import mskm.cleancode.infraestructure.persistence.IDomainModelPersistenceModelMapper;
import org.mapstruct.AnnotateWith;
import org.mapstruct.Mapper;
import org.mapstruct.MappingConstants;
import org.mapstruct.ReportingPolicy;

@AnnotateWith(GeneratedMapper.class)
@Mapper(unmappedTargetPolicy = ReportingPolicy.IGNORE, componentModel = MappingConstants.ComponentModel.SPRING)
public interface IUserMySqlMapper extends IDomainModelPersistenceModelMapper<mskm.cleancode.domain.user.User, User> {

}
