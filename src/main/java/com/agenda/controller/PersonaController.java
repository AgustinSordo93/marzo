package com.agenda.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.agenda.entity.Persona;
import com.agenda.repository.PersonaRepository;

@RestController
@RequestMapping("/persona")
public class PersonaController {
	
	@Autowired
	private PersonaRepository personaRepository;
	
	@GetMapping
	public List<Persona> getAll() {
		return this.personaRepository.findAll();
	}
	
	@PostMapping
	public Persona save(@RequestBody Persona c) {
		return this.personaRepository.save(c);
	}
	
	@GetMapping("/{id}")
	public Persona getById(@PathVariable("id") Long id) {
		return this.personaRepository.findById(id).orElse(null);
	}
	
	
	

}
