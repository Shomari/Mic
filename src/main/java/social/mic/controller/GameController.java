package social.mic.controller;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import social.mic.model.User;

@Controller
public class GameController {
	
	@RequestMapping("/")
	public ModelAndView showGames(){
		 User user = new User();
		 ModelAndView mvc = new ModelAndView("index", "player", user);		
		 return mvc;		
	}	

}
