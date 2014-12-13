package social.mic.controller;

import java.util.Enumeration;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import social.mic.model.Game;
import social.mic.model.System;
import social.mic.model.User;
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
	
	@RequestMapping(value="/session",method = RequestMethod.POST)
	public ModelAndView setSession(HttpServletRequest request){
		java.lang.System.out.println("/session");
		String email = request.getParameter("email");
		String password = request.getParameter("password");
		String message = "Invalid username or password";	
		
		User user = userService.findUserByName(email);
		if(user==null){
			java.lang.System.out.println("user null");
			return new ModelAndView("redirect:/", "message", message);
		}
		if(!user.getPassword().equals(password)){
			java.lang.System.out.println(user.getPassword());
			java.lang.System.out.println(password);
			java.lang.System.out.println("password don't match");
			return new ModelAndView("redirect:/", "message", message);
		}
		
		List<System> systems = systemService.getAllSystems();
		System xb1 = systems.get(0);
		System xb360 = systems.get(1);
		System ps4 = systems.get(2);
		System ps3 = systems.get(3);
		
		System system = new System();
		Game game = new Game();
		
		ModelAndView mvc = new ModelAndView("player");
		mvc.addObject("xb1", xb1.getGame());
		mvc.addObject("xb360", xb360.getGame());
		mvc.addObject("ps4", ps4.getGame());
		mvc.addObject("ps3", ps3.getGame());
		mvc.addObject("systems", systems);
		mvc.addObject("system", system);
		mvc.addObject("game", game);
		
		return mvc;		
	}	
	
	@RequestMapping(value = "/users", method=RequestMethod.POST)
	public ModelAndView firstCreate(@ModelAttribute("user") User user, HttpSession session){
		java.lang.System.out.println("/users");
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
		java.lang.System.out.println("/systems");
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
	
	@RequestMapping("/online")
	public void Online(HttpServletRequest request){
		java.lang.System.out.println("in what you want");
		//java.lang.System.out.println(request.getHeaderNames().toString());
		java.lang.System.out.println(request.getParameter("Xbox One"));
		
		
		
	}
	
	
	@RequestMapping("/login")
	public ModelAndView loginpage(){
		java.lang.System.out.println("/login");
		User user = new User();
		ModelAndView mvc = new ModelAndView("loginPage");
		mvc.addObject("player", user);
		return mvc;
		
	}

	


}
