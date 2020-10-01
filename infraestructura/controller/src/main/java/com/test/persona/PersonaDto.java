package com.test.persona;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.Data;

/**
 * @author pedro
 */
@Data
@JsonIgnoreProperties(ignoreUnknown = true)
public class PersonaDto {

    private Long id;
    private String nombre;

}
