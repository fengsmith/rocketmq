1. namesrv 的处理逻辑在 DefaultRequestProcess 中。
2. 对 kv 值的管理，kv 保存在 user.home/namesrv/kvConfig.json 。put、get、delete 。
3. 对 namesrv 配置的管理，update、get 配置。全量更新，只能是更新，不能新增，只能是对原有的 key 对应的值的修改，也不能删除。 user.home/namesrv/namesrv.properties
4. broker 的注册、注销、broker 的注册版本。