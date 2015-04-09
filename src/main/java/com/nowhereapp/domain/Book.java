package com.nowhereapp.domain;

import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.Table;



@Entity
@Table(name="books")

public class Book {

	@Id
	@Column(name="id")
	@GeneratedValue
	private Integer id;
	
	@Column(name="book_name")
    private String bookName;
 
    //@Column(name="author")
	//private String author;
    
	//private List<Author> authors;

	@OneToMany(cascade=CascadeType.ALL)
    @JoinColumn(name="AUTHOR_ID")
    private Set<Author> authors;
    
	@Column(name="price")
    private int price;
    
    @Column(name="qty")
    private int quantity;
    
    
    public Integer getId(){
    	return id;
    }
 
    public String getBookName(){
    	return bookName;
    }
    
    /*
	public List<Author> getAuthors() {
		return authors;
	}

	public void setAuthors(List<Author> authors) {
		this.authors = authors;
	}
	*/
    
	
	/*
    public String getAuthor(){
    	return author;
    }
    */
	/*
    public void setAuthor(String author){
    	this.author = author;
    }
	*/
    
    
    public Set<Author> getAuthors() {
        return authors;
    }
 
    public void setAuthors(Set<Author> authors) {
        this.authors = authors;
    }
    
	
	public int getPrice(){
    	return price;
    }
 
    public int getQuantity(){
    	return quantity;
    }
 
    public void setId(Integer id){
    	this.id = id;
    }
 
    public void setBookName(String bookName){
    	this.bookName = bookName;
    }
 
    public void setPrice(int price){
    	this.price = price;
    }
 
    public void setQuantity(int quantity){
    	this.quantity = quantity;
    }
	
}