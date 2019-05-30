package com.cg.bookStore.beans;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Book
{
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int bookId;
	
	/*@OneToMany(mappedBy="categoryId", cascade=CascadeType.ALL)
	private List<Category> categoryList=new ArrayList<>();*/
	
	@Column(name="category_id")
	private int categoryId;

	@Column(name="book_title")
	private String bookTitle;

	@Column(name="book_author")
	private String bookAuthor;

	@Column(name="book_description")
	private String bookDescription;
	
	@Column(name="book_image")
	private String bookImage;

	@Column(name="isbn_no")
	private int isbnNo;

	@Column(name="price")
	private double price;

	@Column(name="publish_date")
	private Date publishDate;

	@Column(name="last_updated")
	private Date lastUpdated;

	@Column(name="book_quantity")
	private int bookQuantity;
	
	/*@OneToMany(mappedBy="customerId", cascade=CascadeType.ALL)
	private List<customerReview> reviewList=new ArrayList<>();
	*/
	
	/**************************Constructors*************************************/
	
	public Book(int bookId, int categoryId, String bookTitle, String bookAuthor, String bookDescription,
			String bookImage, int isbnNo, double price, Date publishDate, Date lastUpdated,
			int bookQuantity)
	{
		super();
		this.bookId = bookId;
		this.categoryId = categoryId;
		this.bookTitle = bookTitle;
		this.bookAuthor = bookAuthor;
		this.bookDescription = bookDescription;
		this.bookImage = bookImage;
		this.isbnNo = isbnNo;
		this.price = price;
		this.publishDate = publishDate;
		this.lastUpdated = lastUpdated;
		this.bookQuantity = bookQuantity;
	}


	public Book(int categoryId, String bookTitle, String bookAuthor, String bookDescription, String bookImage,
			int isbnNo, double price, Date publishDate, Date lastUpdated, int bookQuantity)
	{
		super();
		this.categoryId = categoryId;
		this.bookTitle = bookTitle;
		this.bookAuthor = bookAuthor;
		this.bookDescription = bookDescription;
		this.bookImage = bookImage;
		this.isbnNo = isbnNo;
		this.price = price;
		this.publishDate = publishDate;
		this.lastUpdated = lastUpdated;
		this.bookQuantity = bookQuantity;
	}


	public Book()
	{
		super();
	}


	/***************************************Getters*********************************************/
	
	
	public int getBookId() {
		return bookId;
	}


	public int getCategoryId() {
		return categoryId;
	}


	public String getBookTitle() {
		return bookTitle;
	}


	public String getBookAuthor() {
		return bookAuthor;
	}


	public String getBookDescription() {
		return bookDescription;
	}


	public String getBookImage() {
		return bookImage;
	}


	public int getIsbnNo() {
		return isbnNo;
	}


	public double getPrice() {
		return price;
	}


	public Date getPublishDate() {
		return publishDate;
	}


	public Date getLastUpdated() {
		return lastUpdated;
	}


	public int getBookQuantity() {
		return bookQuantity;
	}

	/*****************************************Setters****************************************/

	public void setBookId(int bookId) {
		this.bookId = bookId;
	}


	public void setCategoryId(int categoryId) {
		this.categoryId = categoryId;
	}


	public void setBookTitle(String bookTitle) {
		this.bookTitle = bookTitle;
	}


	public void setBookAuthor(String bookAuthor) {
		this.bookAuthor = bookAuthor;
	}


	public void setBookDescription(String bookDescription) {
		this.bookDescription = bookDescription;
	}


	public void setBookImage(String bookImage) {
		this.bookImage = bookImage;
	}


	public void setIsbnNo(int isbnNo) {
		this.isbnNo = isbnNo;
	}


	public void setPrice(double price) {
		this.price = price;
	}


	public void setPublishDate(Date publishDate) {
		this.publishDate = publishDate;
	}


	public void setLastUpdated(Date lastUpdated) {
		this.lastUpdated = lastUpdated;
	}


	public void setBookQuantity(int bookQuantity) {
		this.bookQuantity = bookQuantity;
	}


	@Override
	public String toString() {
		return "Book [bookId=" + bookId + ", categoryId=" + categoryId + ", bookTitle=" + bookTitle + ", bookAuthor="
				+ bookAuthor + ", bookDescription=" + bookDescription + ", bookImage=" + bookImage + ", isbnNo="
				+ isbnNo + ", price=" + price + ", publishDate=" + publishDate + ", lastUpdated=" + lastUpdated
				+ ", bookQuantity=" + bookQuantity + "]";
	}
	
	
	 
	
	

}
