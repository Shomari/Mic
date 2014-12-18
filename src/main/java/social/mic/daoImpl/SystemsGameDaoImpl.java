package social.mic.daoImpl;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import social.mic.dao.SystemsGameDao;
import social.mic.model.SystemsGame;

@Repository
public class SystemsGameDaoImpl implements SystemsGameDao {
	
	@Autowired
	private SessionFactory sessionFactory;

	@Override
	public SystemsGame findSystemsGameById(int id) {
		java.lang.System.out.println("dao" + id);
		return (SystemsGame) sessionFactory.getCurrentSession().get(SystemsGame.class, id);
	
	}

}
