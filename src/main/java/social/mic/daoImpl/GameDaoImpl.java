package social.mic.daoImpl;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import social.mic.dao.GameDao;
import social.mic.model.Game;

@Repository
public class GameDaoImpl implements GameDao {
	
	public Game game;
	
	@Autowired
	private SessionFactory sessionFactory;

	@Override
	public void add(Game game) {
		sessionFactory.getCurrentSession().save(game);		
	}

	@Override
	public void edit(Game game) {
		sessionFactory.getCurrentSession().update(game);
		
	}

	@Override
	public void delete(int game_id) {
		sessionFactory.getCurrentSession().delete(getGame(game_id));
		
	}
	
	@Override
	public Game getGame(int game_id) {
		return (Game)sessionFactory.getCurrentSession().get(Game.class, game_id);
	}


	@Override
	public List getAllGame() {
		return sessionFactory.getCurrentSession().createQuery("from Game").list();
		
	}
	





}
