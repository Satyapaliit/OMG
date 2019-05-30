package com.cg.bookStore.beans;


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Admin
{
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	
	@Column(name="admin_Id")
	private int adminId;
	
	@Column(name="admin_Email")
	private String adminEmail;

	@Column(name="admin_Name")
	private String adminName;
	
	@Column(name="admin_Password")
	private String adminPassword;
	
	/*@OneToOne(cascade=CascadeType.ALL)
	@JoinColumn(name="order_Id")
	private OrderInfo orderStatus;
	*/
	/*************************Constructors**/
	
	public Admin(String adminEmail, String adminName, String adminPassword)
	{
		super();
		this.adminEmail = adminEmail;
		this.adminName = adminName;
		this.adminPassword = adminPassword;
	}

	public Admin()
	{
		super();

	}


	/**************************Getters*********************************/
	
	public String getAdminEmail() {
		return adminEmail;
	}

	public String getAdminName() {
		return adminName;
	}

	public String getAdminPassword() {
		return adminPassword;
	}
	
	
	
	public int getAdminId() {
		return adminId;
	}
	
	
	
	/**************************Setters*********************************/

	public void setAdminId(int adminId) {
		this.adminId = adminId;
	}

	public void setAdminEmail(String adminEmail) {
		this.adminEmail = adminEmail;
	}

	public void setAdminName(String adminName) {
		this.adminName = adminName;
	}

	public void setAdminPassword(String adminPassword) {
		this.adminPassword = adminPassword;
	}

	
	
	@Override
	public String toString() {
		return "Admin [adminId=" + adminId + ", adminEmail=" + adminEmail + ", adminName=" + adminName
				+ ", adminPassword=" + adminPassword + "]";
	}
}
