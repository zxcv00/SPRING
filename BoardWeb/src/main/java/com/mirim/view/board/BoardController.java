package com.mirim.view.board;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.mirim.biz.board.BoardVO;
import com.mirim.biz.impl.BoardDAO;

@Controller
public class BoardController {
	// �� ���
	@RequestMapping(value = "/insertBoard.do")
	public String insertBoard(BoardVO vo, BoardDAO boardDAO) {
		System.out.println("������̼� �� ��� ó��");
		boardDAO.insertBoard(vo);
		return "getBoardList.do";
	}
	
	// �� ����
	@RequestMapping(value = "/updateBoard.do")
	public String updateBoard(BoardVO vo, BoardDAO boardDAO) {
		System.out.println("������̼� �� ���� ó��");
		boardDAO.updateBoard(vo);
			
		return "getBoardList.do";
	}
	
	// �� ����
	@RequestMapping(value = "/deleteBoard.do")
	public String deleteBoard(BoardVO vo, BoardDAO boardDAO) {
		System.out.println("������̼� �� ���� ó��");
		boardDAO.deleteBoard(vo);
			
		return "getBoardList.do";
	}
	
	// �� �� ��ȸ
	@RequestMapping("/getBoard.do")
	public ModelAndView getBoard(BoardVO vo, BoardDAO boardDAO, ModelAndView mav) {
		System.out.println("������̼� �� �� ��ȸ ó��");
		mav.addObject("board", boardDAO.getBoard(vo)); 		// Model ���� ����
		mav.setViewName("getBoard.jsp"); 		// View ���� ����
		
		return mav;
	}
	
	//�� ��� �˻�
	@RequestMapping("/getBoardList.do")
	public ModelAndView getBoardList(BoardVO vo, BoardDAO boardDAO, ModelAndView mav) {
		System.out.println("������̼� �� ��� �˻� ó��");
		mav.addObject("boardList", boardDAO.getBoard(vo)); 		// Model ���� ����
		mav.setViewName("getBoardList.jsp"); 		// View ���� ����
		
		return mav;
	}
}
