package social.mic.serviceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import social.mic.dao.GameDao;
import social.mic.model.Game;
import social.mic.model.System;

import social.mic.service.GameService;

@Service
public class GameServiceImpl implements GameService {
	
	@Autowired
	private GameDao gameDao;

	@Transactional
	public void add(Game game) {
		gameDao.add(game);
		
	}

	@Transactional
	public void edit(Game game) {
		gameDao.edit(game);
		
	}

	@Transactional
	public void delete(int game_id) {
		gameDao.delete(game_id);
		
	}

	@Transactional
	public List getAllGame() {
		return gameDao.getAllGame();
	}

	@Transactional
	public Game getGame(int game_id) {
		return gameDao.getGame(game_id);
	}



	
	


}
