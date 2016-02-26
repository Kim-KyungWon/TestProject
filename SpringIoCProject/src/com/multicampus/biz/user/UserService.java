package com.multicampus.biz.user;

import java.util.List;

public interface UserService {

	// CRUD ����� �޼ҵ� ����
	// ȸ�� ���(Create)
	void insertUser(UserVO vo);

	// ȸ�� ����(Delete)
	void deleteUser(UserVO vo);

	// ȸ�� �� ��ȸ(Read)
	UserVO getUser(UserVO vo);

	// ȸ�� ��� �˻�(Read)
	List<UserVO> getUserList(UserVO vo);

}