package com.mirim.view.board;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.mirim.biz.board.BoardVO;
import com.mirim.biz.impl.BoardDAO;

@Controller
public class UpdateBoardController {
	
	@RequestMapping(value = "/updateBoard.do")
	public String updateBoard(BoardVO vo, BoardDAO boardDAO) {
		boardDAO.updateBoard(vo);
			
		return "getBoardList.do";
	}
}
	