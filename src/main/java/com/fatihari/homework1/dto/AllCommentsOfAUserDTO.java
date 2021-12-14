package com.fatihari.homework1.dto;

import java.util.Date;

public class AllCommentsOfAUserDTO 
{
	private Long id;
	private String userFirstName;
	private String userLastName;
	private String productName;
	private String commentText;
	private Date commentDate;
	
	public AllCommentsOfAUserDTO() {
	}
	
	public AllCommentsOfAUserDTO(Long id, String userFirstName, String userLastName, String productName,
			String commentText, Date commentDate) {
		this.id = id;
		this.userFirstName = userFirstName;
		this.userLastName = userLastName;
		this.productName = productName;
		this.commentText = commentText;
		this.commentDate = commentDate;
	}

	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getUserFirstName() {
		return userFirstName;
	}
	public void setUserFirstName(String userFirstName) {
		this.userFirstName = userFirstName;
	}
	public String getUserLastName() {
		return userLastName;
	}
	public void setUserLastName(String userLastName) {
		this.userLastName = userLastName;
	}
	public String getProductName() {
		return productName;
	}
	public void setProductName(String productName) {
		this.productName = productName;
	}
	public String getCommentText() {
		return commentText;
	}
	public void setCommentText(String commentText) {
		this.commentText = commentText;
	}
	public Date getCommentDate() {
		return commentDate;
	}
	public void setCommentDate(Date commentDate) {
		this.commentDate = commentDate;
	}

	@Override
	public String toString() {
		return "AllCommentsOfAUserDTO [id=" + id + ", userFirstName=" + userFirstName + ", userLastName=" + userLastName
				+ ", productName=" + productName + ", commentText=" + commentText + ", commentDate=" + commentDate
				+ "]";
	}
}
