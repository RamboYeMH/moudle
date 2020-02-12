package com.yes.moudle.springbootmybatis.service;

import com.yes.moudle.springbootmybatis.entity.User;
import com.yes.moudle.springbootmybatis.mapper.UserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author yemingheng
 * @since 2020/2/10 14:30
 */
@Service
public class UserService
{
	@Autowired
	private UserMapper userMapper;

	public User Sel(int id){
		return userMapper.Sel(id);
	}
}
