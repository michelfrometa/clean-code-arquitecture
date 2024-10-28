package mskm.cleancode.application.usecase.user.mapper;

import mskm.cleancode.application.dto.user.CreateUserDto;
import mskm.cleancode.application.dto.user.UserDto;
import mskm.cleancode.application.mapper.GeneratedMapper;
import mskm.cleancode.application.mapper.IEntityMapper;
import mskm.cleancode.domain.user.User;
import org.mapstruct.AnnotateWith;
import org.mapstruct.Mapper;
import org.mapstruct.MappingConstants;
import org.mapstruct.ReportingPolicy;

@AnnotateWith(GeneratedMapper.class)
@Mapper(unmappedTargetPolicy = ReportingPolicy.IGNORE, componentModel = MappingConstants.ComponentModel.SPRING)
public interface IUserMapper extends IEntityMapper<UserDto, User> {

    User toEntity(CreateUserDto entity);

}
