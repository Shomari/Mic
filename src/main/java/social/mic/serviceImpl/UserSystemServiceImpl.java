package social.mic.serviceImpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import social.mic.dao.UserSystemDao;
import social.mic.model.User;
import social.mic.model.UserSystem;
import social.mic.model.System;
import social.mic.service.UserSystemService;

@Service
public class UserSystemServiceImpl implements UserSystemService {
	
	@Autowired
	private UserSystemDao userSystemDao;

	@Transactional
	public void addUserSystem(UserSystem userSystem) {
		userSystemDao.addUserSystem(userSystem);
		
	}

	@Transactional
	public UserSystem getUserSystem(User user, System system) {
		return userSystemDao.getUserSystem(user, system);
	}

}
