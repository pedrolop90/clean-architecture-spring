package com.test.persona;

import org.mapstruct.Mapper;

import java.util.List;

/**
 * @author pedro
 */
@Mapper(componentModel = "spring")
public interface PersonaDtoMapper {

    List<PersonaDto> personaModelToPersonaDto(List<PersonaModel> personaModels);

}
