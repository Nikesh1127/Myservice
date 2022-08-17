package com.nikeshjourney.ps.api.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.nikeshjourney.ps.api.entity.Player;
import com.nikeshjourney.ps.api.service.PlayerService;

@RestController
@RequestMapping("/player")
public class PlayerController {
	
	@Autowired
	private PlayerService service;
	
	@PostMapping("/addPlayer")
	public Player addPlayer(@RequestBody Player player) {
		return service.savePlayer(player);
	}

}
