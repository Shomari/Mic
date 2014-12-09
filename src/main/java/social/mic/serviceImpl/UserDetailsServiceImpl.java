//package social.mic.serviceImpl;
//
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.security.core.userdetails.UserDetails;
//import org.springframework.security.core.userdetails.UserDetailsService;
//import org.springframework.security.core.userdetails.UsernameNotFoundException;
//import org.springframework.stereotype.Service;
//import org.springframework.transaction.annotation.Transactional;
//
//import social.mic.dao.PlayerDao;
//import social.mic.model.Player;
//
//@Service("userDetailsService")
//public class UserDetailsServiceImpl implements UserDetailsService {
//	
//	@Autowired
//	private PlayerDao playerDao;
//	
//	@Override
//	@Transactional(readOnly = true)
//	public UserDetails loadUserByUsername(String username)
//			throws UsernameNotFoundException {
//		Player player = playerDao.findPlayerByName(username);
//		
//		if (player!=null){
//			String password = player.getPassword();
//			org.springframework.security.core.userdetails.User securityUser = new
//					org.springframework.security.core.userdetails.User(username,password, null);
//			return securityUser;
//		}else{
//			throw new UsernameNotFoundException("Player Not Found!!!");
//		}
//	}
//
//}
