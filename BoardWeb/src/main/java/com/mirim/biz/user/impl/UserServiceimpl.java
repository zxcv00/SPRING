package com.mirim.biz.user.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mirim.biz.user.UserService;
import com.mirim.biz.user.UserVO;

@Service("userService")
public class UserServiceimpl implements UserService {
		@Autowired
		private UserDAO userDAO;
		
		public UserVO getUser(UserVO vo) {
			return userDAO.getUser(vo);
		}
		
		public void setUserDAO(UserDAO userDAO) {
			this.userDAO = userDAO;
		}

}
