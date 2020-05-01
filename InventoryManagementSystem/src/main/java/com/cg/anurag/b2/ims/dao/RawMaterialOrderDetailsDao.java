package com.cg.anurag.b2.ims.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.cg.anurag.b2.ims.dto.RawMaterialOrderDetails;


public interface RawMaterialOrderDetailsDao {

	RawMaterialOrderDetails addRawMaterialOrder(RawMaterialOrderDetails r);



	RawMaterialOrderDetails getRawMaterialOrderDetailById(int order_id);
	
	

	RawMaterialOrderDetails updateRawMaterialOrder(RawMaterialOrderDetails r);


}