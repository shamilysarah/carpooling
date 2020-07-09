package com.v2.houserent.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.v2.houserent.model.Provider;
import com.v2.houserent.model.User;
import com.v2.houserent.service.ProviderService;
import com.v2.houserent.service.UserService;
@Controller
public class ProviderController {
	
	 @Autowired
	  public ProviderService providerService;
	  @RequestMapping(value = "/providerDetails", method = RequestMethod.GET)
	  public ModelAndView showDetails(HttpServletRequest request, HttpServletResponse response) {
	    ModelAndView mav = new ModelAndView("providerdetails");
	    mav.addObject("provider", new Provider());
	    return mav;
	  }
	  @RequestMapping(value = "/detailProcess", method = RequestMethod.POST)
	  public ModelAndView addUser(HttpServletRequest request, HttpServletResponse response,
	  @ModelAttribute("provider") Provider provider) {
	  providerService.upload(provider);
	 // return new ModelAndView("welcome", "firstname", user.getFirstname());
	  return new ModelAndView("mainhome");
	  }
	 @RequestMapping(value="/rider",method = RequestMethod.GET)
	  public ModelAndView rider() {
	   ModelAndView model = new ModelAndView("rider");
	   List<Provider> providerList = providerService.getAllProviders();
	   model.addObject("providerList", providerList);	   
	   return model;
	 }
	   
	 /* @RequestMapping("/rider")
	  public String viewPage(Model model) {
		  List<Provider> providerList = providerService.getAllProviders();
	      model.addAttribute("providerList", providerList);
	       
	      return model;
	  }*/
	 @RequestMapping(value="/choosedcar")
	 public ModelAndView choosedcar(){
		 ModelAndView mod=new ModelAndView("choosedcar");
		 
		 return mod;
	 }
		 
	 @RequestMapping("/choosedcar/{username}")
		public ModelAndView get(@PathVariable("username") String username) {
			ModelAndView mod = new ModelAndView("choosedcar");
			return mod;
		}
	 
}
