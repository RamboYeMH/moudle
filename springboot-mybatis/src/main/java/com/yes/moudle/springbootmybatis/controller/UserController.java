package com.yes.moudle.springbootmybatis.controller;

import com.yes.moudle.springbootmybatis.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author yemingheng
 * @since 2020/2/10 14:25
 */
@RestController
@RequestMapping("/testBoot")
public class UserController
{
	@Autowired
	private UserService userService;

	@RequestMapping("getUser/{id}")
	public String GetUser(@PathVariable int id){

		return userService.Sel(id).toString();
	}

}
