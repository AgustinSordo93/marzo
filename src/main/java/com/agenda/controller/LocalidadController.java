package com.agenda.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.agenda.entity.Localidad;
import com.agenda.repository.LocalidadRepository;


@RestController
@RequestMapping("/localidad")
public class LocalidadController {
	
	@Autowired
	private LocalidadRepository localidadRepository;
	
	@GetMapping
	public List<Localidad> getAll() {
		return this.localidadRepository.findAll();
	}
	
	@PostMapping
	public Localidad save(@RequestBody Localidad c) {
		return this.localidadRepository.save(c);
	}
	
	@GetMapping("/{id}")
	public Localidad getById(@PathVariable("id") Long id) {
		return this.localidadRepository.findById(id).orElse(null);
	}

}
