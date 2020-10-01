package com.test.persona;

import lombok.NoArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @author pedro
 */
@RestController
@RequestMapping("/persona")
@NoArgsConstructor
public class PersonaController {

    private PersonaUseCase personaUseCase;
    private PersonaDtoMapper personaDtoMapper;

    public PersonaController(PersonaUseCase personaUseCase,
                             PersonaDtoMapper personaDtoMapper) {
        this.personaUseCase = personaUseCase;
        this.personaDtoMapper = personaDtoMapper;
    }

    @GetMapping()
    public List<PersonaDto> findAll() {
        List<PersonaModel> personaModels = personaUseCase.findAll();
        return personaDtoMapper.personaModelToPersonaDto(personaModels);
    }

}
