package com.sgb.reactivespring.entities;

import org.springframework.data.annotation.Id;

import lombok.AllArgsConstructor;
import lombok.Data;

/**
 * Note
 * @author Sebastián Gamboa
 */
@Data
@AllArgsConstructor
public class Note {

    @Id
    private Long id;
    private String title;
    private String description;
}