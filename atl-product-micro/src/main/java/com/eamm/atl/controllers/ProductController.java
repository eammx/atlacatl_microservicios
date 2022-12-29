package com.eamm.atl.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.eamm.atl.entities.Product;
import com.eamm.atl.repositories.ProductRepository;

@RestController
@RequestMapping("/api/product")
public class ProductController {

	@Autowired
	private ProductRepository repository;
	
	@GetMapping
	@ResponseStatus(HttpStatus.OK)
	public List<Product> getAll() {
		return repository.findAll();
	}
	
	@PostMapping
	@ResponseStatus(HttpStatus.OK)
	public void create(@RequestBody Product item) {
		repository.save(item);
	}
	
}
