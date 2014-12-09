package social.mic.service;

import java.util.List;

import social.mic.model.User;
import social.mic.model.UserSystem;

public interface UserService {
	public List<User> getAllUser();
	public List<UserSystem> getAllGtag();
	public void addUser(User user);
	public User findUserByName(String username);
}
