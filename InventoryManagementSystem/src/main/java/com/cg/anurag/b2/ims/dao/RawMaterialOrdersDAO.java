package com.cg.anurag.b2.ims.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.cg.anurag.b2.ims.dto.RawMaterialOrders;

@Repository
public interface RawMaterialOrdersDAO extends JpaRepository<RawMaterialOrders,String>
{
	
}
