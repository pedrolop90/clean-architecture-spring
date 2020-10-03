package com.test.persona.gateway;

import com.test.persona.PersonaModel;

import java.util.List;

/**
 * @author pedro
 */
public interface PersonaGateway {

    List<PersonaModel> findAll();

}
