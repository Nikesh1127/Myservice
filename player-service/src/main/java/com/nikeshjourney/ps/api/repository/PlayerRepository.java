package com.nikeshjourney.ps.api.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.nikeshjourney.ps.api.entity.Player;

public interface PlayerRepository extends JpaRepository<Player, Integer>{ 
	
	

}
