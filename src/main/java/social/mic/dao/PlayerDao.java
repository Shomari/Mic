package social.mic.dao;

import java.util.List;

import social.mic.model.Player;
import social.mic.model.PlayerSystem;

public interface PlayerDao {
	
	public List<Player> getAllPlayer();
	public List<PlayerSystem> getAllGtag();

}
