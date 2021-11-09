package com.mirim.view.board;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.mirim.biz.board.BoardVO;
import com.mirim.biz.impl.BoardDAO;

@Controller
public class GetBoardListController {
	
	@RequestMapping("/getBoardList.do")
	public ModelAndView getBoardList(BoardVO vo, BoardDAO boardDAO, ModelAndView mav) {
		mav.addObject("boardList", boardDAO.getBoard(vo)); 		// Model ���� ����
		mav.setViewName("getBoardList.jsp"); 		// View ���� ����
		
		return mav;
	}
}
