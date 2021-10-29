package baby.board.dto;

public class commentDto {
	
	int commentCode; //자동증감번호
	String commentInsertdate;
	String commentModate;
	String commentContent;
	
	public commentDto(int commentCode, String commentInsertdate, String commentModate, String commentContent) {
		super();
		this.commentCode = commentCode;
		this.commentInsertdate = commentInsertdate;
		this.commentModate = commentModate;
		this.commentContent = commentContent;
	}

	public int getCommentCode() {
		return commentCode;
	}

	public void setCommentCode(int commentCode) {
		this.commentCode = commentCode;
	}

	public String getCommentInsertdate() {
		return commentInsertdate;
	}

	public void setCommentInsertdate(String commentInsertdate) {
		this.commentInsertdate = commentInsertdate;
	}

	public String getCommentModate() {
		return commentModate;
	}

	public void setCommentModate(String commentModate) {
		this.commentModate = commentModate;
	}

	public String getCommentContent() {
		return commentContent;
	}

	public void setCommentContent(String commentContent) {
		this.commentContent = commentContent;
	}
	
}
