package com.mirim.view.board;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.mirim.biz.board.BoardVO;
import com.mirim.biz.impl.BoardDAO;

@Controller
public class BoardController {
	// 글 등록
	@RequestMapping(value = "/insertBoard.do")
	public String insertBoard(BoardVO vo, BoardDAO boardDAO) {
		System.out.println("어노테이션 글 등록 처리");
		boardDAO.insertBoard(vo);
		return "getBoardList.do";
	}
	
	// 글 수정
	@RequestMapping(value = "/updateBoard.do")
	public String updateBoard(BoardVO vo, BoardDAO boardDAO) {
		System.out.println("어노테이션 글 수정 처리");
		boardDAO.updateBoard(vo);
			
		return "getBoardList.do";
	}
	
	// 글 삭제
	@RequestMapping(value = "/deleteBoard.do")
	public String deleteBoard(BoardVO vo, BoardDAO boardDAO) {
		System.out.println("어노테이션 글 삭제 처리");
		boardDAO.deleteBoard(vo);
			
		return "getBoardList.do";
	}
	
	// 글 상세 조회
	@RequestMapping("/getBoard.do")
	public ModelAndView getBoard(BoardVO vo, BoardDAO boardDAO, ModelAndView mav) {
		System.out.println("어노테이션 글 상세 조회 처리");
		mav.addObject("board", boardDAO.getBoard(vo)); 		// Model 정보 저장
		mav.setViewName("getBoard.jsp"); 		// View 정보 저장
		
		return mav;
	}
	
	//글 목록 검색
	@RequestMapping("/getBoardList.do")
	public ModelAndView getBoardList(BoardVO vo, BoardDAO boardDAO, ModelAndView mav) {
		System.out.println("어노테이션 글 목록 검색 처리");
		mav.addObject("boardList", boardDAO.getBoard(vo)); 		// Model 정보 저장
		mav.setViewName("getBoardList.jsp"); 		// View 정보 저장
		
		return mav;
	}
}
