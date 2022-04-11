package com.codingdojo.angel.repositorios;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.codingdojo.angel.modelos.Dojo;

@Repository
public interface RepositorioDojos extends CrudRepository<Dojo, Long>{
	
	List<Dojo> findAll();
	List<Dojo> findById(long id);

	Dojo save(Dojo dojo);
	
	void deleteById(long id);
}
