package com.jotonferreira.cursomc.resources;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.jotonferreira.cursomc.domain.Categoria;
import com.jotonferreira.cursomc.services.CategoriaService;

/*
	"Controlador REST"
	End Point para ser usado no Json
	Gera um Endpoint/clientes{id} para ser acessado
 */

@RestController
@RequestMapping(value="/categorias")
public class CategoriaResource {
	
	//acessa a camada de serviço
	@Autowired
	private CategoriaService service;
	
	//Controlador REST, encontra uma categoria com id indicado
	@RequestMapping(value="/{id}", method=RequestMethod.GET)
	public ResponseEntity<?> find(@PathVariable Integer id) {
		
		Categoria obj = service.buscar(id);
		return ResponseEntity.ok().body(obj);
		
	}
	
}
