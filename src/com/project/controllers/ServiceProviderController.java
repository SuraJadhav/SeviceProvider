package com.project.controllers;

import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;  
import org.springframework.web.bind.annotation.RequestMapping;  
import org.springframework.web.bind.annotation.RequestMethod;  
import org.springframework.web.servlet.ModelAndView;
import com.project.dao.*;
import com.project.beans.*;
@Controller
public class ServiceProviderController {
@Autowired
ServiceProviderDao dao1;
@RequestMapping("/provider")	
public ModelAndView ProviderLoginPage()
{
	System.out.println("in service proiver");
	return new ModelAndView("/ProviderPage");
}

@RequestMapping("/ProviderLogin")
public ModelAndView login()
{
	return new ModelAndView("ProviderLogin","command",new ServiceProvider());
}

@RequestMapping("/ProviderRegister")
public ModelAndView register()
{
	return new ModelAndView("ProviderRegister","command",new ServiceProvider());
}

@RequestMapping("/ProviderCheckLogin")	
public ModelAndView checkProvider(@ModelAttribute("ServiceProvider") ServiceProvider Provider)
{
	ModelAndView mav=null;
	 ServiceProvider uservalid=dao1.checkProvider(Provider);
	 if(uservalid !=null)
	 {
		 System.out.println(uservalid.getName()+uservalid.getRequestContact());
		 
		// List<ServiceProvider>list=checkServiceRequest(Provider);
		 mav=new ModelAndView("/WelcomeProvider");
		 System.out.println("aal re login Provider mde");
		 System.out.println("valid user");
		 mav.addObject("contactnumber",uservalid.getRequestContact());
		 return mav;
	 }else
	 {
		 return new ModelAndView("/error");
	 }

}


@RequestMapping(value="/saveProvider",method=RequestMethod.POST)
public ModelAndView saveUser(@ModelAttribute("ServiceProvider") ServiceProvider Provider)
{
	
	 dao1.save(Provider);
	 return new ModelAndView("/Home");
}


public List<ServiceProvider> checkServiceRequest(ServiceProvider service)
{
	List<ServiceProvider>list= dao1.checkService(service);
	return list; 
}

}


