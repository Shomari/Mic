package social.mic.daoImpl;

import org.hibernate.Criteria;
import org.hibernate.SessionFactory;
import org.hibernate.criterion.Restrictions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import social.mic.dao.UserSystemDao;
import social.mic.model.System;
import social.mic.model.User;
import social.mic.model.UserSystem;

@Repository
public class UserSystemDaoImpl implements UserSystemDao {
	
	@Autowired
	private SessionFactory sessionFactory;

	@Override
	public void addUserSystem(UserSystem userSystem) {
		sessionFactory.getCurrentSession().save(userSystem);		
	}

	@Override
	public UserSystem getUserSystem(User user, System system) {
		
		Criteria criteria = sessionFactory.getCurrentSession().createCriteria(UserSystem.class);
		criteria.add(Restrictions.eq("user", user));
		criteria.add(Restrictions.eq("system", system));
		return (UserSystem) criteria.uniqueResult();	

	}

}
