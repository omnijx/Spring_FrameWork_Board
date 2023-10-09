package com.jh.service;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.jh.dao.BoardDAO;
import com.jh.dto.BoardDTO;

@Service
public class BoardServiceImpl implements BoardService {
	@Autowired
	BoardDAO bDao;
	
	
	@Override
	public ArrayList<BoardDTO> getBoardListByPageNumber(int pageNumber) {
		return bDao.selectBoardList(pageNumber);
	}

	@Override
	public int getLastPageNumber() {
		return bDao.selectLastPageNumber();
	}

	@Override
	public void increaseHitcount(int bno) {
		bDao.increaseHitcount(bno);
	}

	@Override
	public BoardDTO getBoardDetail(int bno) {
		return bDao.selectBoardDetail(bno);
	}

	@Override
	public void writeBoard(BoardDTO dto) {
		bDao.insertBoard(dto);
	}

	@Override
	public void modifyBoard(BoardDTO dto) {
		bDao.updateBoared(dto);
	}

	@Override
	public void deleteBoard(int bno) {
		bDao.deleteBoard(bno);
	}

}
