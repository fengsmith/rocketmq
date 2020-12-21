io.netty.channel.DefaultChannelPipeline.fireChannelRead 在这儿接收到的还是 raw 请求参数。
入口在 org.apache.rocketmq.remoting.netty.NettyRemotingServer.NettyServerHandler.channelRead0

NettyDecoder 负责解码。