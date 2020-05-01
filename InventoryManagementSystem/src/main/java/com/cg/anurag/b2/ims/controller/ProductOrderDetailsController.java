package com.cg.anurag.b2.ims.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cg.anurag.b2.ims.dto.ProductOrderDetails;
import com.cg.anurag.b2.ims.exceptions.IdNotFoundException;
import com.cg.anurag.b2.ims.service.ProductOrderDetailsService;


@RestController
@RequestMapping("/productorder")
public class ProductOrderDetailsController {
	
	@Autowired
	ProductOrderDetailsService serviceobj;
	
	//Add ProductOrder
	@PostMapping("/addProductOrder")
	public ResponseEntity<String>addProductOrder(@RequestBody ProductOrderDetails p )
	{
		ProductOrderDetails e = serviceobj.addProductOrder(p);
		if(e == null)
		{
			throw new IdNotFoundException("Enter Valid Id");
		}
		else {
			return new ResponseEntity<String>("Product Order placed successfully",new HttpHeaders(),HttpStatus.OK);		
		}
	}

	

	// Get Particular ProductorderDetail
		@GetMapping("/GetProductOrderDetail/{order_id}")
		private ResponseEntity<ProductOrderDetails> getProductOrderDetailsById(@PathVariable("order_id") int order_id) {
			ProductOrderDetails d = serviceobj.getProductOrderDetailsById(order_id);
			if (d == null) {
				throw new IdNotFoundException("Id does not exist,so we couldn't fetch details");
			} else {
				return new ResponseEntity<ProductOrderDetails>(d, new HttpHeaders(), HttpStatus.OK);
			}
		}
	
    //Update ProductOrder
    @PutMapping("/UpdateProductOrder")
	public ResponseEntity<String> updateProductOrder(@RequestBody ProductOrderDetails p)
		{
			ProductOrderDetails e = serviceobj.updateproductorder(p);
			if (e == null) {
				throw new IdNotFoundException("Update Operation Unsuccessful,Provided Id does not exist");
			} else {
				return new ResponseEntity<String>("Product Order updated successfully", new HttpHeaders(), HttpStatus.OK);
			}
		}
		
	
	}


