package com.navarro.relationships.repositories;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;


import com.navarro.relationships.models.Person;

@Repository
public interface PersonRep extends CrudRepository<Person, Long> {

    // this method retrieves all the books from the database
    List<Person>findAll();
    // this method finds books with descriptions containing the search string
    List<Person>findByFirstNameContaining(String search);
    // this method counts how many titles contain a certain string
    Long countByFirstNameContaining(String search);
    // this method deletes a book that starts with a specific title
    void deleteByFirstNameStartingWith(String search);


}
