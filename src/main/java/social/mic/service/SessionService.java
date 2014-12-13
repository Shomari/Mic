package social.mic.service;

import java.util.List;

import social.mic.model.GameSession;

public interface SessionService {
	
	public void add(GameSession session);
	public List<GameSession> getRequestedSessions();

}
