package com.navarro.lookify.repo;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.navarro.lookify.models.SongModel;

@Repository
public interface SongRepo extends CrudRepository<SongModel, Long> {
	// retrieves all the songs
	List<SongModel>findAll();
    // this method finds songs with descriptions containing the search string
    List<SongModel>findByArtistContaining(String search);
	// returns an array list that only gives 10 and are descending by rating
	List<SongModel> findTop10ByOrderByRatingDesc();
}