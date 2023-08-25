package com.gomes.pizzaria.resources;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.gomes.pizzaria.entities.Pizzarias;
import com.gomes.pizzaria.repositories.PizzariaRepository;

@RestController
@RequestMapping(value = "/pizzarias")
public class PizzariasResource {
	
	@Autowired
	private PizzariaRepository repository;
	
	@GetMapping(value = "/{id}")
	public ResponseEntity<Pizzarias> findById(@PathVariable Long id){
		Pizzarias obj = repository.findById(id).get();
		return ResponseEntity.ok(obj);
		}
		
}
