package mskm.cleancode.application.mapper;

import org.mapstruct.BeanMapping;
import org.mapstruct.MappingTarget;
import org.mapstruct.Named;
import org.mapstruct.NullValuePropertyMappingStrategy;

import java.util.List;
import java.util.Set;

/**
 * Contract for an entity to a DTO mapper.
 *
 * @param <I>  the input dto type
 * @param <O>  the output dto type
 * @param <E>  - Domain Entity type parameter.
 */
public interface IEntityMapper<I, O, E> {

    E customDtoToEntity(I source);

    E dtoToEntity(O source);

    O entityToDto(E source);

    List<E> dtoListToEntityList(List<O> source);

    List<O> entityListToDtoList(List<E> source);

    Set<E> dtoSetToEntitySet(Set<O> source);

    Set<O> entitySetToDtoSet(Set<E> source);

    @Named("partialUpdate")
    @BeanMapping(nullValuePropertyMappingStrategy = NullValuePropertyMappingStrategy.IGNORE)
    E partialUpdate(@MappingTarget E source, E dto);
}
