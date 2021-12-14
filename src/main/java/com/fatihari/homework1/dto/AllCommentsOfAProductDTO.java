package com.fatihari.homework1.dto;

import java.math.BigDecimal;
import java.util.Date;

public class AllCommentsOfAProductDTO 
{
	private String productName;
	private String categoryName;
	private BigDecimal productPrice;
	private String userFirstName;
	private String userLastName;
	private String userEmail;
	private String userPhone;
	private String commentText;
	private Date commentDate;

	public AllCommentsOfAProductDTO() {
	}

	public AllCommentsOfAProductDTO(String productName, String categoryName, BigDecimal productPrice,
			String userFirstName, String userLastName, String userEmail, String userPhone, String commentText,
			Date commentDate) {
		this.productName = productName;
		this.categoryName = categoryName;
		this.productPrice = productPrice;
		this.userFirstName = userFirstName;
		this.userLastName = userLastName;
		this.userEmail = userEmail;
		this.userPhone = userPhone;
		this.commentText = commentText;
		this.commentDate = commentDate;
	}

	public String getProductName() {
		return productName;
	}

	public void setProductName(String productName) {
		this.productName = productName;
	}

	public String getCategoryName() {
		return categoryName;
	}

	public void setCategoryName(String categoryName) {
		this.categoryName = categoryName;
	}

	public BigDecimal getProductPrice() {
		return productPrice;
	}

	public void setProductPrice(BigDecimal productPrice) {
		this.productPrice = productPrice;
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

	public String getUserEmail() {
		return userEmail;
	}

	public void setUserEmail(String userEmail) {
		this.userEmail = userEmail;
	}

	public String getUserPhone() {
		return userPhone;
	}

	public void setUserPhone(String userPhone) {
		this.userPhone = userPhone;
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
		return "AllCommentsOfAProductDTO [productName=" + productName + ", categoryName=" + categoryName
				+ ", productPrice=" + productPrice + ", userFirstName=" + userFirstName + ", userLastName="
				+ userLastName + ", userEmail=" + userEmail + ", userPhone=" + userPhone + ", commentText="
				+ commentText + ", commentDate=" + commentDate + "]";
	}
}
