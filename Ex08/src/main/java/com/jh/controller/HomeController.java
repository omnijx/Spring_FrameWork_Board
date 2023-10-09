package com.jh.controller;


import java.util.ArrayList;
import java.util.Locale;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.jh.dto.BoardDTO;
import com.jh.service.BoardService;
import com.jh.service.MemberService;

@Controller
public class HomeController {
	@Autowired
	MemberService mSvc;
	@Autowired
	BoardService bSvc;
	
	@RequestMapping(value = "/")
	public String home(Locale locale, Model model) {
		return "Login";
	}
	
	@RequestMapping(value = "/LoginCheck")
	public String loginCheck(String id, String pw, Model model, HttpSession session) {
		boolean result = false;
		result = mSvc.checkLogin(id, pw);
		
		if(result) {
			session.setAttribute("loginId", id);
			return "redirect:/BoardList";
		}
		// 로그인 실패시 :
		model.addAttribute("msg", "잘못된 로그인 정보입니다.");
		return "forward:/";
	}
	
	@RequestMapping("/BoardList")
	public String boardList(Integer page, Model model) {
		if(page == null) page=1;
		ArrayList<BoardDTO> listBoard = bSvc.getBoardListByPageNumber(page);
		int pageCount = bSvc.getLastPageNumber();
		model.addAttribute("pageCount", pageCount);
		model.addAttribute("listBoard", listBoard);
		model.addAttribute("page", page);
		return "BoardList";
	}
	
	@RequestMapping("/BoardDetail")
	public String boardDetail(Integer page, Integer bno, Model model) {
		if(page == null) page=1;
		BoardDTO boardDetail = bSvc.getBoardDetail(bno);
		bSvc.increaseHitcount(bno);
		model.addAttribute("boardDetail", boardDetail);
		model.addAttribute("page", page);
		return "BoardDetail";
	}
	
	@RequestMapping("/BoardWritePage")
	public String boardWritePage(Model model, HttpSession session) {
		String id = (String)session.getAttribute("loginId");
		model.addAttribute("id", id);
		return "BoardWritePage";
	}
	
	@RequestMapping("/BoardWrite")
	public String boardWrite(String title, String writer, String content, Model model) {
		bSvc.writeBoard(new BoardDTO(0, writer, title, content, 0, null));
		return "redirect:/BoardList";
	}
	
	@RequestMapping("/BoardDelete")
	public String boardDelete(int bno) {
		bSvc.deleteBoard(bno);
		return "redirect:/BoardList";
	}
	
	@RequestMapping("/BoardUpdatePage")
	public String boardUpdatePage(int page, int bno, Model model) {
		model.addAttribute("bno", bno);
		model.addAttribute("page", page);
		return "BoardUpdatePage";
	}
	
	@RequestMapping("/BoardUpdate")
	public String boardUpdate(int page, int bno, String title, String content, Model model) {
		bSvc.modifyBoard(new BoardDTO(bno, null, title, content, 0 ,null));
		model.addAttribute("page", page);
		model.addAttribute("bno", bno);
		return "redirect:/BoardDetail";
	}
	
}
