package com.mx.curso.dao;



//import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.PagingAndSortingRepository;

import com.mx.curso.modelo.Cliente;

public interface IClienteDao extends PagingAndSortingRepository<Cliente, Long>{
	
	
	
}
