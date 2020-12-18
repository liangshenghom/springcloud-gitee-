package org.Hystrix;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;

import org.Hystrix.testhystrix.MyHystrixCollapser;

import com.netflix.hystrix.strategy.concurrency.HystrixRequestContext;

public class HystrixCollapser {
	public static void main(String[] args) throws InterruptedException, ExecutionException {
		HystrixRequestContext context = HystrixRequestContext.initializeContext();
		Future<String> f1 = new MyHystrixCollapser("zhangsan").queue();
		Future<String> f2 = new MyHystrixCollapser("zhangsan333").queue();
		System.out.println(f1.get() + "=" + f2.get());
		context.shutdown();
	}
}
