package social.mic.serviceImpl;

import java.util.List;

import social.mic.model.GameSession;
import social.mic.service.SessionService;

public class SessionServiceImpl implements SessionService {

	@Override
	public void add(GameSession session) {
		sessionDao.add(session);
		
	}

	@Override
	public List<GameSession> getRequestedSessions() {
		
	}

}
