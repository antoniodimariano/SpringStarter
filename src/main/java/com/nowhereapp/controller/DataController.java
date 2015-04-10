package com.nowhereapp.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.nowhereapp.services.DataService;
import com.nowhereapp.domain.Employee;
import com.nowhereapp.domain.User;

@Controller
public class DataController {
	
	@Autowired
	DataService dataService;

	
	/*
	 * Authentication endpoints
	 *
	 */
	
	@RequestMapping(value="/login", method = RequestMethod.GET)
	/*
	public String login(ModelMap model) {
		return "login";
	}
	*/
	public ModelAndView getLoginForm(@ModelAttribute User users,
			@RequestParam(value="error", required=false) String error,
			@RequestParam(value="logout", required=false) String logout) {
		
		String message="";
		if( error != null ) {
			message = "Incorrect username or password";
		} else if ( logout != null ) {
			message =" Logout successful!";
		}
		return new ModelAndView("login", "message", message);
		
		
	}
	
	@RequestMapping(value="/accessdenied", method = RequestMethod.GET)
	public String loginerror(ModelMap model) {
		model.addAttribute("error","true");
		return "denied";
	}
	@RequestMapping(value="/logout", method = RequestMethod.GET)
	public String logout(ModelMap model) {
		System.out.println("LOGOUT");
		return "logout";
	}
	
	
	
	
	
	@RequestMapping(value="/form", method = RequestMethod.GET)
	public ModelAndView getForm(@ModelAttribute Employee employee) {
		return new ModelAndView("form");
	}
	
	//@RequestMapping("register")
	@RequestMapping(value = "/register", method = RequestMethod.POST)
	public ModelAndView registerUser(@ModelAttribute Employee employee) {
		dataService.insertRow(employee);
		return new ModelAndView("redirect:list");
	}
	
	@RequestMapping(value="/list", method = RequestMethod.GET)
	public ModelAndView getList() {
		@SuppressWarnings("rawtypes")
		List employeeList = dataService.getList();
		return new ModelAndView("list","employeeList",employeeList);
	}
	
	@RequestMapping(value="/delete", method = RequestMethod.GET)
	public ModelAndView deleteUser(@RequestParam int id) {
		dataService.deleteRow(id);
		return new ModelAndView("redirect:list");
	}
	
	@RequestMapping(value="/edit", method = RequestMethod.GET)
	public ModelAndView editUser(@RequestParam int id,@ModelAttribute Employee employee) {
		Employee employeeObject = dataService.getRowById(id);
		return new ModelAndView("edit","employeeObject",employeeObject);
	}
	
	@RequestMapping(value="/update", method= RequestMethod.POST)
	public ModelAndView updateUser(@ModelAttribute Employee employee) {
		dataService.updateRow(employee);
		return new ModelAndView("redirect:list");
	}

}
