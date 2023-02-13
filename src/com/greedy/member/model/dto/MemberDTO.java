package com.greedy.member.model.dto;

import java.util.Date;

public class MemberDTO {
	
	private int memberNo;
	private String memberId;
	private String memberPwd;
	private String memberName;
	private String gender;
	private String email;
	private String phone;
	private String address;
	private int age;
	private java.sql.Date enrollDate;
	
	public MemberDTO() {}

	public MemberDTO(int memberNo, String memberId, String memberPwd, String memberName, String gender, String email,
			String phone, String address, int age, java.sql.Date enrollDate) {
		super();
		this.memberNo = memberNo;
		this.memberId = memberId;
		this.memberPwd = memberPwd;
		this.memberName = memberName;
		this.gender = gender;
		this.email = email;
		this.phone = phone;
		this.address = address;
		this.age = age;
		this.enrollDate = enrollDate;
	}

	public int getMemberNo() {
		return memberNo;
	}

	public String getMemberId() {
		return memberId;
	}

	public String getMemberPwd() {
		return memberPwd;
	}

	public String getMemberName() {
		return memberName;
	}

	public String getGender() {
		return gender;
	}

	public String getEmail() {
		return email;
	}

	public String getPhone() {
		return phone;
	}

	public String getAddress() {
		return address;
	}

	public int getAge() {
		return age;
	}

	public java.util.Date getEnrollDate() {
		return enrollDate;
	}

	public void setMemberNo(int memberNo) {
		this.memberNo = memberNo;
	}

	public void setMemberId(String memberId) {
		this.memberId = memberId;
	}

	public void setMemberPwd(String memberPwd) {
		this.memberPwd = memberPwd;
	}

	public void setMemberName(String memberName) {
		this.memberName = memberName;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public void setEnrollDate(java.sql.Date enrollDate) {
		this.enrollDate = enrollDate;
	}

	@Override
	public String toString() {
		return "MemberDTO [memberNo=" + memberNo + ", memberId=" + memberId + ", memberPwd=" + memberPwd
				+ ", memberName=" + memberName + ", gender=" + gender + ", email=" + email + ", phone=" + phone
				+ ", address=" + address + ", age=" + age + ", enrollDate=" + enrollDate + "]";
	}

	
}

	