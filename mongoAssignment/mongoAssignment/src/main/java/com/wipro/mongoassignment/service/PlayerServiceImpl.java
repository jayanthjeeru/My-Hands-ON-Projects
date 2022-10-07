package com.wipro.mongoassignment.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.wipro.mongoassignment.dao.PlayerDao;
import com.wipro.mongoassignment.model.Player;

@Service
public class PlayerServiceImpl implements PlayerService{

	@Autowired
	private PlayerDao playerDao;
	
	@Override
	public Player addPlayer(Player player) {
	
		return playerDao.save(player);
	}

	@Override
	public Optional<Player> getPlayerById(int id) {
		// TODO Auto-generated method stub
		return playerDao.findById(id);
	}

	@Override
	public List<Player> getAllPlayers() {
		// TODO Auto-generated method stub
		return playerDao.findAll();
	}

	@Override
	public Player updatePlayer(Player player) {
		// TODO Auto-generated method stub
		return playerDao.save(player);
	}

	@Override
	public void deletePlayerById(int id) {
		// TODO Auto-generated method stub
		playerDao.deleteById(id);
	}

}
