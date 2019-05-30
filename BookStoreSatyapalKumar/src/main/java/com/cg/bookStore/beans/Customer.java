package com.cg.bookStore.beans;



import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
@Entity
public class Customer
{
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	protected int customerId;
	private String customerName;
	private String customerEmail;
	private String customerPassword;
	private String customerMobile;
	private String customerAddress;
	private String customerCity;
	private String zipCode;
	private String customerCountry;
	private Date registrationDate;
	
	/***********************Constructors**************************/
	
	public Customer()
	{
		super();
	}

	public Customer(String customerName, String customerEmail, String customerPassword, String customerMobile,
			String customerAddress, String customerCity, String zipCode, String customerCountry,
			Date registrationDate)
	{
		super();
		this.customerName = customerName;
		this.customerEmail = customerEmail;
		this.customerPassword = customerPassword;
		this.customerMobile = customerMobile;
		this.customerAddress = customerAddress;
		this.customerCity = customerCity;
		this.zipCode = zipCode;
		this.customerCountry = customerCountry;
		this.registrationDate = registrationDate;
	}
	
	
	/***********************Getters**************************/
	
	

	public int getCustomerId() {
		return customerId;
	}

	public String getCustomerName() {
		return customerName;
	}

	public String getCustomerEmail() {
		return customerEmail;
	}

	public String getCustomerPassword() {
		return customerPassword;
	}

	public String getCustomerMobile() {
		return customerMobile;
	}

	public String getCustomerAddress() {
		return customerAddress;
	}

	public String getCustomerCity() {
		return customerCity;
	}

	public String getZipCode() {
		return zipCode;
	}

	public String getCustomerCountry() {
		return customerCountry;
	}

	public Date getRegistrationDate() {
		return registrationDate;
	}

	
	/***********************Setters**************************/
	
	
	
	
	public void setCustomerId(int customerId) {
		this.customerId = customerId;
	}

	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}

	public void setCustomerEmail(String customerEmail) {
		this.customerEmail = customerEmail;
	}

	public void setCustomerPassword(String customerPassword) {
		this.customerPassword = customerPassword;
	}

	public void setCustomerMobile(String customerMobile) {
		this.customerMobile = customerMobile;
	}

	public void setCustomerAddress(String customerAddress) {
		this.customerAddress = customerAddress;
	}

	public void setCustomerCity(String customerCity) {
		this.customerCity = customerCity;
	}

	public void setZipCode(String zipCode) {
		this.zipCode = zipCode;
	}

	public void setCustomerCountry(String customerCountry) {
		this.customerCountry = customerCountry;
	}

	public void setRegistrationDate(Date registrationDate) {
		this.registrationDate = registrationDate;
	}

	/***********************toString**************************/
	
	@Override
	public String toString()
	{
		return "Customer [customerId=" + customerId + ", customerName=" + customerName + ", customerEmail="
				+ customerEmail + ", customerPassword=" + customerPassword + ", customerMobile=" + customerMobile
				+ ", customerAddress=" + customerAddress + ", customerCity=" + customerCity + ", zipCode=" + zipCode
				+ ", customerCountry=" + customerCountry + ", registrationDate=" + registrationDate + "]";
	}
	
	

	
	
	
}
