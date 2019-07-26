package com.gabrielcoelho.cursomc.services;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.gabrielcoelho.cursomc.domain.Categoria;
import com.gabrielcoelho.cursomc.repositories.CategoriaRepository;
import com.gabrielcoelho.cursomc.services.exception.ObjectNotFoundException;

@Service
public class CategoriaService {
	
	@Autowired
	private CategoriaRepository repo;
	
	public Categoria buscar(Integer id) {
		//CHAMA uma operação do objeto de acesso a dados
		Optional<Categoria> obj = repo.findById(id);
		return obj.orElseThrow(() -> new ObjectNotFoundException(
				"Objeto não Encontrado! Id: " + id + ", Tipo: " +Categoria.class.getName()));
	}

}
