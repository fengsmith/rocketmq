1. 启动过程。
2. 加载 topic 。~/store/config/topics.json
3. 加载消费者消费偏移量。~/store/config/consumerOffset.json
4. 加载订阅组。~/store/config/subscriptionGroup.json
5. 加载消费者过滤数据。~/store/config/consumerFilter.json 作用是啥？灰度发布？
6. 加载 delayOffset 是延迟消息的消费偏移量？ ~/store/config/delayOffset.json
7. 加载 commitLog 。~/store/commitlog/*
8. 加载消费队列 ~/store/consumequeue/*。
9. 加载 checkpoint 。
10. 加载 index 。索引？？？
11. 如果异常退出需要恢复，~/store/abort 临时文件存在说明服务异常退出。
12. 初始化线程池 executor 等。
13. 注册 process 。
14. 开启好多定时任务。
15. 周期性的保存消费者消费偏移量到 ~/store/config/consumerOffset.json 。每隔 5 秒。
16. 