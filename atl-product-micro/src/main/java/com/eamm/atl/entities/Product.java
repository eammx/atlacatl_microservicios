package com.eamm.atl.entities;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import lombok.Data;
import lombok.NoArgsConstructor;

@Document(value = "product")
@Data
@NoArgsConstructor
public class Product {
	@Id
	private String id;
	
	private String nombre;
	
	private String descripcion;
	
	private Double precio;
}
