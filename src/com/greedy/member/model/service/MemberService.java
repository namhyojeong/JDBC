package com.greedy.member.model.service;

import static com.greedy.common.JDBCTemplate.close;
import static com.greedy.common.JDBCTemplate.commit;
import static com.greedy.common.JDBCTemplate.getConnection;
import static com.greedy.common.JDBCTemplate.rollback;

import java.sql.Connection;
import java.util.List;

import com.greedy.member.model.dao.MemberDAO;
import com.greedy.member.model.dto.MemberDTO;

public class MemberService {

	private MemberDAO memberDAO = new MemberDAO();
	
	public boolean createdNewMember(MemberDTO member) {
		
		Connection con = getConnection();
		
		int result = memberDAO.insertMember(con, member);
		
		if(result > 0) {
			commit(con);
		} else {
			rollback(con);
		}
		
		close(con);
		
		return result > 0? true: false;
		
	}
	
	public List<MemberDTO> selectAllMembers() {
		
		Connection con = getConnection();
		
		List<MemberDTO> memberList = memberDAO.selectAllMember(con);
		
		close(con);
		
		return memberList;
	}

	public MemberDTO selectMemberId(String id) {

		Connection con = getConnection();
		
		MemberDTO member = memberDAO.selectMemberId(con, id);
		
		close(con);
		
		return member;
	}
	
	public List<MemberDTO> selectMemberGender(String gender) {
		
		Connection con = getConnection();
		
		List<MemberDTO> memberList = memberDAO.selectMemberGender(con, gender);
		
		close(con);
		
		return memberList;
	}

	public boolean changedPassword(String memberId, String password) {

		Connection con = getConnection();
		
		int result = memberDAO.changePassword(con, memberId, password);
		
		if(result > 0) {
			commit(con);
		} else {
			rollback(con);
		}
		
		close(con);
		
		return result > 0? true: false;
		
	}

	public boolean updateEmail(String memberId, String email) {
		
		Connection con = getConnection();
		
		int result = memberDAO.updateEmail(con, memberId, email);
		
		if(result > 0) {
			commit(con);
		} else {
			rollback(con);
		}
		
		close(con);
		
		return result > 0? true: false;
	}

	public boolean updatePhone(String memberId, String phone) {
		
		Connection con = getConnection();
		
		int result = memberDAO.updatePhone(con, memberId, phone);
		
		if(result > 0) {
			commit(con);
		} else {
			rollback(con);
		}
		
		close(con);
		
		return result > 0? true: false;
	}

	public boolean updateAddress(String memberId, String address) {

		Connection con = getConnection();
		
		int result = memberDAO.updateAddress(con, memberId, address);
		
		if(result > 0) {
			commit(con);
		} else {
			rollback(con);
		}
		
		close(con);
		
		return result > 0? true: false;
	}

	public boolean deleteMember(String memberId) {
		
		Connection con = getConnection();
		
		int result = memberDAO.deleteMember(con, memberId);
		
		if(result > 0) {
			commit(con);
		} else {
			rollback(con);
		}
		
		close(con);
		
		return result > 0? true: false;
	}


}
