package com.multicampus.biz.user;

import java.util.List;

public interface UserService {

	// CRUD 기능의 메소드 구현
	// 회원 등록(Create)
	void insertUser(UserVO vo);

	// 회원 삭제(Delete)
	void deleteUser(UserVO vo);

	// 회원 상세 조회(Read)
	UserVO getUser(UserVO vo);

	// 회원 목록 검색(Read)
	List<UserVO> getUserList(UserVO vo);

}