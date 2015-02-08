package com.panzi.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;


@Controller 
public class UserController {
	
	//private static final Log log = LogFactory.getLog(UserController.class);
	
	@RequestMapping(value="index.html",method = RequestMethod.GET)
	public String index_jsp(HttpServletRequest request){   
		request.setAttribute("test", "测试测试");
        return "login";
    }   
	

}
