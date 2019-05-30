package com.cg.bookStore.beans;



import java.util.Date;

import javax.persistence.Entity;
@Entity
public class customerReview
{
	private int bookRating;
	private String headLine;
	private String comment;
	private int bookId;
	private int customerId;
	private Date reviewDate;
	

	/********************Constructors*******************************/
	
	public customerReview(int bookRating, String headLine, String comment, int bookId, int customerId,
			Date reviewDate)
	{
		super();
		this.bookRating = bookRating;
		this.headLine = headLine;
		this.comment = comment;
		this.bookId = bookId;
		this.customerId = customerId;
		this.reviewDate = reviewDate;
	}


	public customerReview(int bookRating, String headLine, String comment, int customerId, Date reviewDate)
	{
		super();
		this.bookRating = bookRating;
		this.headLine = headLine;
		this.comment = comment;
		this.customerId = customerId;
		this.reviewDate = reviewDate;
	}


	public customerReview()
	{
		super();
	}


	/******************************************Getters******************************************/
	
	public int getBookRating() {
		return bookRating;
	}


	public String getHeadLine() {
		return headLine;
	}


	public String getComment() {
		return comment;
	}


	public int getBookId() {
		return bookId;
	}


	public int getCustomerId() {
		return customerId;
	}


	public Date getReviewDate() {
		return reviewDate;
	}


	/******************************************Getters******************************************/
	
	
	public void setBookRating(int bookRating) {
		this.bookRating = bookRating;
	}


	public void setHeadLine(String headLine) {
		this.headLine = headLine;
	}


	public void setComment(String comment) {
		this.comment = comment;
	}


	public void setBookId(int bookId) {
		this.bookId = bookId;
	}


	public void setCustomerId(int customerId) {
		this.customerId = customerId;
	}


	public void setReviewDate(Date reviewDate) {
		this.reviewDate = reviewDate;
	}


	@Override
	public String toString()
	{
		return "customerReview [bookRating=" + bookRating + ", headLine=" + headLine + ", comment=" + comment
				+ ", bookId=" + bookId + ", customerId=" + customerId + ", reviewDate=" + reviewDate + "]";
	}

	
	
	
	

}
