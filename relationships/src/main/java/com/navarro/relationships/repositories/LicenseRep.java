package com.navarro.relationships.repositories;

import java.util.List;
import java.util.Optional;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;


import com.navarro.relationships.models.License;

@Repository
public interface LicenseRep extends CrudRepository<License, Long> {

    // this method retrieves all the books from the database
    List<License>findAll();
    // this method finds books with descriptions containing the search string
    List<License>findByNumberContaining(String search);
    // this method counts how many titles contain a certain string
    Long countByNumberContaining(String search);
    // this method deletes a book that starts with a specific title
    void deleteByNumberStartingWith(String search);
    // 
    Optional<License> findByPersonIdEquals(Long id);
}
