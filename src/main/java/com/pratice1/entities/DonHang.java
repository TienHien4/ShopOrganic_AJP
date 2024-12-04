package com.pratice1.entities;

import javax.persistence.*;

@Entity
@Table(name = "DonHang")
public class DonHang {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int id;
	@Column(name="nameBuyer")
	private String nameBuyer;
	@Column(name="nameProduct")
	private String nameProduct;
	@Column(name="size")
	private String size;
	@Column(name="price")
	private double price;
	@Column(name="date")
	private String date;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getNameBuyer() {
		return nameBuyer;
	}
	public void setNameBuyer(String nameBuyer) {
		this.nameBuyer = nameBuyer;
	}
	public String getNameProduct() {
		return nameProduct;
	}
	public void setNameProduct(String nameProduct) {
		this.nameProduct = nameProduct;
	}
	public String getSize() {
		return size;
	}
	public void setSize(String size) {
		this.size = size;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public String getDate() {
		return date;
	}
	public void setDate(String date) {
		this.date = date;
	}
	
	
	
	

}
