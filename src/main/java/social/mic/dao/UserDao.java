package social.mic.dao;

import java.util.List;

import social.mic.model.User;
import social.mic.model.UserSystem;

public interface UserDao {
	
	public List<User> getAllUser();
	public List<UserSystem> getAllGtag();
	public User findUserByName(String username);
	public void addUser(User user);

}
