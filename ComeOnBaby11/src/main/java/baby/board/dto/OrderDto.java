package baby.board.dto;

public class OrderDto {

	int orderid;
	String user_userid;
	int product_productid;
	String orderInsertdate;
	int orderAmount;
	int orderDeliverfee;
	
	public OrderDto(int orderid, String user_userid, int product_productid, String orderInsertdate, int orderAmount,
			int orderDeliverfee) {
		super();
		this.orderid = orderid;
		this.user_userid = user_userid;
		this.product_productid = product_productid;
		this.orderInsertdate = orderInsertdate;
		this.orderAmount = orderAmount;
		this.orderDeliverfee = orderDeliverfee;
	}

	public int getOrderid() {
		return orderid;
	}

	public void setOrderid(int orderid) {
		this.orderid = orderid;
	}

	public String getUser_userid() {
		return user_userid;
	}

	public void setUser_userid(String user_userid) {
		this.user_userid = user_userid;
	}

	public int getProduct_productid() {
		return product_productid;
	}

	public void setProduct_productid(int product_productid) {
		this.product_productid = product_productid;
	}

	public String getOrderInsertdate() {
		return orderInsertdate;
	}

	public void setOrderInsertdate(String orderInsertdate) {
		this.orderInsertdate = orderInsertdate;
	}

	public int getOrderAmount() {
		return orderAmount;
	}

	public void setOrderAmount(int orderAmount) {
		this.orderAmount = orderAmount;
	}

	public int getOrderDeliverfee() {
		return orderDeliverfee;
	}

	public void setOrderDeliverfee(int orderDeliverfee) {
		this.orderDeliverfee = orderDeliverfee;
	}
	
}
