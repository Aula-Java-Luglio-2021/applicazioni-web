package com.celm.itests.controller;
import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.celm.itests.model.Domanda;
import com.celm.itests.repository.RepoCategoria;
import com.celm.itests.repository.RepoDomanda;

@Controller
public class DomandaController {
	@Autowired
	RepoDomanda rd;
	@Autowired
	RepoCategoria rc;
	
	ModelAndView mv=new ModelAndView();
	@RequestMapping(value="getListaCategoria", method=RequestMethod.GET)
	public ModelAndView getListaCategoria(HttpServletRequest req) {
		if(req.getSession().getAttribute("loginOn")!=null) {
			mv.setViewName("domandaForm");
		}else {
			mv.setViewName("home");
		}
		mv.addObject("listaCategoria",rc.findAll());
		return mv;
	}
	
	@RequestMapping(value="getListaDomanda", method=RequestMethod.GET)
	public ModelAndView getListaDomanda(HttpServletRequest req) {
		if(req.getSession().getAttribute("loginOn")!=null) {
			mv.setViewName("visualizzaDomande");
		}else {
			mv.setViewName("home");
		}
		mv.addObject("listaDomanda",rd.findAll());
		return mv;
	}
	@RequestMapping(value="insertOrUpdateDom", method=RequestMethod.POST)
	public String insertOrUpdate(Domanda dom,int idCat) {
		dom.setCategoria(rc.findById(idCat));
		rd.save(dom);
		return "visualizzaDomande";
	}
}
