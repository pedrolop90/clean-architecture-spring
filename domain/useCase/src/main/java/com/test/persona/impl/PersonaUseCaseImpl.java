package com.test.persona.impl;

import com.test.persona.PersonaModel;
import com.test.persona.PersonaUseCase;
import com.test.persona.gateway.PersonaGateway;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author pedro
 */
@Service
@RequiredArgsConstructor
public class PersonaUseCaseImpl implements PersonaUseCase {

    private final PersonaGateway personaGateway;

    @Override
    public List<PersonaModel> findAll() {
        return personaGateway.findAll();
    }
}
