package social.mic.serviceImpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import social.mic.dao.SystemsGameDao;
import social.mic.model.SystemsGame;
import social.mic.service.SystemsGameService;

@Service
public class SystemsGameServiceImpl implements SystemsGameService {
	
	@Autowired
	private SystemsGameDao systemsGameDao;
	
	@Transactional
	public SystemsGame findSystemsGameById(int id) {
		java.lang.System.out.println(id);
		return systemsGameDao.findSystemsGameById(id);
	}

}
