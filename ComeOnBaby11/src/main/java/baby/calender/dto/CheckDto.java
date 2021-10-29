package baby.calender.dto;

public class CheckDto {
	
	// Field
	
	int checkCode;
	String checkDrug;
	String checkAppHospital;
	String checkAppointdate;
	String checkAppointTime;
	String checkBodytemp;
	String checkRelation;
	String checkHAddress1;
	String checkHAddress2;
	
	// Constructor
	
	public CheckDto() {
		// TODO Auto-generated constructor stub
	}

	public CheckDto(int checkCode, String checkDrug, String checkAppHospital, String checkAppointdate,
			String checkAppointTime, String checkBodytemp, String checkRelation, String checkHAddress1,
			String checkHAddress2) {
		super();
		this.checkCode = checkCode;
		this.checkDrug = checkDrug;
		this.checkAppHospital = checkAppHospital;
		this.checkAppointdate = checkAppointdate;
		this.checkAppointTime = checkAppointTime;
		this.checkBodytemp = checkBodytemp;
		this.checkRelation = checkRelation;
		this.checkHAddress1 = checkHAddress1;
		this.checkHAddress2 = checkHAddress2;
	}
	
	// Method

	public int getCheckCode() {
		return checkCode;
	}

	public void setCheckCode(int checkCode) {
		this.checkCode = checkCode;
	}

	public String getCheckDrug() {
		return checkDrug;
	}

	public void setCheckDrug(String checkDrug) {
		this.checkDrug = checkDrug;
	}

	public String getCheckAppHospital() {
		return checkAppHospital;
	}

	public void setCheckAppHospital(String checkAppHospital) {
		this.checkAppHospital = checkAppHospital;
	}

	public String getCheckAppointdate() {
		return checkAppointdate;
	}

	public void setCheckAppointdate(String checkAppointdate) {
		this.checkAppointdate = checkAppointdate;
	}

	public String getCheckAppointTime() {
		return checkAppointTime;
	}

	public void setCheckAppointTime(String checkAppointTime) {
		this.checkAppointTime = checkAppointTime;
	}

	public String getCheckBodytemp() {
		return checkBodytemp;
	}

	public void setCheckBodytemp(String checkBodytemp) {
		this.checkBodytemp = checkBodytemp;
	}

	public String getCheckRelation() {
		return checkRelation;
	}

	public void setCheckRelation(String checkRelation) {
		this.checkRelation = checkRelation;
	}

	public String getCheckHAddress1() {
		return checkHAddress1;
	}

	public void setCheckHAddress1(String checkHAddress1) {
		this.checkHAddress1 = checkHAddress1;
	}

	public String getCheckHAddress2() {
		return checkHAddress2;
	}

	public void setCheckHAddress2(String checkHAddress2) {
		this.checkHAddress2 = checkHAddress2;
	}
	
	
	
	
	
	
	


}
