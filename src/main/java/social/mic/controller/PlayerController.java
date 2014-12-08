package social.mic.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import social.mic.model.Player;
import social.mic.service.PlayerService;


@Controller
public class PlayerController {
	
	@Autowired
	private PlayerService playerService;
	
	@RequestMapping("/player")
	public ModelAndView showPlayers(){
		Player player = new Player();
		ModelAndView mvc = new ModelAndView("player", "playersList", playerService.getAllPlayer());
		mvc.addObject("player", player);
		return mvc;
	}
	
	@RequestMapping("/gtag")
	public ModelAndView showGameTags(){
		ModelAndView mvc = new ModelAndView("gtag", "gtagList", playerService.getAllGtag());
		return mvc;
	}
	

}
