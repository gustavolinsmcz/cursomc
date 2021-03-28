package com.oper365.cursomc.resource;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.oper365.cursomc.domain.Categoria; 

@RestController
@RequestMapping(value="/categorias")
public class CategoriaResource {
	
	@RequestMapping(method = RequestMethod.GET)
	public List listar() {
		
		Categoria cat1 = new Categoria(1 , "Escritório");
		Categoria cat2 = new Categoria(1 , "Escritório");
		
		List<Categoria> lista = new ArrayList<>();
		lista.add(cat2);
		lista.add(cat1);
		
		return lista;
	}

}
