# hot-deploy-test
服务调用类，使用@ValueSetter做field注入

***
通过hot-deploy更新指定文件名（fileName.properties）的文件内容后，
被@ValueSetter修饰的field的值会自动更新（60s内）

***
更新文件内容：http://localhost:8081/swa/upload?fileName=fileName.properties&value=2
查看服务类的值：http://localhost:8080/swa/load）