package com.shoes.dto;

import java.sql.Timestamp;

public class PDto {
	
	// Field
	
	int productid;
	String productname;
	int productprice;
	int productsize;
	String productsection;
	String productcolor;
	String productqnt;
	Timestamp productputin;
	String productmadein;
	
	// Constructor
	public PDto() {

	}

	public PDto(int productid, String productname, int productprice, int productsize, String productsection,
			String productcolor, String productqnt, Timestamp productputin, String productmadein) {
		super();
		this.productid = productid;
		this.productname = productname;
		this.productprice = productprice;
		this.productsize = productsize;
		this.productsection = productsection;
		this.productcolor = productcolor;
		this.productqnt = productqnt;
		this.productputin = productputin;
		this.productmadein = productmadein;
	}

	public int getProductid() {
		return productid;
	}

	public void setProductid(int productid) {
		this.productid = productid;
	}

	public String getProductname() {
		return productname;
	}

	public void setProductname(String productname) {
		this.productname = productname;
	}

	public int getProductprice() {
		return productprice;
	}

	public void setProductprice(int productprice) {
		this.productprice = productprice;
	}

	public int getProductsize() {
		return productsize;
	}

	public void setProductsize(int productsize) {
		this.productsize = productsize;
	}

	public String getProductsection() {
		return productsection;
	}

	public void setProductsection(String productsection) {
		this.productsection = productsection;
	}

	public String getProductcolor() {
		return productcolor;
	}

	public void setProductcolor(String productcolor) {
		this.productcolor = productcolor;
	}

	public String getProductqnt() {
		return productqnt;
	}

	public void setProductqnt(String productqnt) {
		this.productqnt = productqnt;
	}

	public Timestamp getProductputin() {
		return productputin;
	}

	public void setProductputin(Timestamp productputin) {
		this.productputin = productputin;
	}

	public String getProductmadein() {
		return productmadein;
	}

	public void setProductmadein(String productmadein) {
		this.productmadein = productmadein;
	}

	// Method
	
	
	
}
