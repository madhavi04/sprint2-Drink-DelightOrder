package com.cg.anurag.b2.ims.service;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cg.anurag.b2.ims.dao.ProductOrderDetailsDAO;
import com.cg.anurag.b2.ims.dto.ProductOrderDetails;


@Service
public class ProductOrderDetailsService {
	@Autowired
	ProductOrderDetailsDAO poddao;
	public void setRmodao(ProductOrderDetailsDAO poddao) 
	{
		this.poddao = poddao;
	}
	
	@Transactional
	public ProductOrderDetails addProduct(ProductOrderDetails product)
	{
		return poddao.save(product);
	}
	@Transactional
	public String updateStatus(ProductOrderDetails newproduct)
	{
		ProductOrderDetails productorderdetails = poddao.findById(newproduct.getOrderId()).get();
		if(productorderdetails!=null)
		{
			productorderdetails.setDeliverystatus(newproduct.getDeliverystatus());
			return "Successfully Updated";
		}
		return "Updation Failed";
	}
	@Transactional
	public ProductOrderDetails getDetails(String orderId)
	{
		return poddao.findById(orderId).get();
	}
	@Transactional
	public List<ProductOrderDetails> getAllDetails()
	{
		return poddao.findAll();
	}
}


