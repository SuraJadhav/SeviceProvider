package com.project.controllers;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;  
import org.springframework.web.bind.annotation.RequestMapping;  
import org.springframework.web.bind.annotation.RequestMethod;  
import org.springframework.web.servlet.ModelAndView;
import com.project.dao.*;
import com.project.beans.*;
import com.project.beans.User;
import com.project.beans.Sercices;;
@Controller
public class UserController {
	@Autowired
	 UserDao dao;
	 @Autowired
	 ServiceProviderDao dao1;
	 
	 
	@RequestMapping("/user")  
	 public ModelAndView showform()
	 {
		System.out.println("come in user method");
		 return new ModelAndView("/UserPage");
	 }
	 
	 @RequestMapping("/userLogin")
	 public ModelAndView loginpage()
	 {
		 return new ModelAndView("/UserLogin","command",new User());
	 }
	 
	 @RequestMapping("/userRegister")
	 public ModelAndView registerPage()
	 {
		 return new ModelAndView("/UserRegister","command",new User());
	 }
	 @RequestMapping(value="/saveUser",method=RequestMethod.POST)
	 public ModelAndView saveUser(@ModelAttribute("User") User user)
	 {
		
		 dao.save(user);
		 return new ModelAndView("redirect:/userLogin");
	 }
	 @RequestMapping(value="/UserCheckLogin",method=RequestMethod.POST)
	 public ModelAndView loginUser(@ModelAttribute("user") User user)
	 {
		 
		 ModelAndView mav=null;
		 User uservalid=dao.checkUser(user);
		 if(uservalid !=null)
		 {
			 System.out.println(uservalid.getName());
			 mav=new ModelAndView("/WelcomeUser","command",new ServiceProvider());
			 System.out.println("aal re login user mde");
			 System.out.println("valid user");
			 mav.addObject("firstname",uservalid.getName());
		 }else
		 {
			 return new ModelAndView("/error");
		 }
		 return mav;
	 }
	 
	 @RequestMapping("/welcome")
	 public ModelAndView sucessLogin()
	 {
		 return new ModelAndView("/WelcomeUser");
	 }
	 
	 @RequestMapping(value="/CheckServices",method=RequestMethod.POST)
	 public ModelAndView checkService(@ModelAttribute("service") ServiceProvider service)
	 {
		List<ServiceProvider>list= dao1.checkService(service);
		return new ModelAndView("viewServices","list",list);  
	 }
	 
}
