package com.nikeshjourney.ps.api.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.nikeshjourney.ps.api.entity.Player;
import com.nikeshjourney.ps.api.repository.PlayerRepository;

@Service
public class PlayerService {
	
	@Autowired
	private PlayerRepository repository;
	
	
	public Player savePlayer(Player player) {
		return repository.save(player);
	}

}
