package com.cg.anurag.b2.ims.service;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cg.anurag.b2.ims.dao.RawMaterialOrderDetailsDaoImpl;
import com.cg.anurag.b2.ims.dto.RawMaterialOrderDetails;



@Service
@Transactional
public class RawMaterialOrderDetailsServiceImpl implements RawMaterialOrderDetailsService {

	@Autowired
	RawMaterialOrderDetailsDaoImpl dao;
	
	@Override
	public RawMaterialOrderDetails addRawMaterialOrder(RawMaterialOrderDetails r) {
		// TODO Auto-generated method stub
		return dao.addRawMaterialOrder(r);
	}

	

	@Override
	public RawMaterialOrderDetails getRawMaterialOrderDetailById(int order_id) {
		// TODO Auto-generated method stub
		return dao.getRawMaterialOrderDetailById(order_id);
	}

	
	@Override
	public RawMaterialOrderDetails updateRawMaterialOrder(RawMaterialOrderDetails r) {
		// TODO Auto-generated method stub
		return dao.updateRawMaterialOrder(r);
	}
}
		