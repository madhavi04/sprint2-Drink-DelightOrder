package com.cg.anurag.b2.ims.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cg.anurag.b2.ims.dto.RawMaterialOrderDetails;
import com.cg.anurag.b2.ims.exceptions.IdNotFoundException;
import com.cg.anurag.b2.ims.service.RawMaterialOrderDetailsService;


@RestController
@RequestMapping("/RawMaterialOrder")


public class RawMaterialOrderDetailsController {
	
	
	@Autowired
	RawMaterialOrderDetailsService serviceobj;
	
	//Add RawMaterialOrder
	@PostMapping("/addRawMaterialOrder")
	public ResponseEntity<String>addRawMaterialOrder(@RequestBody RawMaterialOrderDetails r )
	{
		RawMaterialOrderDetails e = serviceobj.addRawMaterialOrder(r);
		if(e == null)
		{
			throw new IdNotFoundException("Enter Valid Id");
		}
		else {
			return new ResponseEntity<String>("RawMaterialOrder placed successfully",new HttpHeaders(),HttpStatus.OK);		
		}
	}

	
	// Get Particular RawMaterialorderDetail
			@GetMapping("/GetRawmaterialOrderDetail/{order_id}")
			private ResponseEntity<RawMaterialOrderDetails> getRawMaterialOrderDetailsById(@PathVariable("order_id") int order_id) {
				RawMaterialOrderDetails d = serviceobj.getRawMaterialOrderDetailById(order_id);
				if (d == null) {
					throw new IdNotFoundException("Id does not exist,so we couldn't fetch details");
				} else {
					return new ResponseEntity<RawMaterialOrderDetails>(d, new HttpHeaders(), HttpStatus.OK);
				}
			}
	
    //Update RawMaterialOrder
    @PutMapping("/UpdateUser")
	public ResponseEntity<String> updateRawMaterialOrder(@RequestBody RawMaterialOrderDetails r)
		{
    	RawMaterialOrderDetails e = serviceobj.updateRawMaterialOrder(r);
			if (e == null) {
				throw new IdNotFoundException("Update Operation Unsuccessful,Provided Id does not exist");
			} else {
				return new ResponseEntity<String>("RawMaterialOrder updated successfully", new HttpHeaders(), HttpStatus.OK);
			}
		}
		
	

}


