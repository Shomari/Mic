package social.mic.serviceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import social.mic.dao.SystemDao;
import social.mic.service.SystemService;
import social.mic.model.System;

@Service
public class SystemServiceImpl implements SystemService {

	@Autowired
	private SystemDao systemDao;

	@Transactional
	public List<System> getAllSystems() {
		return systemDao.getAllSystems();
		
	}

}
