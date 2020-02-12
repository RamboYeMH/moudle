package com.yes.moudle.springbootmybatis.task;

import org.springframework.scheduling.annotation.Async;
import org.springframework.scheduling.annotation.AsyncResult;
import org.springframework.stereotype.Component;

import java.util.concurrent.Future;

/**
 * @author yemingheng
 * @since 2020/2/11 16:24
 *  异步任务
 */
@Component
@Async
public class AsyncTask
{

	public void task1() throws InterruptedException
	{
		long began = System.currentTimeMillis();
		Thread.sleep(1000L);
		long end = System.currentTimeMillis();
		System.out.println("消耗时间1 " + (end-began));
	}

	//获取异步结果
	public Future<String> task2() throws InterruptedException
	{
		long began = System.currentTimeMillis();
		Thread.sleep(10002);
		long end = System.currentTimeMillis();
		System.out.println("消耗时间2 " + (end-began));
		return new AsyncResult<String>("任务2");
	}

	public void task3() throws InterruptedException
	{
		long began = System.currentTimeMillis();
		Thread.sleep(3000L);
		long end = System.currentTimeMillis();
		System.out.println("消耗时间3 " + (end-began));
	}

}
