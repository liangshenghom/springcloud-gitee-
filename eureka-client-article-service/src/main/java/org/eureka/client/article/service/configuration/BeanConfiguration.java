package org.eureka.client.article.service.configuration;

import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

import com.netflix.loadbalancer.IRule;
import com.netflix.loadbalancer.RetryRule;

@Configuration
public class BeanConfiguration {
	/**
	 * '@LoadBalanced'注解表示使用Ribbon实现客户端负载均衡
	 * 
	 * @return RestTemplate
	 */
	@Bean
	@LoadBalanced
	public RestTemplate getRestTemplate() {
		return new RestTemplate();
	}

	/**
	 * 指定其他负载均衡策略
	 * 
	 * @return IRule RoundRibbonRule：轮询。人人有份，一个个来！
	 * 
	 *         RandomRule：随机。拼人品了！
	 * 
	 *         AvailabilityFilteringRule：先过滤掉由于多次访问故障而处于断路器跳闸状态的服务，以及并发连接数超过阈值的服务，剩下的服务，使用轮询策略。
	 * 
	 *         WeightedResponseTimeRule：根据平均响应时间计算所有服务的权重，响应越快的服务权重越高，越容易被选中。一开始启动时，统计信息不足的情况下，使用轮询。
	 * 
	 *         RetryRule：先轮询，如果获取失败则在指定时间内重试，重新轮询可用的服务。
	 * 
	 *         BestAvailableRule：先过滤掉由于多次访问故障而处于断路器跳闸状态的服务，然后选择一个并发量最小的服务。
	 * 
	 *         ZoneAvoidanceRule：复合判断 server 所在区域的性能和 server 的可用性选择服务器
	 */
	@Bean
	public IRule myRule() {
		// 指定重试策略：先轮询，若获取失败则在指定时间内重试，重新轮询可用的服务。
		return new RetryRule();
	}
}