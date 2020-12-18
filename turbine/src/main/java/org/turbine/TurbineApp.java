package org.turbine;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class TurbineApp 
{
    public static void main( String[] args )
    {
    	  SpringApplication.run(TurbineApp.class, args);
    }
}
