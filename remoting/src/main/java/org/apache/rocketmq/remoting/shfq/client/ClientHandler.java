package org.apache.rocketmq.remoting.shfq.client;

import io.netty.buffer.ByteBuf;
import io.netty.buffer.Unpooled;
import io.netty.channel.ChannelHandlerContext;
import io.netty.channel.SimpleChannelInboundHandler;
import io.netty.util.CharsetUtil;
import io.netty.buffer.*;

public class ClientHandler extends SimpleChannelInboundHandler {

    @Override
    public void channelActive(ChannelHandlerContext channelHandlerContext){
        channelHandlerContext.writeAndFlush(Unpooled.copiedBuffer("Netty Rocks!", CharsetUtil.UTF_8));
    }

    @Override
    public void exceptionCaught(ChannelHandlerContext channelHandlerContext, Throwable cause){
        cause.printStackTrace();
        channelHandlerContext.close();
    }

    @Override
    protected void channelRead0(ChannelHandlerContext channelHandlerContext, Object o) throws Exception {
        ByteBuf inBuffer = (ByteBuf) o;
        int readableBytes = inBuffer.readableBytes();

        byte[] bytes = new byte[readableBytes];
        inBuffer.readBytes(bytes);
        String r = null;
        if (bytes != null) {
            r = new String(bytes, "utf-8");
        }
//        UnpooledUnsafeHeapByteBuf unpooledUnsafeHeapByteBuf = null;

        String received = inBuffer.toString(CharsetUtil.UTF_8);

        System.out.println("Client received: " + r);

    }
}
