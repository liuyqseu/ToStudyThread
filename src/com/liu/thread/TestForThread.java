package com.liu.thread;

import java.util.ArrayList;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.ThreadFactory;

public class TestForThread {
	
	public static void main(String[] args) {
		
//		================================= 不产生返回值（使用Runnable接口） =================================
//		test-1 直接run()方法，此时并未启动新线程
//		LiftOff liftOff = new LiftOff();
//		liftOff.run();
		
//		test-2 通过start()方法，启动新线程来执行任务
//		Thread thread = new Thread(new LiftOff());
//		thread.start();
//		System.out.println("wait for liftoff");
		
//		test-3 多线程执行
//		for (int i = 0; i < 3; i++) {
//			(new Thread(new LiftOff())).start();
//		}
//		System.out.println("wait for liftoff");
		
//		test-4 通过线程池来实现
//		ExecutorService exec = Executors.newCachedThreadPool();
		ExecutorService exec = Executors.newFixedThreadPool(3);	
//		ExecutorService exec = Executors.newSingleThreadExecutor();
		for (int i = 0; i < 3; i++) {
			exec.execute(new LiftOff());
		}
		exec.shutdown();
		
		
		
//		================================= 产生返回值（使用Callable接口） =================================
//		test-5 使用Callable接口获取线程返回结果
//		ExecutorService exec = Executors.newCachedThreadPool();
//		ArrayList<Future<String>> results = new ArrayList<Future<String>>();
//		for (int i = 0; i < 5; i++) {
//			results.add(exec.submit(new TaskWithResult(i)));
//		}
//		for (Future<String> future : results) {
//			try {
//				System.out.println(future.get());
//			} catch(Exception e) {
//				System.out.println(e.getMessage());
//			} finally {
//				exec.shutdown();
//			}
//		}
		
		
		
		
		
		
	}
	
	
	

}
