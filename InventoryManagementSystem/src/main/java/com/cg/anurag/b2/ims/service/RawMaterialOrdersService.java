package com.cg.anurag.b2.ims.service;

import java.util.List;

import javax.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.cg.anurag.b2.ims.dao.RawMaterialOrdersDAO;
import com.cg.anurag.b2.ims.dto.RawMaterialOrders;

@Service
public class RawMaterialOrdersService 
{
	@Autowired
	RawMaterialOrdersDAO rmodao;
	public void setRmodao(RawMaterialOrdersDAO rmodao) 
	{
		this.rmodao = rmodao;
	}
	
	@Transactional
	public RawMaterialOrders addRawMaterial(RawMaterialOrders rawMaterial)
	{
		return rmodao.save(rawMaterial);
	}
	@Transactional
	public String updateStatus(RawMaterialOrders newRawMaterial)
	{
		RawMaterialOrders rawMaterialOrders = rmodao.findById(newRawMaterial.getOrderId()).get();
		if(rawMaterialOrders!=null)
		{
			rawMaterialOrders.setDeliverystatus(newRawMaterial.getDeliverystatus());
			return "Successfully Updated";
		}
		return "Updation Failed";
	}
	@Transactional
	public RawMaterialOrders getDetails(String orderId)
	{
		return rmodao.findById(orderId).get();
	}
	@Transactional
	public List<RawMaterialOrders> getAllDetails()
	{
		return rmodao.findAll();
	}
}
