package com.aarteaga.examples.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class ParametrosController {
	
	@GetMapping("/parametros")
	public String parametros(@RequestParam(defaultValue = "valor default") String valor,@RequestParam(defaultValue = "valor default", name="valor_dos") String otroValor, Model model) {
		model.addAttribute("titulo", "View of Parameters");
		model.addAttribute("parametro", valor);
		model.addAttribute("otroValor", otroValor );
		
		//http://localhost:8080/parametros?valor=helloagain&valor_dos=hola
		return "parameter";
	}
	

}
