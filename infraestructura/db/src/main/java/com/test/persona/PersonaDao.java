package com.test.persona;

import org.springframework.data.repository.CrudRepository;

/**
 * @author pedro
 */
public interface PersonaDao extends CrudRepository<PersonaEntity, Long> {
}
