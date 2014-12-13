package social.mic.dao;

import java.util.List;

import social.mic.model.GameSession;

public interface SessionDao {

	public void add(GameSession session);
	public List<GameSession> getRequestedSessions();
}
