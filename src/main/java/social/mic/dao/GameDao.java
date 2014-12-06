package social.mic.dao;

import java.util.List;

import social.mic.model.Game;


public interface GameDao {
	public void add(Game game);
	public void edit(Game game);
	public void delete(int game_id);
	public Game getGame(int game_id);
	public List getAllGame();
	public List getGameSystem();

}
