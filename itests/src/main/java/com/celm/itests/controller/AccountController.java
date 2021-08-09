package com.celm.itests.controller;
import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.celm.itests.model.Account;
import com.celm.itests.repository.RepoAccount;
import com.celm.itests.repository.RepoEsito;

@Controller
public class AccountController {
	@Autowired
	RepoAccount ra;
	
	@Autowired
	RepoEsito re;
	
	@RequestMapping(value="insertOrUpdateAcc",method=RequestMethod.POST)
	public String insertOrUpdate(Account a) {
		ra.save(a);
		return "home";
	}
	
	@RequestMapping(value="loginAcc",method=RequestMethod.POST)
	public String login(HttpServletRequest request) {
		if(ra.login(request.getParameter("username"),request.getParameter("password")) != null) {
		request.getSession().setAttribute("loginOn", true);
		}else {
			request.setAttribute("errorMsg", "Login Fallito!");
		}
		return "home";
	}
	
	public ModelAndView register(HttpServletRequest req) {
		ModelAndView mv=new ModelAndView();
		if(req.getSession().getAttribute("loginOn")!=null) {
			mv.setViewName("home");
		}else {
			mv.setViewName("formRegistrazione");
		}
		return mv;
	}
}
