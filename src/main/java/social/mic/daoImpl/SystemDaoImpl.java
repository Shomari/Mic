package social.mic.daoImpl;

import java.util.List;

import org.hibernate.SessionFactory;
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

}
