package social.mic.serviceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import social.mic.dao.PlayerDao;
import social.mic.model.Player;
import social.mic.model.PlayerSystem;
import social.mic.service.PlayerService;

@Service
public class PlayerServiceImpl implements PlayerService {
	
	@Autowired
	private PlayerDao playerDao;

	@Transactional
	public List<Player> getAllPlayer() {
		return playerDao.getAllPlayer();
	}

	@Transactional
	public List<PlayerSystem> getAllGtag() {
		return playerDao.getAllGtag();
	}

}
