package org.Hystrix;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;

import org.Hystrix.testhystrix.Hys;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

import com.netflix.hystrix.strategy.concurrency.HystrixRequestContext;

@EnableDiscoveryClient
@SpringBootApplication
public class HystrixApp 
{
    public static void main( String[] args ) throws InterruptedException, ExecutionException
    {
    	
        SpringApplication.run(HystrixApp.class, args); 
      
    }
}
