有可能有些步骤不是非必须的。

1. 执行 mvn -Prelease-all -DskipTests clean install -U
2. 新建一个目录作为 rockemq_home 。
3. 把 /Users/shifengqiang/projects/rocketmq/distribution/target/rocketmq-4.7.1/rocketmq-4.7.1 下的 bin、conf 目录拷贝到 rockemq_home 下。
4. 在运行 NamesrvStartup main() 方法的时候传入虚拟机参数 -Drocketmq.home.dir=/Users/shifengqiang/sr/rocketmq_home 。
5. 启动成功。