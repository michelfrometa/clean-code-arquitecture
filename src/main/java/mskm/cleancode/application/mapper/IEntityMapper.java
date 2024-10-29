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
 * @param <CD> - Custom DTO type parameter.
 * @param <D>  - General DTO type parameter(The one that contains all elements of the entity).
 * @param <E>  - Domain Entity type parameter.
 */
public interface IEntityMapper<CD, D, E> {

    E customDtoToEntity(CD source);

    E dtoToEntity(D source);

    D entityToDto(E source);

    List<E> dtoListToEntityList(List<D> source);

    List<D> entityListToDtoList(List<E> source);

    Set<E> dtoSetToEntitySet(Set<D> source);

    Set<D> entitySetToDtoSet(Set<E> source);

    @Named("partialUpdate")
    @BeanMapping(nullValuePropertyMappingStrategy = NullValuePropertyMappingStrategy.IGNORE)
    void partialUpdate(@MappingTarget E source, D dto);
}
