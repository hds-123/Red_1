package baby.calender.dto;

public class CDto {
	
	// Field
	int calCode;
	String calInsertdate;
	String calTitle;
	String calContent;
	String calFeel;
	String calStartday;
	String calEndday;
	int calCycle;
	String calPhoto;
	String calPhoto_real;
	String calUserid;
	String calCheckCode;
	
	// Constructor
	public CDto() {
		// TODO Auto-generated constructor stub
	}

	public CDto(int calCode, String calInsertdate, String calTitle, String calContent, String calFeel,
			String calStartday, String calEndday, int calCycle, String calPhoto, String calPhoto_real, String calUserid,
			String calCheckCode) {
		super();
		this.calCode = calCode;
		this.calInsertdate = calInsertdate;
		this.calTitle = calTitle;
		this.calContent = calContent;
		this.calFeel = calFeel;
		this.calStartday = calStartday;
		this.calEndday = calEndday;
		this.calCycle = calCycle;
		this.calPhoto = calPhoto;
		this.calPhoto_real = calPhoto_real;
		this.calUserid = calUserid;
		this.calCheckCode = calCheckCode;
	}
	
	// Method

	public int getCalCode() {
		return calCode;
	}

	public void setCalCode(int calCode) {
		this.calCode = calCode;
	}

	public String getCalInsertdate() {
		return calInsertdate;
	}

	public void setCalInsertdate(String calInsertdate) {
		this.calInsertdate = calInsertdate;
	}

	public String getCalTitle() {
		return calTitle;
	}

	public void setCalTitle(String calTitle) {
		this.calTitle = calTitle;
	}

	public String getCalContent() {
		return calContent;
	}

	public void setCalContent(String calContent) {
		this.calContent = calContent;
	}

	public String getCalFeel() {
		return calFeel;
	}

	public void setCalFeel(String calFeel) {
		this.calFeel = calFeel;
	}

	public String getCalStartday() {
		return calStartday;
	}

	public void setCalStartday(String calStartday) {
		this.calStartday = calStartday;
	}

	public String getCalEndday() {
		return calEndday;
	}

	public void setCalEndday(String calEndday) {
		this.calEndday = calEndday;
	}

	public int getCalCycle() {
		return calCycle;
	}

	public void setCalCycle(int calCycle) {
		this.calCycle = calCycle;
	}

	public String getCalPhoto() {
		return calPhoto;
	}

	public void setCalPhoto(String calPhoto) {
		this.calPhoto = calPhoto;
	}

	public String getCalPhoto_real() {
		return calPhoto_real;
	}

	public void setCalPhoto_real(String calPhoto_real) {
		this.calPhoto_real = calPhoto_real;
	}

	public String getCalUserid() {
		return calUserid;
	}

	public void setCalUserid(String calUserid) {
		this.calUserid = calUserid;
	}

	public String getCalCheckCode() {
		return calCheckCode;
	}

	public void setCalCheckCode(String calCheckCode) {
		this.calCheckCode = calCheckCode;
	}
	




	


	
	
	


}



