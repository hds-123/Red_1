package baby.board.dto;

public class RegisterDto {

	String user_userid;
	int product_productid;
	String registerInsertdate;
	int registerAmount;
	
	public RegisterDto() {
		// TODO Auto-generated constructor stub
	}

	public RegisterDto(String user_userid, int product_productid, String registerInsertdate, int registerAmount) {
		super();
		this.user_userid = user_userid;
		this.product_productid = product_productid;
		this.registerInsertdate = registerInsertdate;
		this.registerAmount = registerAmount;
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

	public String getRegisterInsertdate() {
		return registerInsertdate;
	}

	public void setRegisterInsertdate(String registerInsertdate) {
		this.registerInsertdate = registerInsertdate;
	}

	public int getRegisterAmount() {
		return registerAmount;
	}

	public void setRegisterAmount(int registerAmount) {
		this.registerAmount = registerAmount;
	}
	
}
