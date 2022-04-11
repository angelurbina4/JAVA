package com.codingdojo.angel.servicios;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.codingdojo.angel.modelos.Dojo;
import com.codingdojo.angel.modelos.Ninja;
import com.codingdojo.angel.repositorios.RepositorioDojos;
import com.codingdojo.angel.repositorios.RepositorioNinjas;

@Service
public class ServicioDojos {
	
	private final RepositorioDojos repositorio_do;
	private final RepositorioNinjas repositorio_ni;

	public ServicioDojos(RepositorioDojos repositorio_do,
					 	 RepositorioNinjas repositorio_ni) {
		this.repositorio_ni = repositorio_ni;
		this.repositorio_do = repositorio_do;
	}
	
	public List<Dojo> get_all_dojos(){
		return repositorio_do.findAll();
	}
	
	public Dojo find_dojo(Long id) {
		Optional<Dojo> optionalDojo = repositorio_do.findById(id);
		if(optionalDojo.isPresent()) {
			return optionalDojo.get();
		}else {
			return null;
		}
	}
	
	public Dojo save_dojo(Dojo dojo) {
		return repositorio_do.save(dojo);
	}
	
	public void delete_dojo(Long id) {
		repositorio_do.deleteById(id);
	}
	
	public List<Ninja> get_ninja(Long id){
		return repositorio_ni.findByDojoId(id);
	}
	
	public List<Ninja> get_all_ninjas(){
		return repositorio_ni.findAll();
	}

	public Ninja save_ninja(Ninja ninja) {
		return repositorio_ni.save(ninja);
	}
	
}
