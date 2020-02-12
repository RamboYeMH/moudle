package com.yes.moudle.springbootmybatis.task;

import org.springframework.stereotype.Component;

import java.util.Date;

/**
 * @author yemingheng
 * @since 2020/2/11 16:03
 */
@Component
public class TestTask
{
//	@Scheduled(fixedRate = 2000)//两秒执行
//	@Scheduled(cron = "*/1 * * * * *")
	public void sum()
	{
		System.out.println("当前时间 ：" + new Date());
	}
}
