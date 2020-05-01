package com.cg.anurag.b2.ims.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.cg.anurag.b2.ims.dto.ProductOrderDetails;

@Repository
public interface ProductOrderDetailsDAO 
{
ProductOrderDetails addProductOrder(ProductOrderDetails p);
    
   
    
    ProductOrderDetails getProductOrderDetailsById(int order_id);
    
    
  
    ProductOrderDetails updateproductorder(ProductOrderDetails p);
}