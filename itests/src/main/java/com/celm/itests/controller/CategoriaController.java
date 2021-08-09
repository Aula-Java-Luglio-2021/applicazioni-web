package com.celm.itests.controller;
import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
//import org.springframework.web.servlet.ModelAndView;
import com.celm.itests.model.Categoria;
import com.celm.itests.repository.RepoCategoria;

@Controller
public class CategoriaController {
	
	@Autowired
	RepoCategoria rc;
	
//	ModelAndView mv=new ModelAndView();
//	@RequestMapping(value="domandaForm", method=RequestMethod.GET)
//	public ModelAndView domandaForm(HttpServletRequest req, Categoria cat) {
//		if(req.getSession().getAttribute("loginOn")!=null) {
//			mv.setViewName("domandaForm");
//		}else {
//			mv.setViewName("home");
//		}
//		rc.save(cat);
//		return mv;
//	}
	
	@RequestMapping(value="insertOrUpdateCat", method=RequestMethod.POST)
	public String insertOrUpdate(HttpServletRequest req,Categoria cat) {
		if(req.getSession().getAttribute("loginOn")!=null) {
			rc.save(cat);
		    return "domandaForm";
		}else {
			return "home";
		}
	}
}
