package com.navarro.lookify.services;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;


import com.navarro.lookify.models.SongModel;
import com.navarro.lookify.repo.SongRepo;

@Service
public class SongService {
	private final SongRepo songRepo;
	
	public SongService(SongRepo songRepo) {
		this.songRepo = songRepo;
	}
	// GET
	// get all
	public List<SongModel> allSongs(){
		return songRepo.findAll();
	}
	// get one
	public SongModel findOne(Long id) {
		Optional<SongModel> optionalSong = songRepo.findById(id);
		if(optionalSong.isPresent()) {
			return optionalSong.get();
		}else {
			return null;
		}
	}
	// get by partial artist
	public List<SongModel> findMany(String art) {
		return songRepo.findByArtistContaining(art);
	}
	// POST
	public SongModel createSong(SongModel newSong) {
		return songRepo.save(newSong);
	}
	// PUT
	public SongModel update(SongModel newSong) {
		return songRepo.save(newSong);
	}
	// DELETE
	public void delete(Long id) {
		Optional<SongModel> deleteLang = songRepo.findById(id);
		if(deleteLang.isPresent()) {
			songRepo.deleteById(id);
		}
	}
}
