package social.mic.service;

import java.util.List;

import social.mic.model.Player;
import social.mic.model.PlayerSystem;

public interface PlayerService {
	public List<Player> getAllPlayer();
	public List<PlayerSystem> getAllGtag();
}
