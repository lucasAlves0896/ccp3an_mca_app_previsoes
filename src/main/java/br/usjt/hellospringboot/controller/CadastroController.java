package br.usjt.hellospringboot.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.ModelAndView;

import br.usjt.hellospringboot.model.Tempo;
import br.usjt.hellospringboot.repository.CadastroRepository;

@Controller
public class CadastroController {
	//a injeção de dependência ocorre aqui
	@Autowired
	private CadastroRepository temposRepo;
	
	@GetMapping ("/cadastro")
	public ModelAndView listartempo () {
		//passe o nome da página ao construtor
		ModelAndView mv = new ModelAndView ("cadastroTempo");
		
		//para modelar o formulário
		mv.addObject(new Tempo());
		
		//Busque a coleção com o repositório
		List <Tempo> tempo = temposRepo.findAll();
		
		//adicione a coleção ao objeto ModelAndView		
		mv.addObject("tempos", tempo);
		
		//devolva o ModelAndView
		return mv;
	}
	
	@PostMapping ("/cadastro")
	public String salvar (Tempo tempos) {
		temposRepo.save(tempos);
		return "redirect:/cadastro";
	} 
}
