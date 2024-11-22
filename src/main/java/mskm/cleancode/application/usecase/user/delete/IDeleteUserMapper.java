package mskm.cleancode.application.usecase.user.delete;

import mskm.cleancode.application.mapper.GeneratedMapper;
import mskm.cleancode.application.mapper.IEntityMapper;
import mskm.cleancode.domain.user.User;
import mskm.cleancode.presentation.dto.user.GetUserDto;
import mskm.cleancode.presentation.dto.user.UserDto;
import org.mapstruct.AnnotateWith;
import org.mapstruct.BeanMapping;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.MappingConstants;
import org.mapstruct.MappingTarget;
import org.mapstruct.Named;
import org.mapstruct.NullValuePropertyMappingStrategy;
import org.mapstruct.ReportingPolicy;

@AnnotateWith(GeneratedMapper.class)
@Mapper(unmappedTargetPolicy = ReportingPolicy.IGNORE, componentModel = MappingConstants.ComponentModel.SPRING)
public interface IDeleteUserMapper extends IEntityMapper<GetUserDto, UserDto, User> {

    @Named("partialUpdate")
    @BeanMapping(nullValuePropertyMappingStrategy = NullValuePropertyMappingStrategy.IGNORE)
    @Mapping(target = "authorities", ignore = true)
        // FIXME
    User partialUpdate(@MappingTarget User source, User dto);
}
