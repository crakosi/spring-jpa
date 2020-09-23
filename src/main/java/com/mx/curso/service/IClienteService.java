package com.mx.curso.service;

import java.util.List;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import com.mx.curso.modelo.Cliente;

public interface IClienteService {

	
	public List<Cliente> findAll();
	
	public Page<Cliente> findAll(Pageable page);
	
	public void save (Cliente cliente);
	
	public Cliente findOne(Long id);
	
	public void delete(Long id);
}
