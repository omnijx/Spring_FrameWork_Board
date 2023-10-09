package com.jh.ex08;

import java.util.ArrayList;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.jh.dao.BoardDAO;
import com.jh.dto.BoardDTO;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations= ("file:src/main/webapp/WEB-INF/spring/root-context.xml"))
public class BoardDAOTest {
	@Autowired
	BoardDAO bDao;
	
	@Test
	public void testSelectBoardList() throws Exception {
		int pageNum = 1;
		ArrayList<BoardDTO> listBoard = (ArrayList<BoardDTO>)bDao.selectBoardList(pageNum);
		System.out.println("읽어온 개수"+listBoard.size());
		
		for(int i=0; i<listBoard.size(); i++) {
			System.out.println(i+1 + ")" + listBoard.get(i).getBno() + "/" + listBoard.get(i).getTitle() +"/ "+ listBoard.get(i).getHitcount());
		}
	}
	
	@Test
	public void testSelectLastPageNumber() throws Exception {
		System.out.println("last page number : " + bDao.selectLastPageNumber());
	}
	
	@Test
	public void testIncreaseHitcount() throws Exception {
		int bno = 10;
		bDao.increaseHitcount(bno);
	}
	
	@Test
	public void testSelectBoardDetail() throws Exception {
		int bno = 76;
		BoardDTO dto = bDao.selectBoardDetail(bno);
		System.out.println("게시글 번호 : " + dto.getBno());
		System.out.println("제목 : " + dto.getTitle());
		System.out.println("내용 : " + dto.getContent());
		System.out.println("조회수 : " + dto.getHitcount());
	}
	
	@Test
	public void testInsertBoard() throws Exception {
		BoardDTO dto = new BoardDTO(0, "JH", "제목 테스트", "내용 테스트", 0, null);
		bDao.insertBoard(dto);	
		System.out.println("작성 완료");
	}
	
	@Test
	public void testUpdateBoard() throws Exception {
		BoardDTO dto = new BoardDTO(76, "JH", "수정 제목", "수정 내용", 0, null);
		bDao.updateBoared(dto);
		System.out.println("수정 완료");
	}
	
	@Test
	public void testDeleteBoard() throws Exception {
		int bno = 76;
		bDao.deleteBoard(bno);
		System.out.println("삭제 완료");
	}
	
}
