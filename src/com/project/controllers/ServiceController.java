package com.project.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.SessionAttributes;
import org.springframework.web.servlet.ModelAndView;

import com.project.beans.ServiceProvider;
import com.project.dao.ServiceProviderDao;
import com.project.dao.UserDao;

@SessionAttributes("contactno")
@Controller
public class ServiceController {
	int contactProvider;
	@Autowired
	 ServiceProviderDao dao;
	 @RequestMapping(value="/sendRequest/{contact}",method=RequestMethod.GET)  
	    public ModelAndView send(@PathVariable int contact)
	 {  
		 
	    	System.out.println("done half project"+contact);
	    //	mv.addObject("contactno",contact);
	      //  Emp emp=dao.getEmpById(id);
	    	contactProvider=contact;
	        return new ModelAndView("/SendRequestSucess","command",new ServiceProvider());  
	    } 
	 
	 @RequestMapping(value="/sendRequest1",method=RequestMethod.POST)  
	    public ModelAndView done(@RequestParam("u_contact") String contact)
	 {  
	    System.out.println("done half project and contact is"+contact+contactProvider);
	      //  Emp emp=dao.getEmpById(id);
	    	dao.send(contact,contactProvider);
	    	//int i=dao.send(s, contactProvider);
	        return new ModelAndView("/SendRequestSucessEnd");  
	    } 
	 
	 
	 
}
