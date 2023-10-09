package com.jh.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.jh.dao.MemberDAO;

@Service
public class MemberServiceImpl implements MemberService {
	@Autowired
	MemberDAO mDao;
	
	@Override
	public boolean checkLogin(String id, String pw) {
		String pwFromDB = mDao.selectPw(id);
		if(pw!=null && pw.equals(pwFromDB)) {
			return true; //로그인 성공
		}
		return false; //로그인 실패
	}

	@Override
	public String getNameById(String id) {
		return mDao.selectName(id);
	}

}
