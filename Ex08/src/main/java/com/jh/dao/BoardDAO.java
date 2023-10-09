package com.jh.dao;

import java.util.ArrayList;

import com.jh.dto.BoardDTO;

public interface BoardDAO {
	ArrayList<BoardDTO> selectBoardList(int pageNumber);
	int selectLastPageNumber();
	void increaseHitcount(int bno);
	BoardDTO selectBoardDetail(int bno);
	void insertBoard(BoardDTO dto);
	void updateBoared(BoardDTO dto);
	void deleteBoard(int bno);
}
