package social.mic.daoImpl;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.SessionFactory;
import org.hibernate.criterion.Restrictions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import social.mic.dao.SystemDao;
import social.mic.model.System;

@Repository
public class SystemDaoImpl implements SystemDao {
	
	@Autowired
	private SessionFactory sessionFactory;

	@SuppressWarnings("unchecked")
	@Override
	public List<System> getAllSystems() {
		return sessionFactory.getCurrentSession().createQuery("from System").list();
		
	}

	@Override
	public System findSystemByName(String system) {
		Criteria criteria = sessionFactory.getCurrentSession().createCriteria(System.class);
		criteria.add(Restrictions.eq("name", system));
		return (System) criteria.uniqueResult();
		
	}

}
