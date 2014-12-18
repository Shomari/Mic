package social.mic.service;

import java.util.List;
import social.mic.model.System;

public interface SystemService {
	
	public List<System> getAllSystems();
	public System findSystemByName(String system);
}
