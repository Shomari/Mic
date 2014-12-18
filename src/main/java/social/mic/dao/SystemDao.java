package social.mic.dao;

import java.util.List;
import social.mic.model.System;

public interface SystemDao {

	public List<System> getAllSystems();
	public System findSystemByName(String system);
}
