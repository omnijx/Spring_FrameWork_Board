package com.jh.ex08;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.jh.service.MemberService;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations= ("file:src/main/webapp/WEB-INF/spring/root-context.xml"))
public class MemberServiceTest {
	@Autowired
	MemberService svc;
	
	@Test
	public void testCheckLogin() throws Exception {
		String id = "JH";
		String pw = "1234";
		System.out.println(svc.checkLogin(id, pw));
	}
	
	@Test
	public void testGetNameByMemberId() throws Exception {
		String id = "JH";
		System.out.println(svc.getNameById(id));
	}
}
// mapper(SQL) -> DAO, DAOImpl -> DAOTest(jUnit) -> Service, ServiceImpl -> ServiceTest(junit) -> 사용(컨트롤러, jsp)
