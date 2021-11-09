package com.mirim.view.board;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.web.servlet.ModelAndView;

import com.mirim.biz.board.BoardVO;
import com.mirim.biz.impl.BoardDAO;

import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.Controller;

public class LogoutController implements Controller {

	@Override
	public ModelAndView handleRequest(HttpServletRequest request, HttpServletResponse response) {
		System.out.println("SPRING MVC �α׾ƿ� ó��");
		
		// 1. �������� ����� ���� ��ü�� ���� ����
			HttpSession session = request.getSession();
				session.invalidate();

		// 2. ���� ���� ��, ���� ȭ������ �̵�
			ModelAndView mav = new ModelAndView();
			mav.setViewName("redirect:login.jsp");
			return mav;
	}

}
