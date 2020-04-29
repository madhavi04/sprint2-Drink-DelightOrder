package com.cg.anurag.b2.ims.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.cg.anurag.b2.ims.dto.ProductOrderDetails;
import com.cg.anurag.b2.ims.service.ProductOrderDetailsService;
@RestController

public class ProductOrderDetailsController {
	@Autowired
	ProductOrderDetailsService podService;
	public void setRmoService(ProductOrderDetailsService rmoService) 
	{
		this.podService = podService;
	}
	
	@GetMapping(value="/getAllOrders")
	public List<ProductOrderDetails> getAllOrders()
	{
		return  podService.getAllDetails();
	}
	@GetMapping(value = "/getOrderDetails/{orderId}")
	public ProductOrderDetails getOrder(@PathVariable String orderId)
	{
		return podService.getDetails(orderId);
	}

}
