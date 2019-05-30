package com.cg.bookStore.beans;

import javax.persistence.Entity;

@Entity
public class Category
{
	private int categoryId;
	private String categoryName;
	
	
	/***********************************Constructors*********************************/
	public Category(int categoryId, String categoryName)
	{
		super();
		this.categoryId = categoryId;
		this.categoryName = categoryName;
	}



	public Category()
	{
		super();
	}

	/********************************Getters************************************************/

	public int getCategoryId() {
		return categoryId;
	}



	public String getCategoryName() {
		return categoryName;
	}

	/****************************************Setters*****************************************/

	public void setCategoryId(int categoryId) {
		this.categoryId = categoryId;
	}



	public void setCategoryName(String categoryName) {
		this.categoryName = categoryName;
	}



	@Override
	public String toString()
	{
		return "Category [categoryId=" + categoryId + ", categoryName=" + categoryName + "]";
	}

	
	
	
	
	
}
