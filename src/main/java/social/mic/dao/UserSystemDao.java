package social.mic.dao;

import social.mic.model.User;
import social.mic.model.UserSystem;
import social.mic.model.System;

public interface UserSystemDao {
	
	public void addUserSystem(UserSystem userSystem);
	public UserSystem getUserSystem(User user, System system);

}
