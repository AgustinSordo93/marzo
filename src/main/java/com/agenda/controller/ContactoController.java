package com.agenda.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.agenda.entity.Contacto;
import com.agenda.repository.ContactoRepository;

@RestController
@RequestMapping("/contacto")
public class ContactoController {
	
	@Autowired
	private ContactoRepository contactoRepository;
	
	@GetMapping
	public List<Contacto> getAll() {
		return this.contactoRepository.findAll();
	}
	
	@PostMapping
	public Contacto save(@RequestBody Contacto c) {
		return this.contactoRepository.save(c);
	}
	
	@GetMapping("/{id}")
	public Contacto getById(@PathVariable("id") Long id) {
		return this.contactoRepository.findById(id).orElse(null);
	}
	
	

}
