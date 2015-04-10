package com.nowhereapp.dao;

import com.nowhereapp.domain.User;

public interface UserDao {

	User findByUserName(String username);
	
}
