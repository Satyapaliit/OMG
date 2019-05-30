package com.cg.bookStore.beans;



import java.util.Date;

import javax.persistence.Entity;
@Entity
public class OrderInfo
{
	private int orderId;
	private int bookId;
	private int quantity;
	private double total;
	private String orderStatus;
	
	private String paymentMethod;
	private Date orderDate;

		
	/******************************************Constructors*************************/
	
		public OrderInfo(int orderId, int bookId, int quantity, double total, String orderStatus, String paymentMethod,
			Date orderDate)
	{
		super();
		this.orderId = orderId;
		this.bookId = bookId;
		this.quantity = quantity;
		this.total = total;
		this.orderStatus = orderStatus;
		this.paymentMethod = paymentMethod;
		this.orderDate = orderDate;
	}


	public OrderInfo(int bookId, int quantity, double total, String orderStatus, String paymentMethod,
			Date orderDate)
	{
		super();
		this.bookId = bookId;
		this.quantity = quantity;
		this.total = total;
		this.orderStatus = orderStatus;
		this.paymentMethod = paymentMethod;
		this.orderDate = orderDate;
	}


	public OrderInfo()
	{
		super();
	}


	/*********************************Getters*********************************************/
	
	
	public int getOrderId() {
		return orderId;
	}


	public int getBookId() {
		return bookId;
	}


	public int getQuantity() {
		return quantity;
	}


	public double getTotal() {
		return total;
	}


	public String getOrderStatus() {
		return orderStatus;
	}


	public String getPaymentMethod() {
		return paymentMethod;
	}


	public Date getOrderDate() {
		return orderDate;
	}

	
	
	/*********************************Setters*********************************************/
	

	public void setOrderId(int orderId) {
		this.orderId = orderId;
	}


	public void setBookId(int bookId) {
		this.bookId = bookId;
	}


	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}


	public void setTotal(double total) {
		this.total = total;
	}


	public void setOrderStatus(String orderStatus) {
		this.orderStatus = orderStatus;
	}


	public void setPaymentMethod(String paymentMethod) {
		this.paymentMethod = paymentMethod;
	}


	public void setOrderDate(Date orderDate) {
		this.orderDate = orderDate;
	}


	@Override
	public String toString()
	{
		return "OrderInfo [orderId=" + orderId + ", bookId=" + bookId + ", quantity=" + quantity + ", total=" + total
				+ ", orderStatus=" + orderStatus + ", paymentMethod=" + paymentMethod + ", orderDate=" + orderDate
				+ "]";
	}
	
	
	
	
	
	
	
	

}
