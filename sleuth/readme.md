#sleuth演示
到eureka-client-article-service跟spring-cloud-eureka-client看
可以看到内容是由 [appname，traceId，spanId，exportable] 组成的，具体含义如下：
appname：服务的名称，也就是 spring.application.name 的值。
traceId：整个请求的唯一 ID，它标识整个请求的链路。
spanId：基本的工作单元，发起一次远程调用就是一个 span。
exportable：决定是否导入数据到 Zipkin 中。