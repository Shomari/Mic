package social.mic.daoImpl;

import java.util.List;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import social.mic.dao.PlayerDao;
import social.mic.model.Player;

@Repository
public class PlayerDaoImpl implements PlayerDao {
	
	@Autowired
	private SessionFactory sessionFactory;

	@SuppressWarnings("unchecked")
	@Override
	public List<Player> getAllPlayer() {
		return sessionFactory.getCurrentSession().createQuery("from Player").list();
		
	}

}
