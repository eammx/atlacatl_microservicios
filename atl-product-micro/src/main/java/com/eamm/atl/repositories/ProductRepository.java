package com.eamm.atl.repositories;

import org.springframework.data.mongodb.repository.MongoRepository;
import com.eamm.atl.entities.Product;

public interface ProductRepository extends MongoRepository<Product,String>{

}
