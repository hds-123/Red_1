package baby.board.dto;

public class writeDto {
	int writeCode; //글번호, 자동증감번호
	String user_userid;
	String writeTitle;
	String writeContent;
	String writeSortation;
	String writeLocation;
	String writeInsertdate;
	String writeModate;
	String writeDeldate;
	String writeFile;
	String writeRealfile;
	
	public writeDto() {
		// TODO Auto-generated constructor stub
	}

	public writeDto(int writeCode, String user_userid, String writeTitle, String writeContent, String writeSortation,
			String writeLocation, String writeInsertdate, String writeModate, String writeDeldate, String writeFile,
			String writeRealfile) {
		super();
		this.writeCode = writeCode;
		this.user_userid = user_userid;
		this.writeTitle = writeTitle;
		this.writeContent = writeContent;
		this.writeSortation = writeSortation;
		this.writeLocation = writeLocation;
		this.writeInsertdate = writeInsertdate;
		this.writeModate = writeModate;
		this.writeDeldate = writeDeldate;
		this.writeFile = writeFile;
		this.writeRealfile = writeRealfile;
	}

	public int getWriteCode() {
		return writeCode;
	}

	public void setWriteCode(int writeCode) {
		this.writeCode = writeCode;
	}

	public String getUser_userid() {
		return user_userid;
	}

	public void setUser_userid(String user_userid) {
		this.user_userid = user_userid;
	}

	public String getWriteTitle() {
		return writeTitle;
	}

	public void setWriteTitle(String writeTitle) {
		this.writeTitle = writeTitle;
	}

	public String getWriteContent() {
		return writeContent;
	}

	public void setWriteContent(String writeContent) {
		this.writeContent = writeContent;
	}

	public String getWriteSortation() {
		return writeSortation;
	}

	public void setWriteSortation(String writeSortation) {
		this.writeSortation = writeSortation;
	}

	public String getWriteLocation() {
		return writeLocation;
	}

	public void setWriteLocation(String writeLocation) {
		this.writeLocation = writeLocation;
	}

	public String getWriteInsertdate() {
		return writeInsertdate;
	}

	public void setWriteInsertdate(String writeInsertdate) {
		this.writeInsertdate = writeInsertdate;
	}

	public String getWriteModate() {
		return writeModate;
	}

	public void setWriteModate(String writeModate) {
		this.writeModate = writeModate;
	}

	public String getWriteDeldate() {
		return writeDeldate;
	}

	public void setWriteDeldate(String writeDeldate) {
		this.writeDeldate = writeDeldate;
	}

	public String getWriteFile() {
		return writeFile;
	}

	public void setWriteFile(String writeFile) {
		this.writeFile = writeFile;
	}

	public String getWriteRealfile() {
		return writeRealfile;
	}

	public void setWriteRealfile(String writeRealfile) {
		this.writeRealfile = writeRealfile;
	}

}
