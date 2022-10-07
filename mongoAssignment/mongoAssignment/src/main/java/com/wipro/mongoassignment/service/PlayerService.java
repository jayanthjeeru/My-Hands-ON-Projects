package com.wipro.mongoassignment.service;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.wipro.mongoassignment.model.Player;

@Service
public interface PlayerService {
	
	public Player addPlayer(Player player);
	public Optional<Player> getPlayerById(int id);
	public List<Player> getAllPlayers();
	public Player updatePlayer(Player player);
	public void deletePlayerById(int id);
}
