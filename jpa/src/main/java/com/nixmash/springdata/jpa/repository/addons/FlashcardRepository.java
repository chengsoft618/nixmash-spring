package com.nixmash.springdata.jpa.repository.addons;

import com.nixmash.springdata.jpa.model.addons.Flashcard;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

/**
 * Created by daveburke on 8/11/16.
 */
public interface FlashcardRepository extends CrudRepository<Flashcard, Long> {
    List<Flashcard> findAll();

    List<Flashcard> findByCategoryId(long categoryId);
}
