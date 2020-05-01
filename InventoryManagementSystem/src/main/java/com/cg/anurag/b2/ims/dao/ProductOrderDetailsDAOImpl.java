package com.cg.anurag.b2.ims.dao;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.stereotype.Repository;

import com.cg.anurag.b2.ims.dto.ProductOrderDetails;




@Repository
public class ProductOrderDetailsDAOImpl implements ProductOrderDetailsDAO{

	@PersistenceContext
	EntityManager em;
	
	@Override
	public ProductOrderDetails addProductOrder(ProductOrderDetails p) {
		// TODO Auto-generated method stub
		ProductOrderDetails e = em.merge(p);
		return e;
	}
	@Override
	public ProductOrderDetails getProductOrderDetailsById(int order_id) {
		
		return em.find(ProductOrderDetails.class, order_id);
	}



	@Override
	public ProductOrderDetails updateproductorder(ProductOrderDetails p) {
		ProductOrderDetails pod=em.find(ProductOrderDetails.class,p.getOrder_id());
		if(pod!=null)
		{

			pod.setItem_name(p.getItem_name());
			pod.setQuantity_unit(p.getQuantity_unit());
			pod.setPrice_per_unit(p.getPrice_per_unit());
			pod.setTotal_price(p.getTotal_price());
			pod.setOrder_date(p.getOrder_date());
			pod.setDelivery_date(p.getDelivery_date());
			pod.setDelivery_status(p.getDelivery_status());
		}
		return pod;
	}

}
