package com.example.demo;

import java.util.List;
import java.util.NoSuchElementException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

@RestController

@CrossOrigin(origins="http://localhost:3000")
public class ProductController {
	@Autowired
	private ProductService service;
	
	//RESTful API methods for Retrieval operations
	@GetMapping("/product")
    public List <Product> list()
	{
		return service.listAll();	
	}
	@GetMapping("/product/{id}")
	public ResponseEntity<Product> get(@PathVariable Integer id)
	{
		try
		{
			Product product=service.get(id);
			return new ResponseEntity<Product>(product,HttpStatus.OK);
			
		}
		catch(NoSuchElementException e)
		{
			return new ResponseEntity<Product>(HttpStatus.NOT_FOUND); 
		}
	}
    //RESTful API methods for Create operation
	@PostMapping(value = "/product/add", consumes = "application/json")

	@ResponseStatus(code=HttpStatus.CREATED)
	public ResponseEntity<String> add(@RequestBody Product product)
	{
		service.save(product);
		return  ResponseEntity.ok("inserted");
	}
	
	
	//RESTful API methods for Update operation
	@SuppressWarnings("unused")
	@PutMapping("/product/update/{id}")
	public ResponseEntity<?> update(@RequestBody Product product,@PathVariable Integer id)
	{
		try
		{
			Product existProduct = service.get(id);
			service.save(product);
			return new ResponseEntity<>(HttpStatus.OK);
		}
		catch(NoSuchElementException e)
		{
			return new ResponseEntity<>(HttpStatus.NOT_FOUND); 
		}
	}
	//RESTful API method for Delete operations
	@DeleteMapping("/product/delete/{id}")
	public void delete(@PathVariable Integer id)
	{
		service.delete(id);
		
	}
}