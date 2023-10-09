package com.jh.ex08;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.jh.dao.MemberDAO;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations= ("file:src/main/webapp/WEB-INF/spring/root-context.xml"))
public class DataSourceTest {
	@Autowired
	MemberDAO mDao;
	
	@Test
	public void testSelectPw() throws Exception {
		String id = "JH";
		String pw = mDao.selectPw(id);
		System.out.println("id : " + id + ", pw : " + pw);
	}
	
	@Test
	public void testSelectName() throws Exception {
		String id = "JH";
		String name = mDao.selectName(id);
		System.out.println("id : " + id + ", name : " + name);
	}
}
// mapper(SQL) -> DAO, DAOImpl -> DAOTest(unit test. jUint)