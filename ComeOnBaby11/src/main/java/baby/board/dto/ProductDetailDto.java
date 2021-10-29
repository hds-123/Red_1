package baby.board.dto;

public class ProductDetailDto {
	
	int detailproductid;
	int detailAmount;
	double detailStarscore;
	String detailReview;
	String detailSize;
	String detailColor;
	
	public ProductDetailDto() {
		// TODO Auto-generated constructor stub
	}

	public ProductDetailDto(int detailAmount, double detailStarscore, String detailReview, String detailSize,
			String detailColor) {
		super();
		this.detailAmount = detailAmount;
		this.detailStarscore = detailStarscore;
		this.detailReview = detailReview;
		this.detailSize = detailSize;
		this.detailColor = detailColor;
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

	public String getDetailSize() {
		return detailSize;
	}

	public void setDetailSize(String detailSize) {
		this.detailSize = detailSize;
	}

	public String getDetailColor() {
		return detailColor;
	}

	public void setDetailColor(String detailColor) {
		this.detailColor = detailColor;
	}
	
}
