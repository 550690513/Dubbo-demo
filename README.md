# Dubbo-demo
Dubbo与Zookeeper、Spring框架的整合demo，实现服务提供方与消费方的RPC远程过程调用

>说明：

>* dubbo-api：存放公共接口
>* dubbo-consumer1：调用远程服务（服务消费方1）
>* dubbo-consumer2：调用远程服务（服务消费方2）
>* dubbo-provider：提供远程服务（服务提供方）


>注意：

>* 1、本地需启动zookeeper，且使用默认端口2181；若修改了zookeeper端口号，则必须同步修改provider.xml、consumer1.xml、consumer2.xml配置文件中zookeeper对应端口号。

>* 2、启动顺序：dubbo-provider；dubbo-consumer1；dubbo-consumer2；

>* 3、dubbo-admin.war为监控系统，单独在web容器中启动即可，url：http://ip:port/dubbo-admin/