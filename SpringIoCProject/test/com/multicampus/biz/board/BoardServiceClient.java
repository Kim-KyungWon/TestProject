package com.multicampus.biz.board;

import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class BoardServiceClient {

	public static void main(String[] args) {
		// 1. Spring 컨테이너 구동. 		

		ApplicationContext factory = new ClassPathXmlApplicationContext("applicationContext.xml");
		
		// 2. BoardService 타입의 객체를 Lookup.
		
		BoardService boardService = (BoardService) factory.getBean("boardService");

		// 3. 글 목록 출력 
		
		BoardVO vo = new BoardVO();
		vo.setSearchCondition("TITLE");
		vo.setSearchKeyword("글");
		
		List<BoardVO> boardList = boardService.getBoardList(vo);
		
		System.out.println("<< BOARD LIST >>");
		
		for (BoardVO board : boardList) {
			System.out.println("--- > "+board.toString());
		}
		
	}

}
