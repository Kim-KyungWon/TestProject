package com.multicampus.biz.board;

import java.util.List;

public interface BoardService {

	// CRUD ����� �޼ҵ� ����
	// �� ���(Create)
	void insertBoard(BoardVO vo);

	// �� �� ��ȸ(Read)
	BoardVO getBoard(BoardVO vo);

	// �� ��� �˻�(Read)
	List<BoardVO> getBoardList(BoardVO vo);

	// �� ����(Update)
	void updateBoard(BoardVO vo);

	// �� ����(Delete)
	void deleteBoard(BoardVO vo);

}