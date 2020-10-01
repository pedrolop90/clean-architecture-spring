package com.test.persona;

import com.google.common.collect.Streams;
import lombok.NoArgsConstructor;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.stream.Collectors;

/**
 * @author pedro
 */
@Repository
@NoArgsConstructor
public class PersonaAdapter implements PersonaGateway {

    private PersonaDao personaDao;
    private PersonaEntityMapper personaEntityMapper;

    public PersonaAdapter(PersonaDao personaDao,
                          PersonaEntityMapper personaEntityMapper) {
        this.personaDao = personaDao;
        this.personaEntityMapper = personaEntityMapper;
    }

    @Override
    public List<PersonaModel> findAll() {
        List<PersonaEntity> personaEntities = Streams
                .stream(personaDao.findAll())
                .collect(Collectors.toList());
        return personaEntityMapper.personaEntityToPersonaModel(personaEntities);
    }
}
