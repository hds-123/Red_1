package baby.board.dto;

public class ProductDto {
	
	int productid; //자동증감번호
	String productname;
	String productcategory;
	int productprice;
	int productsaleprice;
	String p_detail_category;
	String productImage;
	String productRealPath;
	
	public ProductDto() {
		// TODO Auto-generated constructor stub
	}

	public ProductDto(int productid, String productname, String productcategory, int productprice, int productsaleprice,
			String p_detail_category, String productImage, String productRealPath) {
		super();
		this.productid = productid;
		this.productname = productname;
		this.productcategory = productcategory;
		this.productprice = productprice;
		this.productsaleprice = productsaleprice;
		this.p_detail_category = p_detail_category;
		this.productImage = productImage;
		this.productRealPath = productRealPath;
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

	public String getProductImage() {
		return productImage;
	}

	public void setProductImage(String productImage) {
		this.productImage = productImage;
	}

	public String getProductRealPath() {
		return productRealPath;
	}

	public void setProductRealPath(String productRealPath) {
		this.productRealPath = productRealPath;
	}
	
}
