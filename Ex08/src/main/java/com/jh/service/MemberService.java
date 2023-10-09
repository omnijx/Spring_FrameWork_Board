package com.jh.service;

public interface MemberService {
	boolean checkLogin(String id, String pw);
	String getNameById(String id);
}
