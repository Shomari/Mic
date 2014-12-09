package social.mic.controller;

import java.io.Console;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import social.mic.model.User;
import social.mic.model.System;
import social.mic.model.UserSystem;
import social.mic.service.SystemService;
import social.mic.service.UserService;
import social.mic.service.UserSystemService;


@Controller
public class UserController {
	
	@Autowired
	private UserService userService;
	
	@Autowired
	private SystemService systemService;
	
	@Autowired
	private UserSystemService userSystemService;
	
	@RequestMapping("/player")
	public ModelAndView showPlayers(){
		User user = new User();
		ModelAndView mvc = new ModelAndView("player", "playersList", userService.getAllUser());
		mvc.addObject("player", user);
		return mvc;
	}
	
	@RequestMapping("/gtag")
	public ModelAndView showGameTags(){
		ModelAndView mvc = new ModelAndView("gtag", "gtagList", userService.getAllGtag());
		return mvc;
	}
	
	@RequestMapping("/users")
	public ModelAndView createAccount(){
		User user = new User();	
		return new ModelAndView("CreateAccount", "user", user);		
	}
	
	@RequestMapping(value = "/users", method=RequestMethod.POST)
	public ModelAndView firstCreate(@ModelAttribute("user") User user, HttpSession session){
		User user1 = userService.findUserByName(user.getEmail());
		if(user1!=null){
			String message = "This account already exsists!";
			return new ModelAndView("CreateAccount", "message", message);
		}
		
		userService.addUser(user);		
		session.setAttribute("user", user);
		ModelAndView mvc = new ModelAndView("UserSystem","user", user);
		UserSystem userSystem = new UserSystem();
		mvc.addObject(userSystem);
		return mvc;
	}
	
	@RequestMapping(value= "/systems", method=RequestMethod.POST)
	public ModelAndView secondCreate(HttpServletRequest request, HttpSession session){
		String[] param = new String[]{"XB1", "XB360", "PS4", "PS3"};
		List<System> list = systemService.getAllSystems();	
		
		User user = (User)session.getAttribute("user");
		
		for(int i=0; i < param.length; i++){
			java.lang.System.out.println(request.getParameter(param[i]));
			if(request.getParameter(param[i]) != null){
				java.lang.System.out.println("inside if loop");
				System system = list.get(i);
				UserSystem userSystem = new UserSystem();
				userSystem.setUser(user);
				userSystem.setSystem(system);
				if(i<2){
					userSystem.setGamertag(request.getParameter("XBL"));									
				}else{
					userSystem.setGamertag(request.getParameter("PSN"));
				}
				userSystemService.addUserSystem(userSystem);
			}
		}			
		
		return new ModelAndView("index");		
	}
	
	
	@RequestMapping("/login")
	public ModelAndView loginpage(){
		User user = new User();
		ModelAndView mvc = new ModelAndView("loginPage");
		mvc.addObject("player", user);
		return mvc;
		
	}

	
	@RequestMapping(value="/session",method = RequestMethod.POST)
	public ModelAndView setSession(){
		return null;
		
	}
	

}
