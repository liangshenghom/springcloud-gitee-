package org.Hystrix;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;

import org.Hystrix.testhystrix.ClearCacheHystrixCommand;

import com.netflix.hystrix.strategy.concurrency.HystrixRequestContext;

public class HystrixMain {
	public static void main(String[] args) throws InterruptedException, ExecutionException {
	    HystrixRequestContext context = HystrixRequestContext.initializeContext();
	    String result = new ClearCacheHystrixCommand("zhangsan").execute();
	    System.out.println(result);
	    ClearCacheHystrixCommand.flushCache("zhangsan");
	    Future<String> future = new ClearCacheHystrixCommand("zhangsan").queue();
	    System.out.println(future.get());
	}
}
