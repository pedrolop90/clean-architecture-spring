package com.test.persona;

import org.mapstruct.Mapper;

import java.util.List;

/**
 * @author pedro
 */
@Mapper(componentModel = "spring")
public interface PersonaEntityMapper {

    PersonaModel personaEntityToPersonaModel(PersonaEntity personaEntity);

    PersonaEntity personaModelToPersonaEntity(PersonaModel personaModel);

    List<PersonaModel> personaEntityToPersonaModel(List<PersonaEntity> personaEntity);
}
