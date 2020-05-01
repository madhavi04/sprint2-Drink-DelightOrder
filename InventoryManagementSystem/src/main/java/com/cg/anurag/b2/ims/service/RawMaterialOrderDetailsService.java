package com.cg.anurag.b2.ims.service;


import java.util.List;

import javax.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cg.anurag.b2.ims.dao.RawMaterialOrderDetailsDao;
import com.cg.anurag.b2.ims.dto.ProductOrderDetails;
import com.cg.anurag.b2.ims.dto.RawMaterialOrderDetails;



public interface RawMaterialOrderDetailsService 
{
	RawMaterialOrderDetails addRawMaterialOrder(RawMaterialOrderDetails r);

	RawMaterialOrderDetails getRawMaterialOrderDetailById(int order_id);


	RawMaterialOrderDetails updateRawMaterialOrder(RawMaterialOrderDetails r);

}
