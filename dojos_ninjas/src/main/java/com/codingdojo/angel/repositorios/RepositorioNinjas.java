package com.codingdojo.angel.repositorios;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.codingdojo.angel.modelos.Ninja;

@Repository
public interface RepositorioNinjas extends CrudRepository<Ninja, Long>{

	List<Ninja> findAll();
	List<Ninja> findByDojoId(long id);
	
	Ninja save(Ninja nuevoNinja);
}
