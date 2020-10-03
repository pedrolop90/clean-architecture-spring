package com.test.persona;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @author pedro
 */
@RestController
@RequestMapping("/persona")
@RequiredArgsConstructor
public class PersonaController {

    private final PersonaUseCase personaUseCase;
    private final PersonaDtoMapper personaDtoMapper;


    @GetMapping()
    public List<PersonaDto> findAll() {
        List<PersonaModel> personaModels = personaUseCase.findAll();
        return personaDtoMapper.personaModelToPersonaDto(personaModels);
    }

}
