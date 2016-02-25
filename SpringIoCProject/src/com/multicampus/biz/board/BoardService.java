package com.multicampus.biz.board;

import java.util.List;

public interface BoardService {

	// CRUD 기능의 메소드 구현
	// 글 등록(Create)
	void insertBoard(BoardVO vo);

	// 글 상세 조회(Read)
	BoardVO getBoard(BoardVO vo);

	// 글 목록 검색(Read)
	List<BoardVO> getBoardList(BoardVO vo);

	// 글 수정(Update)
	void updateBoard(BoardVO vo);

	// 글 삭제(Delete)
	void deleteBoard(BoardVO vo);

}