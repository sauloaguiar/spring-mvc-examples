package com.examples.app.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.examples.datasource.Datasource;
import com.examples.datasource.QueryContextRouter;
import com.examples.model.Person;
import com.examples.service.PersonService;

@Controller
@RequestMapping("/examples")
public class RestController {

	@Autowired
	private PersonService personService;
	
	@RequestMapping(method = RequestMethod.GET, value = "/list")
	public @ResponseBody List<Person> contacts(@RequestParam(required = false) boolean debug) {
		if ( debug ) {
			QueryContextRouter.setDatasource(Datasource.DEBUG);
		} 
		return personService.getUsersList();
	}
}
