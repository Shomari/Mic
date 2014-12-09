package social.mic.daoImpl;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import social.mic.dao.UserSystemDao;
import social.mic.model.UserSystem;

@Repository
public class UserSystemDaoImpl implements UserSystemDao {
	
	@Autowired
	private SessionFactory sessionFactory;

	@Override
	public void addUserSystem(UserSystem userSystem) {
		System.out.println("inAddUserSystem");
		sessionFactory.getCurrentSession().save(userSystem);		
	}

}
