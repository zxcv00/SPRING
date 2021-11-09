package com.mirim.biz.board.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mirim.biz.board.BoardService;
import com.mirim.biz.board.BoardVO;
import com.mirim.biz.common.Log4jAdvice;
import com.mirim.biz.common.LogAdvice;
import com.mirim.biz.impl.BoardDAO;
import com.mirim.biz.impl.BoardDAOSpring;

@Service("boardService")
public class BoardServiceImpl implements BoardService {
	@Autowired
	private BoardDAOSpring boardDAO;
//	private LogAdvice log;
	
//	public BoardServiceImpl() {
//		log = new LogAdvice();
//	}
	
	@Override
	public void insertBoard(BoardVO vo) {
//		log.printLog();
//		if(vo.getSeq() == 0) {
//			throw new IllegalArgumentException("0번 글은 등록할 수 없습니다.");
//		}
//		boardDAO.insertBoard(vo);
	}
	
	@Override
	public void updateBoard(BoardVO vo) {
//		log.printLog();
		boardDAO.updateBoard(vo);
	}
	
	@Override
	public void deleteBoard(BoardVO vo) {
//		log.printLog();
		boardDAO.deleteBoard(vo);
	}
	
	@Override
	public BoardVO getBoard(BoardVO vo) {
//		log.printLog();
		return boardDAO.getBoard(vo);
	}
	
	@Override
	public List<BoardVO> getBoardList(BoardVO vo) {
//		log.printLog();
		return boardDAO.getBoardList(vo);
	}
}
