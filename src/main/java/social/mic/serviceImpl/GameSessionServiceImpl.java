package social.mic.serviceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import social.mic.dao.GameSessionDao;
import social.mic.model.GameSession;
import social.mic.model.SystemsGame;
import social.mic.model.UserSystem;
import social.mic.service.GameSessionService;

@Service
public class GameSessionServiceImpl implements GameSessionService {
	
	@Autowired
	GameSessionDao gameSessionDao;

	@Transactional
	public void add(UserSystem userSystem, SystemsGame systemGame) {
		gameSessionDao.add(userSystem, systemGame);
		
	}

	@Transactional
	public List<GameSession> getRequestedSessions(SystemsGame systemsGame) {
		return gameSessionDao.getRequestedSessions(systemsGame);
	}

}
