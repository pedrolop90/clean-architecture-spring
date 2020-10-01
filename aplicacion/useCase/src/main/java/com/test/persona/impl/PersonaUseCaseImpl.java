package com.test.persona.impl;

import com.test.persona.PersonaGateway;
import com.test.persona.PersonaModel;
import com.test.persona.PersonaUseCase;
import lombok.NoArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author pedro
 */
@Service
@NoArgsConstructor
public class PersonaUseCaseImpl implements PersonaUseCase {

    private PersonaGateway personaGateway;

    public PersonaUseCaseImpl(PersonaGateway personaGateway) {
        this.personaGateway = personaGateway;
    }

    @Override
    public List<PersonaModel> findAll() {
        return personaGateway.findAll();
    }
}
