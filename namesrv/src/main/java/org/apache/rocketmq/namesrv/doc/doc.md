1. 接收到请求之后首先把请求转换为 RemotingCommand 。
2. 根据 RemotingCommand 中的 code 然后再找到对应的处理方法。
3. RemotingCommand 有个 extFields map 保存着键值对儿，然后把这些键值对儿转换为 CommandCustomHeader 的子类。把 map 转换为具体的 CustomHeader 使用的时候比较方便。
4. 


为什么要 encode 然后再 decode 而不是直接把一个 json 串放进去，再转出来？可能是因为 json 里有好多 key : 占用空间太多了吧，为了省流量，在网络中传输的时候更快？然后 json 反序列化的时候需要反射，可能会比较慢？