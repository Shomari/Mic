package social.mic.service;

import java.util.List;

import social.mic.model.GameSession;
import social.mic.model.SystemsGame;
import social.mic.model.UserSystem;

public interface GameSessionService {
	
	public void add(UserSystem userSystem, SystemsGame systemGame);
	public List<GameSession> getRequestedSessions(SystemsGame systemsGame);

}
