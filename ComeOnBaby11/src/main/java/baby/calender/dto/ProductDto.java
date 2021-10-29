package baby.calender.dto;

public class ProductDto {
	
	// Field
	
	int productid;
	String productname;
	String productcategory;
	int productprice;
	int productsaleprice;
	String p_detail_category;
	
	// Constructor
	public ProductDto() {
		// TODO Auto-generated constructor stub
	}

	public ProductDto(int productid, String productname, String productcategory, int productprice, int productsaleprice,
			String p_detail_category) {
		super();
		this.productid = productid;
		this.productname = productname;
		this.productcategory = productcategory;
		this.productprice = productprice;
		this.productsaleprice = productsaleprice;
		this.p_detail_category = p_detail_category;
	}
	
	// Method

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

	public String getProductcategory() {
		return productcategory;
	}

	public void setProductcategory(String productcategory) {
		this.productcategory = productcategory;
	}

	public int getProductprice() {
		return productprice;
	}

	public void setProductprice(int productprice) {
		this.productprice = productprice;
	}

	public int getProductsaleprice() {
		return productsaleprice;
	}

	public void setProductsaleprice(int productsaleprice) {
		this.productsaleprice = productsaleprice;
	}

	public String getP_detail_category() {
		return p_detail_category;
	}

	public void setP_detail_category(String p_detail_category) {
		this.p_detail_category = p_detail_category;
	}
	
	
	
	
	

}
