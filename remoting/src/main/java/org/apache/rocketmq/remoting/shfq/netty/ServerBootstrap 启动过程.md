	at java.lang.Thread.dumpStack(Thread.java:1336)
	at io.netty.util.concurrent.DefaultThreadFactory.newThread(DefaultThreadFactory.java:108)
	at io.netty.util.concurrent.SingleThreadEventExecutor.<init>(SingleThreadEventExecutor.java:134)
	at io.netty.channel.SingleThreadEventLoop.<init>(SingleThreadEventLoop.java:45)
	at io.netty.channel.nio.NioEventLoop.<init>(NioEventLoop.java:141)
	at io.netty.channel.nio.NioEventLoopGroup.newChild(NioEventLoopGroup.java:102)
	at io.netty.util.concurrent.MultithreadEventExecutorGroup.<init>(MultithreadEventExecutorGroup.java:64)
	at io.netty.channel.MultithreadEventLoopGroup.<init>(MultithreadEventLoopGroup.java:49)
	at io.netty.channel.nio.NioEventLoopGroup.<init>(NioEventLoopGroup.java:70)
	at io.netty.channel.nio.NioEventLoopGroup.<init>(NioEventLoopGroup.java:65)
	at io.netty.channel.nio.NioEventLoopGroup.<init>(NioEventLoopGroup.java:56)
	at io.netty.channel.nio.NioEventLoopGroup.<init>(NioEventLoopGroup.java:48)
	at io.netty.channel.nio.NioEventLoopGroup.<init>(NioEventLoopGroup.java:40)
	at org.apache.rocketmq.remoting.shfq.server.TcpServer.main(TcpServer.java:15)


端口是怎么绑定的，Channel 、handler pipeline 是怎么串起来的。

Selector、SelectorProvider、ChannelPromise、EventLoop、EventLoopGroup、EventExecutorGroup、NioEventLoop、NioEventLoopGroup、AbstractChannel、
ChannelHandlerContext、NioServerSocketChannel.doBind() 做了端口绑定的工作。

DefaultChannelPipeline、AbstractChannel 里有 DefaultChannelPipeline  


java.nio.channels.ServerSocketChannel.accept() 方法是在哪里调用的。
