package com.cg.anurag.b2.ims.service;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cg.anurag.b2.ims.dao.ProductOrderDetailsDAOImpl;
import com.cg.anurag.b2.ims.dto.ProductOrderDetails;


@Service
@Transactional
public class ProductOrderDetailsServiceImpl implements ProductOrderDetailsService {

	@Autowired
	ProductOrderDetailsDAOImpl dao;
	
	@Override
	public ProductOrderDetails addProductOrder(ProductOrderDetails p) {
		// TODO Auto-generated method stub
		return dao.addProductOrder(p);
	}

	

	@Override
	public ProductOrderDetails getProductOrderDetailsById(int orderid) {
		// TODO Auto-generated method stub
		return dao.getProductOrderDetailsById(orderid);
	}

	

	@Override
	public ProductOrderDetails updateproductorder(ProductOrderDetails p) {
		// TODO Auto-generated method stub
		return dao.updateproductorder(p);
	}

}
