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


Producer -> DefaultMQProducer.start -> DefaultMQProducerImpl.start
获取 MQClientInstance mQClientFactory 注册 registerProducer 
MQClientInstance 对应着同一个 nameserver 但是 producer 的 groupName 不一样？