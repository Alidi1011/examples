package com.aarteaga.examples.controllers;

import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class IndexController {
	
	@GetMapping(value="/")
	public String index(Model model) {
		model.addAttribute("titulo", "Soy el titulo");
		model.addAttribute("saludo", "Hola a todos!!");
		model.addAttribute("show", false);
		//List<String> series = Arrays.asList("Dexter", "Game of Thrones","Vikings");
		//List<String> series = null;
		//model.addAttribute("series", series );
		return "index";
	}
	
	@RequestMapping(value="/index-req-mapping", method=RequestMethod.GET)
	public String indexRequestMapping() {
		return "index";
	}
	
	@GetMapping(value="/index-mv")
	public ModelAndView indexMV(ModelAndView mv) {
		mv.addObject("titulo", "Titulo de MV");
		mv.addObject("saludo", "Saludo de MV");
		mv.addObject("show", true);
		
		//List<String> series = Arrays.asList("Dexter", "Game of Thrones","Vikings");
		//mv.addObject("series", series);
		mv.setViewName("index");
		
		return mv;
	}
	
	@ModelAttribute("series")
	public List<String> getSeries(){
		return Arrays.asList("Dexter", "Game of Thrones","Vikings", "Flash", "The Last of Us");
	}
	
	@PostMapping(value="/index-post")
	public String indexRequestPostMapping() {
		return "index";
	}
	
	

}
