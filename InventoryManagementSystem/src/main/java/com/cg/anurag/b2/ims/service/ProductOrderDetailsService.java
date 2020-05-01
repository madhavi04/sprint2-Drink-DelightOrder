package com.cg.anurag.b2.ims.service;

import java.util.List;

import com.cg.anurag.b2.ims.dto.ProductOrderDetails;



public interface ProductOrderDetailsService {
	 ProductOrderDetails addProductOrder(ProductOrderDetails p);
	    
	   
	    
	    ProductOrderDetails getProductOrderDetailsById(int order_id);
	    
	   
	  
	    ProductOrderDetails updateproductorder(ProductOrderDetails p);
}


