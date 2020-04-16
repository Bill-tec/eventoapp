package com.eventoapp.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.eventoapp.models.Evento;


@Controller
public class EventoController {
	
	@RequestMapping("/cadastrarEvento")
	public String form() {
		return "evento/formEvento";
	}
	@RequestMapping("/salvar")
	public String salvar(Evento evento) {
		System.out.println("Nome: " + evento.getNome());
		System.out.println("Local: " + evento.getLocal());
		System.out.println("Horario: " + evento.getHorario());
		System.out.println("Data: " + evento.getData());
		return "evento/salvo";
	}
	
}
