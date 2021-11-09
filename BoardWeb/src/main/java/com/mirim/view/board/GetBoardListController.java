package com.mirim.view.board;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;


import com.mirim.biz.board.BoardVO;
import com.mirim.biz.impl.BoardDAO;

import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.Controller;

public class GetBoardListController implements Controller{

	@Override
	public ModelAndView handleRequest(HttpServletRequest request, HttpServletResponse response) {
		System.out.println("SPRING MVC �� ��� �˻�  ó��");
		
		// 1. ����� �Է� ���� ���� (�˻� ����� ���߿� ����)
		// 2. DB ���� ó��
		BoardVO vo = new BoardVO();
		BoardDAO boardDAO = new BoardDAO();
		List<BoardVO> boardList = boardDAO.getBoardList(vo);
		
		// 3. �˻� ����� ȭ�� ������ ModelAndView�� �����Ͽ� ����
		// HttpSession session = request.getSession();
		// session.setAttribute("boardList", boardList);
		// return "getBoardList";
		
		// 3. �˻� ����� ȭ�� ������ ModelAndView�� �����Ͽ� ����
		ModelAndView mav = new ModelAndView();
				
		mav.addObject("boardList", boardList);	// Model ���� ����
		mav.setViewName("getBoardList");
				
		return mav;
	} 
}
