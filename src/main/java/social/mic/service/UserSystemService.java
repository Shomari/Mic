package social.mic.service;

import social.mic.model.User;
import social.mic.model.UserSystem;
import social.mic.model.System;


public interface UserSystemService {

	public void addUserSystem(UserSystem userSystem);
	public UserSystem getUserSystem(User user, System system);
}
