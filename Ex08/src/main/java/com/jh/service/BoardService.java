package com.jh.service;

import java.util.ArrayList;

import com.jh.dto.BoardDTO;

public interface BoardService {
	ArrayList<BoardDTO> getBoardListByPageNumber(int pageNumber);  // 파라미터로 페이지번호를 받아 게시글 목록을 리턴.
	int getLastPageNumber();  // 마지막 페이지 번호를 리턴.
	void increaseHitcount(int bno);  // 파라미터로 게시글 번호로 받아 조회수 1 증가.
	BoardDTO getBoardDetail(int bno);  // 파라미터로 게시글 번호를 받아 게시글 dto를 리턴.
	void writeBoard(BoardDTO dto);  // 파라미터로 게시글 dto를 받아 새 글 등록.
	void modifyBoard(BoardDTO dto);  // 파라미터로 게시글 dto를 받아서 새 글 수정.
	void deleteBoard(int bno);  // 파라미터로 게시글 번호를 받아 해당 게시글 삭제.
}
