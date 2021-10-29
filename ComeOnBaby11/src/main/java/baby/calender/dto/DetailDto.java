package baby.calender.dto;

public class DetailDto {
	
	// Field
	
	int detailCode;
	int detailproductid;
	int detailAmount;
	double detailStarscore;
	String detailReview;
	String detailColor;
	String detailSize;
	
	
	// Constructor
	public DetailDto() {
		// TODO Auto-generated constructor stub
	}


	public DetailDto(int detailCode, int detailproductid, int detailAmount, double detailStarscore, String detailReview,
			String detailColor, String detailSize) {
		super();
		this.detailCode = detailCode;
		this.detailproductid = detailproductid;
		this.detailAmount = detailAmount;
		this.detailStarscore = detailStarscore;
		this.detailReview = detailReview;
		this.detailColor = detailColor;
		this.detailSize = detailSize;
	}
	
	// Method


	public int getDetailCode() {
		return detailCode;
	}


	public void setDetailCode(int detailCode) {
		this.detailCode = detailCode;
	}


	public int getDetailproductid() {
		return detailproductid;
	}


	public void setDetailproductid(int detailproductid) {
		this.detailproductid = detailproductid;
	}


	public int getDetailAmount() {
		return detailAmount;
	}


	public void setDetailAmount(int detailAmount) {
		this.detailAmount = detailAmount;
	}


	public double getDetailStarscore() {
		return detailStarscore;
	}


	public void setDetailStarscore(double detailStarscore) {
		this.detailStarscore = detailStarscore;
	}


	public String getDetailReview() {
		return detailReview;
	}


	public void setDetailReview(String detailReview) {
		this.detailReview = detailReview;
	}


	public String getDetailColor() {
		return detailColor;
	}


	public void setDetailColor(String detailColor) {
		this.detailColor = detailColor;
	}


	public String getDetailSize() {
		return detailSize;
	}


	public void setDetailSize(String detailSize) {
		this.detailSize = detailSize;
	}
	
	
	
	
	
	

}
