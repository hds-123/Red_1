package user;


public class User {
	String userid;
	String userpw;
	String username;
	String useraddress1;
	String useraddress2;
	String userphone;
	String userbirth;
	String useremail;
	String userhospital;
	int admin;
	public User() {
		// TODO Auto-generated constructor stub
	}
	public User(String userid, String userpw, String username, String useraddress1, String useraddress2,
			String userphone, String userbirth, String useremail,String userhospital, int admin) {
		super();
		this.userid = userid;
		this.userpw = userpw;
		this.username = username;
		this.useraddress1 = useraddress1;
		this.useraddress2 = useraddress2;
		this.userphone = userphone;
		this.userbirth = userbirth;
		this.useremail = useremail;
		this.userhospital = userhospital;
		this.admin = admin;
	}
	public String getUserid() {
		return userid;
	}
	public void setUserid(String userid) {
		this.userid = userid;
	}
	public String getUserpw() {
		return userpw;
	}
	public void setUserpw(String userpw) {
		this.userpw = userpw;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getUseraddress1() {
		return useraddress1;
	}
	public void setUseraddress1(String useraddress1) {
		this.useraddress1 = useraddress1;
	}
	public String getUseraddress2() {
		return useraddress2;
	}
	public void setUseraddress2(String useraddress2) {
		this.useraddress2 = useraddress2;
	}
	public String getUserphone() {
		return userphone;
	}
	public void setUserphone(String userphone) {
		this.userphone = userphone;
	}
	public String getUserbirth() {
		return userbirth;
	}
	public void setUserbirth(String userbirth) {
		this.userbirth = userbirth;
	}
	public String getUseremail() {
		return useremail;
	}
	public void setUseremail(String useremail) {
		this.useremail = useremail;
	}
	public String getUserhospital() {
		return userhospital;
	}
	public void setUserhospital(String userhospital) {
		this.userhospital = userhospital;
	}
	public int getAdmin() {
		return admin;
	}
	public void setAdmin(int admin) {
		this.admin = admin;
	}


}