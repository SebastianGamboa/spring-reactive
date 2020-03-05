package com.sgb.reactivespring.repositories;

import com.sgb.reactivespring.entities.Note;

import org.springframework.data.repository.reactive.ReactiveCrudRepository;

/**
 * NoteRepository
 * @author Sebastián Gamboa
 */
public interface NoteRepository extends ReactiveCrudRepository<Note, Long> {

}