package com.agenda.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.agenda.entity.Contacto;

public interface ContactoRepository extends JpaRepository<Contacto, Long> {

}
