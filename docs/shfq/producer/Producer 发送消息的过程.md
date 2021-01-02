MQClientAPIImpl 里有个 remotingClient 1363 行 this.remotingClient.invokeSync 会向 nameserver 查询 broker 信息。
DefaultMQProducerImpl 会向 broker 发送消息 


java.lang.Exception: Stack trace
	at java.lang.Thread.dumpStack(Thread.java:1336)
	at org.apache.rocketmq.remoting.netty.NettyRemotingClient.start(NettyRemotingClient.java:152)
	at org.apache.rocketmq.client.impl.MQClientAPIImpl.start(MQClientAPIImpl.java:239)
	at org.apache.rocketmq.client.impl.factory.MQClientInstance.start(MQClientInstance.java:237)
	at org.apache.rocketmq.client.impl.producer.DefaultMQProducerImpl.start(DefaultMQProducerImpl.java:204)
	at org.apache.rocketmq.client.impl.producer.DefaultMQProducerImpl.start(DefaultMQProducerImpl.java:175)
	at org.apache.rocketmq.client.producer.DefaultMQProducer.start(DefaultMQProducer.java:272)
	at org.apache.rocketmq.example.quickstart.Producer.main(Producer.java:51)


Producer -> DefaultMQProducer -> DefaultMQProducerImpl -> MQClientInstance -> NettyRemotingClient 

1. 根据 topic 查找 TopicPublishInfo 。
2. 选择一个 MessageQueue 。
3. 查找合适的 broker 地址。
4. 如果需要压缩消息的话则压缩消息。
5. 如果有发送消息之前需要执行的 hook 的话，则执行发送之前的 hook 。
6. 分为同步（oneWay、同步）、异步。
7. 发送消息。
8. 如果有发送消息之后需要执行的 hook 的话，则执行发送之后的 hook 。







