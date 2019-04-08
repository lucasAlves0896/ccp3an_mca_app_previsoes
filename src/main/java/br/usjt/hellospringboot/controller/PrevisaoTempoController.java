package br.usjt.hellospringboot.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class PrevisaoTempoController {

	@GetMapping ("/previsaotempo")
	public String hello() {
		return "previsao";
	}
}
