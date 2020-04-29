package com.cg.anurag.b2.ims.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.cg.anurag.b2.ims.dto.ProductOrderDetails;

@Repository
public interface ProductOrderDetailsDAO extends JpaRepository<ProductOrderDetails,String>
{
	public List<ProductOrderDetails> findAllOrdersByDistributorId(String distributorId);
}