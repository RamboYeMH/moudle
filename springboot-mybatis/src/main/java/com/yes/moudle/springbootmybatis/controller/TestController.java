package com.yes.moudle.springbootmybatis.controller;

import com.yes.moudle.springbootmybatis.task.AsyncTask;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author yemingheng
 * @since 2020/2/11 16:30
 */
@RestController
@RequestMapping("/api")
public class TestController
{
	@Autowired
	private AsyncTask asyncTask;

	@GetMapping("async")
	public String jsonData() throws InterruptedException
	{
		long began = System.currentTimeMillis();
		asyncTask.task1();
		asyncTask.task2();
		asyncTask.task3();
		long end = System.currentTimeMillis();
		System.out.println("总消耗时间 " + (end-began));
		return "success";
	}
}
