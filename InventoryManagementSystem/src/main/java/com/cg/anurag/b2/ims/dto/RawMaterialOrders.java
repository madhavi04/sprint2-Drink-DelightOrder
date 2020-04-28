package com.cg.anurag.b2.ims.dto;

import java.time.LocalDate;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="rawmaterialorders")
public class RawMaterialOrders 
{
	@Id
	@Column(name="orderid")
	String orderId;
	@Column(name="rawmaterialname")
	String rawMaterialName;
	@Column(name="priceperunit")
	double pricePerUnit;
	@Column(name="quantityvalue")
	double quantityValue;
	@Column(name="totalprice")
	double totalPrice;
	@Column(name="warehouseid")
	String wareHouseId;
	@Column(name="supplierid")
	String SupplierId;
	@Column(name="dateoforder")
	LocalDate dateoforder;
	@Column(name="deliverydate")
	LocalDate deliveryDate;
	@Column(name="deliverystatus")
	String deliveryStatus;
	public RawMaterialOrders() {}
	public RawMaterialOrders(String orderId, String rawMaterialName, double pricePerUnit, double quantityValue,
			double totalPrice, String wareHouseId, String supplierId, LocalDate deliveryDate,
		LocalDate dateoforder	, String deliveryStatus) {
		this.orderId = orderId;
		this.rawMaterialName = rawMaterialName;
		this.pricePerUnit = pricePerUnit;
		this.quantityValue = quantityValue;
		this.totalPrice = totalPrice;
		this.wareHouseId = wareHouseId;
		this.SupplierId = supplierId;
		this.dateoforder=dateoforder;
		this.deliveryDate = deliveryDate;
		
		
		this.deliveryStatus = deliveryStatus;
	}
	public LocalDate getDateoforder() {
		return dateoforder;
	}
	public void setDateoforder(LocalDate dateoforder) {
		this.dateoforder = dateoforder;
	}
	public String getOrderId() {
		return orderId;
	}
	public void setOrderId(String orderId) {
		this.orderId = orderId;
	}
	public String getRawMaterialName() {
		return rawMaterialName;
	}
	public void setRawMaterialName(String rawMaterialName) {
		this.rawMaterialName = rawMaterialName;
	}
	public double getPricePerUnit() {
		return pricePerUnit;
	}
	public void setPricePerUnit(double pricePerUnit) {
		this.pricePerUnit = pricePerUnit;
	}
	public double getQuantityValue() {
		return quantityValue;
	}
	public void setQuantityValue(double quantityValue) {
		this.quantityValue = quantityValue;
	}
	public double getTotalPrice() {
		return totalPrice;
	}
	public void setTotalPrice(double totalPrice) {
		this.totalPrice = totalPrice;
	}
	public String getWareHouseId() {
		return wareHouseId;
	}
	public void setWareHouseId(String wareHouseId) {
		this.wareHouseId = wareHouseId;
	}
	public String getSupplierId() {
		return SupplierId;
	}
	public void setSupplierId(String supplierId) {
		SupplierId = supplierId;
	}
	public LocalDate getDeliveryDate() {
		return deliveryDate;
	}
	public void setDeliveryDate(LocalDate deliveryDate) {
		this.deliveryDate = deliveryDate;
	}
	
	public String getDeliveryStatus() {
		return deliveryStatus;
	}
	public void setDeliveryStatus(String deliveryStatus) {
		this.deliveryStatus = deliveryStatus;
	}	
}
