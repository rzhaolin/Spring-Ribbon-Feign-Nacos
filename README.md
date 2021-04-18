# Spring-Ribbon-Feign-Nacos

1.服务提供者：cms，采用Ribbon做负载均衡。

2.服务消费者：feignClient，它通过Feign直接调cms的接口，并采用Hystrx作为熔断，处理cms系统异常。

3.注册中心：采用阿里的Nacos，将cms、feignClient注册到nacos中。
