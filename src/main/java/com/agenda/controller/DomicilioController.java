package com.agenda.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.agenda.entity.Domicilio;
import com.agenda.repository.DomicilioRepository;

@RestController
@RequestMapping("/domicilio")
public class DomicilioController {
	
	@Autowired
	private DomicilioRepository domicilioRepository;
	
	@GetMapping
	public List<Domicilio> getAll() {
		return this.domicilioRepository.findAll();
	}
	
	@PostMapping
	public Domicilio save(@RequestBody Domicilio c) {
		return this.domicilioRepository.save(c);
	}
	
	@GetMapping("/{id}")
	public Domicilio getById(@PathVariable("id") Long id) {
		return this.domicilioRepository.findById(id).orElse(null);
	}
	
	

}
