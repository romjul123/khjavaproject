package com.kh.practice.member.controller;

import java.util.ArrayList;
import java.util.List;

import com.kh.practice.member.model.vo.Member;

public class MemberController {
	List<Member> mList;

	public MemberController() {
		mList = new ArrayList<Member>();
	}
	
	public void registerMember(Member member) {
		// c[i] = new Circle();
		mList.add(member);
	}
	
	public void updateMember(Member member) {
		for(int i = 0; i < mList.size(); i++) {
			String memberId = member.getMemberId();
			Member storedMember = mList.get(i);
			String storedId = storedMember.getMemberId();
			if(storedId.equals(memberId)) {
				storedMember.setMemberPwd(member.getMemberPwd());
				storedMember.setMemberEmail(member.getMemberEmail());
				storedMember.setMemeberPhone(member.getMemberPhone());
				storedMember.setMemberAddress(member.getMemberAddress());
				storedMember.setMemberHobby(member.getMemberHobby());
			}
		}
	}
	
	public void removeMember(int index) {
		mList.remove(index);
	}
	
	public List<Member> printAllMember() {
		return mList;
		
	}
	// ���� ���� ���� �� �ε����� ����
	public int findMemberIndex(String memberId) {
		for(int i = 0; i < mList.size(); i++) {
			// memberId�� ���� �����Ͱ�
			// mList�� �ִ��� ã�ƺ���
			Member mOne = mList.get(i);
			// �Ѱܹ��� memberId�� mOne�� �ִ��� Ȯ��
			if(memberId.equals(mOne.getMemberId())) {
				return i;
			}
		}
		return -1;
	}
	
	// ���� ���� ���� �� �ش� ��ü ���� -- index ���� ������ ���Ϲ޴� ��
//	public Member findMemberId(String memberId) {
//	    for(int i = 0; i < mList.size(); i++) {
//		Member mOne = mList.get(i);
//		if(memberId.equals(mOne.getMemberId())) {
//		    return mOne;
//			}
//		}
//	    return null;
//	}
	
	// ���ϵ� �ε������� �̿��Ͽ� ������ ã��
	public Member printOneByIndex(int index) {
		Member member = mList.get(index);
		return member;
	}
	
	public Member findMemberName(String memberName) {
		for(int i = 0; i < mList.size(); i++) {
			Member mOne = mList.get(i);
			if(memberName.equals(mOne.getMemberName())) {
				return mOne;
			}
		}
		return null;
	}

}
