package com.test.persona;

import com.google.common.collect.Streams;
import com.test.persona.gateway.PersonaGateway;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.stream.Collectors;

/**
 * @author pedro
 */
@Repository
@RequiredArgsConstructor
public class PersonaAdapter implements PersonaGateway {

    private final PersonaDao personaDao;
    private final PersonaEntityMapper personaEntityMapper;

    @Override
    public List<PersonaModel> findAll() {
        List<PersonaEntity> personaEntities = Streams
                .stream(personaDao.findAll())
                .collect(Collectors.toList());
        return personaEntityMapper.personaEntityToPersonaModel(personaEntities);
    }
}
