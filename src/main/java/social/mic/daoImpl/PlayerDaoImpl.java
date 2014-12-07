package social.mic.daoImpl;

import java.util.List;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import social.mic.dao.PlayerDao;
import social.mic.model.Player;
import social.mic.model.PlayerSystem;

@Repository
public class PlayerDaoImpl implements PlayerDao {
	
	@Autowired
	private SessionFactory sessionFactory;

	@SuppressWarnings("unchecked")
	@Override
	public List<Player> getAllPlayer() {
		return sessionFactory.getCurrentSession().createQuery("from Player").list();
		
	}

	@SuppressWarnings("unchecked")
	@Override
	public List<PlayerSystem> getAllGtag() {
		return sessionFactory.getCurrentSession().createQuery("SELECT P.gamerTag From PlayerSystem P").list();
	}

}
