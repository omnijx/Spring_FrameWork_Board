package com.jh.dao;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.jh.dto.BoardDTO;

@Repository
public class BoardDAOImpl implements BoardDAO {
	@Autowired
	SqlSession sqlSession;

	@Override
	public ArrayList<BoardDTO> selectBoardList(int pageNumber) {
		// start, end : rownum 시작 값과 끝 값을 결정
		int end = pageNumber*15;
		int start = end - 14;
		
		// mapper에게 값을 전달(1개만 가능) --> 2개 이상을 넘겨야 하기때문에 Map 객체 이용
		HashMap<String, Integer> mapParams = new HashMap<String, Integer>();
		mapParams.put("start", start);
		mapParams.put("end", end);
		
		List<BoardDTO> listBoard = sqlSession.selectList("boardMapper.selectBoardList", mapParams);
		ArrayList<BoardDTO> list2 = new ArrayList<BoardDTO>();
		list2.addAll(listBoard);
		return list2;
	}

	@Override
	public int selectLastPageNumber() {
		int boardCount = sqlSession.selectOne("boardMapper.selectAllCount");
		int pageCount = boardCount / 15;
		pageCount += (boardCount%15>0 ? 1 : 0);
		return pageCount;
	}

	@Override
	public void increaseHitcount(int bno) {
		sqlSession.update("boardMapper.incHitcount", bno);
	}

	@Override
	public BoardDTO selectBoardDetail(int bno) {
		return sqlSession.selectOne("boardMapper.selectBoardDetail", bno);
	}

	@Override
	public void insertBoard(BoardDTO dto) {
		sqlSession.insert("boardMapper.insertBoard", dto);
		
	}

	@Override
	public void updateBoared(BoardDTO dto) {
		sqlSession.update("boardMapper.updateBoard", dto);
	}

	@Override
	public void deleteBoard(int bno) {
		sqlSession.delete("boardMapper.deleteBoard", bno);
		
	}
	
	

}
