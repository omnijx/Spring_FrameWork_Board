package com.jh.ex08;

import java.util.ArrayList;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.jh.dto.BoardDTO;
import com.jh.service.BoardService;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations= ("file:src/main/webapp/WEB-INF/spring/root-context.xml"))
public class BoardServiceTest {
	@Autowired
	BoardService svc;
	
	@Test
	public void testGetBoardListByPageNumber() throws Exception {
		int pageNum = 1;
		ArrayList<BoardDTO> list1 = svc.getBoardListByPageNumber(pageNum);
		for(BoardDTO dto : list1) {
			System.out.println("게시글 번호 : " + dto.getBno());
			System.out.println("제목 : " + dto.getTitle());
			System.out.println("내용 : " + dto.getContent());
			System.out.println("조회수 : " + dto.getHitcount());
		}
	}
	
	@Test
	public void testGetLastPagenumber() throws Exception {
		System.out.println("마지막 페이지 번호 : " + svc.getLastPageNumber());
	}
	
	@Test
	public void testIncreaseHitcount() throws Exception {
		int bno = 70;
		svc.increaseHitcount(bno);
	}
	
	@Test
	public void testGetBoardDetail() throws Exception {
		int bno = 70;
		BoardDTO dto = svc.getBoardDetail(bno);
		System.out.println("게시글 번호 : " + dto.getBno());
		System.out.println("제목 : " + dto.getTitle());
		System.out.println("내용 : " + dto.getContent());
		System.out.println("조회수 : " + dto.getHitcount());
	}
	
	@Test
	public void testWriteBoard() throws Exception {
		String writer = "JH";
		String title = "서비스 테스트";
		String content = "내용";
		svc.writeBoard(new BoardDTO(0, writer, title, content, 0, null));
	}
	
	@Test
	public void testUpdateBoard() throws Exception {
		int bno = 77;
		String title = "수정";
		String content = "d";
		svc.modifyBoard(new BoardDTO(bno, null, title, content, 0, null));
	}
	
	@Test
	public void testDeleteBoard() throws Exception {
		int bno = 77;
		svc.deleteBoard(bno);
	}
	
	
	
	
	
	
	
	
	
	
}
