package com.cg.anurag.b2.ims.dto;
import java.time.LocalDate;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="productorders")
public class ProductOrderDetails
{
	@Id
	@Column(name="orderid")
	String orderId;
	@Column(name="productname")
	String productName;
	@Column(name="priceperunit")
	double pricePerUnit;
	@Column(name="quantityvalue")
	double quantityValue;
	@Column(name="totalprice")
	double totalPrice;
	@Column(name="warehouseid")
	String wareHouseId;
	@Column(name="distributorid")
	String distributorId;
	@Column(name="dateoforder")
	LocalDate dateoforder;
	@Column(name="deliverydate")
	LocalDate deliveryDate;
	@Column(name="deliverystatus")
	String deliveryStatus;
	public ProductOrderDetails() {}
	public ProductOrderDetails(String orderId, String productName, double pricePerUnit, double quantityValue,
			double totalPrice, String wareHouseId, String distributorId,LocalDate dateoforder, LocalDate deliveryDate,
			 String deliveryStatus) {
		this.orderId = orderId;
		this.productName = productName;
		this.pricePerUnit = pricePerUnit;
		this.quantityValue = quantityValue;
		this.totalPrice = totalPrice;
		this.wareHouseId = wareHouseId;
		this.distributorId=distributorId;
		this.dateoforder=dateoforder;
		this.deliveryDate = deliveryDate;
		
		this.deliveryStatus = deliveryStatus;

	}
	public String getOrderId() {
		return orderId;
	}
	public void setOrderId(String orderId) {
		this.orderId = orderId;
	}
	public String getProductName() {
		return productName;
	}
	public void setProductName(String productName) {
		this.productName = productName;
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
	public String getDistributorId() {
		return distributorId;
	}
	public void setDistributorId(String distributorId) {
		this.distributorId = distributorId;
	}
	
	public LocalDate getDateoforder() {
		return dateoforder;
	}
	public void setDateoforder(LocalDate dateoforder) {
		this.dateoforder = dateoforder;
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

