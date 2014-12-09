package social.mic.daoImpl;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.SessionFactory;
import org.hibernate.criterion.Restrictions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import social.mic.dao.UserDao;
import social.mic.model.User;
import social.mic.model.UserSystem;


@Repository
public class UserDaoImpl implements UserDao {
	
	@Autowired
	private SessionFactory sessionFactory;

	@SuppressWarnings("unchecked")
	@Override
	public List<User> getAllUser() {
		return sessionFactory.getCurrentSession().createQuery("from Player").list();
		
	}

	@SuppressWarnings("unchecked")
	@Override
	public List<UserSystem> getAllGtag() {
		return sessionFactory.getCurrentSession().createQuery("SELECT P.gamerTag From PlayerSystem P").list();
	}

	@Override
	public User findUserByName(String email) {
		Criteria criteria = sessionFactory.getCurrentSession().createCriteria(User.class);
		criteria.add(Restrictions.eq("email", email));
		return (User) criteria.uniqueResult();
	}

	@Override
	public void addUser(User user) {
		sessionFactory.getCurrentSession().save(user);
		
		
	}

}
