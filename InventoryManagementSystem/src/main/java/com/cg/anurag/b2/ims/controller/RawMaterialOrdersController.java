package com.cg.anurag.b2.ims.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.cg.anurag.b2.ims.dto.RawMaterialOrders;
import com.cg.anurag.b2.ims.service.RawMaterialOrdersService;

//@CrossOrigin(origins = "http://localhost:4200")
@RestController
public class RawMaterialOrdersController 
{
	@Autowired
	RawMaterialOrdersService rmoService;
	public void setRmoService(RawMaterialOrdersService rmoService) 
	{
		this.rmoService = rmoService;
	}
	
	@GetMapping(value="/getAllOrders")
	public List<RawMaterialOrders> getAllOrders()
	{
		return rmoService.getAllDetails();
	}
	@GetMapping(value = "/getOrderDetails/{orderId}")
	public RawMaterialOrders getOrder(@PathVariable String orderId)
	{
		return rmoService.getDetails(orderId);
	}
}
