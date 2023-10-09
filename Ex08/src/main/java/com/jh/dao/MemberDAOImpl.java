package com.jh.dao;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class MemberDAOImpl implements MemberDAO {
	@Autowired
	SqlSession sqlSession;
	
	@Override
	public String selectPw(String id) {
		return sqlSession.selectOne("memberMapper.getPwById", id);
	}

	@Override
	public String selectName(String id) {
		return sqlSession.selectOne("memberMapper.getNameById", id);
	}
	
}
