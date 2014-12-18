package social.mic.dao;

import java.util.List;

import social.mic.model.GameSession;
import social.mic.model.SystemsGame;
import social.mic.model.UserSystem;

public interface GameSessionDao {

	public void add(UserSystem userSystem, SystemsGame systemsGame);
	public List<GameSession> getRequestedSessions(SystemsGame systemsGame);
}
