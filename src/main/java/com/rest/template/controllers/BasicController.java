package com.rest.template.controllers;

import javax.validation.Valid;

import com.rest.template.controllers.requests.BasicModel;
import com.rest.template.controllers.responses.Message;
import com.rest.template.exceptions.ValidationException;

import org.apache.log4j.Logger;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class BasicController {
	
	private static final Logger logger = Logger.getLogger(BasicController.class);
	
	@RequestMapping("/")
    public String index() {
		logger.info("Rest Template Initialized.");
        return "Rest Template!";
    }
	
	@RequestMapping(value="/echo/{message}", method = RequestMethod.GET)
    public Message echo(@PathVariable(value="message") String input) {
		logger.info("/basic/echo/"+input);
        return new Message(input);
    }
	
	@RequestMapping(value="/new", method = RequestMethod.POST)
    public Message greeting(@RequestBody @Valid final BasicModel content, final BindingResult result) throws ValidationException {
		logger.info("/basic/new/");		
		this.validate(result);		
        return new Message("Successfully Inserted.");
    }
	
	private void validate(final BindingResult result) throws ValidationException {
		if (result.hasErrors()) {
			throw new ValidationException(result);
		}
	}

}
