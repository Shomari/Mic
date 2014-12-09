package social.mic.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import social.mic.model.User;
import social.mic.model.UserSystem;
import social.mic.service.UserService;


@Controller
public class UserController {
	
	@Autowired
	private UserService userService;
	
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
		System.out.println("in get users");
		return new ModelAndView("CreateAccount", "user", user);		
	}
	
	@RequestMapping(value = "/users", method=RequestMethod.POST)
	public ModelAndView firstCreate(@ModelAttribute("user") User user){
		User user1 = userService.findUserByName(user.getEmail());
		System.out.println("in post users");
		if(user1!=null){
			String message = "This account already exsists!";
			return new ModelAndView("CreateAccount", "message", message);
		}
		
		userService.addUser(user);		
		ModelAndView mvc = new ModelAndView("UserSystem","user", user);
		UserSystem userSystem = new UserSystem();
		mvc.addObject(userSystem);
		return mvc;
	}
	
	@RequestMapping("/login")
	public ModelAndView loginpage(){
		User user = new User();
		ModelAndView mvc = new ModelAndView("loginPage");
		mvc.addObject("player", user);
		return mvc;
		
	}
	
	//if the login creditials match, set a session
	//on the index page, if there is a session show the play now button
	//if there isn't a session, show the login button
	
	@RequestMapping(value="/session",method = RequestMethod.POST)
	public ModelAndView setSession(){
		return null;
		
	}
	

}
