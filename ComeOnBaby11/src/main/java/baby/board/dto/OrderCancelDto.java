package baby.board.dto;

public class OrderCancelDto {

	int cancelorderid;
	String user_userid;
	int product_productid;
	String cancelDate;
	int cancelAmount;
	
	public OrderCancelDto() {
		// TODO Auto-generated constructor stub
	}

	public OrderCancelDto(int cancelorderid, String user_userid, int product_productid, String cancelDate,
			int cancelAmount) {
		super();
		this.cancelorderid = cancelorderid;
		this.user_userid = user_userid;
		this.product_productid = product_productid;
		this.cancelDate = cancelDate;
		this.cancelAmount = cancelAmount;
	}

	public int getCancelorderid() {
		return cancelorderid;
	}

	public void setCancelorderid(int cancelorderid) {
		this.cancelorderid = cancelorderid;
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

	public String getCancelDate() {
		return cancelDate;
	}

	public void setCancelDate(String cancelDate) {
		this.cancelDate = cancelDate;
	}

	public int getCancelAmount() {
		return cancelAmount;
	}

	public void setCancelAmount(int cancelAmount) {
		this.cancelAmount = cancelAmount;
	}
	
}
