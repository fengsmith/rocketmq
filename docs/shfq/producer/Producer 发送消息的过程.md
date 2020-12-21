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








