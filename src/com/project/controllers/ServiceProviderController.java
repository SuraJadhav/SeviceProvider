package com.project.controllers;

import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.bind.annotation.RequestMapping;  
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;  
import org.springframework.web.bind.annotation.RequestMapping;  
import org.springframework.web.bind.annotation.RequestMethod;  
import org.springframework.web.servlet.ModelAndView;
import com.project.dao.*;
import com.project.beans.*;
public class ServiceProviderController {
@RequestMapping("/provider")	
public ModelAndView ProviderLoginPage()
{
	return new ModelAndView("/ProviderLogin");
}
@RequestMapping("/ProviderCheckLogin")	
public ModelAndView checkProvider()
{
	
	return new ModelAndView("/ProviderLogin");
}

}
