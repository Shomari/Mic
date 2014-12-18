package social.mic.daoImpl;

import java.util.Date;
import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.criterion.Restrictions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import social.mic.dao.GameSessionDao;
import social.mic.model.GameSession;
import social.mic.model.SystemsGame;
import social.mic.model.User;
import social.mic.model.UserSystem;

@Repository
public class GameSessionDaoImpl implements GameSessionDao {
	
	@Autowired
	private SessionFactory sessionFactory;



	@SuppressWarnings("unchecked")
	@Override
	public List<GameSession> getRequestedSessions(SystemsGame systemsGame) {		
		//return sessionFactory.getCurrentSession().createQuery("FROM GameSession").list();
		Date hourAgo = new Date(System.currentTimeMillis() - 3600 * 1000);
		Criteria criteria = sessionFactory.getCurrentSession().createCriteria(GameSession.class);
		criteria.add(Restrictions.eq("systemsGame", systemsGame));
		criteria.add(Restrictions.ge("created", hourAgo));
		return (List<GameSession>) criteria.list();
	}

	@Override
	public void add(UserSystem userSystem, SystemsGame systemsGame) {
		Session session =  sessionFactory.getCurrentSession();	
		
	
			GameSession gameSession = new GameSession();
			gameSession.setUserSystem(userSystem);
			java.lang.System.out.println(userSystem);
			gameSession.setSystemsGame(systemsGame);
			session.save(gameSession);
			
					
	}

}
