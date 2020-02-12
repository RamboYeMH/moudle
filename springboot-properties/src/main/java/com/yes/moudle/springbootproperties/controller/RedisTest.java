package com.yes.moudle.springbootproperties.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author yemingheng
 * @since 2020/2/10 17:32
 */
@RestController
@RequestMapping(value="/redis")
public class RedisTest
{
	@Autowired
	private RedisTemplate redisTemplate;



	@RequestMapping( "/set")
	public String setUserName( String name) {
		redisTemplate.opsForValue().set("1", name);
		return "succees";
	}

	@RequestMapping( "/get")
	public String getUserName( String key) {
		return  redisTemplate.opsForValue().get(key).toString();
	}


}
