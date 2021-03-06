package com.gabrielcoelho.cursomc.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.gabrielcoelho.cursomc.domain.Categoria;

@Repository
public interface CategoriaRepository extends JpaRepository<Categoria, Integer>{
//capaz de realizar operações de acesso a dados referentes ao objeto Categoria
//categoria está mapeada
}
