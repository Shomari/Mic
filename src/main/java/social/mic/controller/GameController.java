package social.mic.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import social.mic.service.GameService;

@Controller
public class GameController {
	
	@Autowired
	private GameService gameService;
	
	@RequestMapping("/")
	public ModelAndView showGames(){
		 ModelAndView mvc = new ModelAndView("index", "whateve", gameService.getAllGame());		 
		 return mvc;
		
	}
	
	@RequestMapping("/online")
	public ModelAndView online(){
		ModelAndView mvc = new ModelAndView("online", "hope", gameService.getGameSystem());
		return mvc;
	}
	
	
	//return modelandview (view name, varibal name for model, what the actual model is)

}