package social.mic.serviceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import social.mic.dao.UserDao;
import social.mic.model.User;
import social.mic.model.UserSystem;
import social.mic.service.UserService;

@Service
public class UserServiceImpl implements UserService {
	
	@Autowired
	private UserDao userDao;

	@Transactional
	public List<User> getAllUser() {
		return userDao.getAllUser();
	}

	@Transactional
	public List<UserSystem> getAllGtag() {
		return userDao.getAllGtag();
	}

	@Transactional
	public void addUser(User user) {
		userDao.addUser(user);
		
	}

	@Transactional
	public User findUserByName(String username) {
		return userDao.findUserByName(username);
	}

}
