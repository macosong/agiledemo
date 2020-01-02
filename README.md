# agiledemo

maven构建的简单Spring boot项目，只实现了一个功能，从数据库读取admin用户并显示在网页上。

**目标**：

* 使用Jenkins进行项目集成
* 使用SonarQube进行代码质量检测

**Demo URL**：172.19.241.75:8080/login



### Jenkins Demo

> 从Github获取项目源代码，项目打包，并部署到远程服务器（云主机）。

0. 首先本地安装Jenkins、git、java和maven；远程服务器上安装java和maven。

1. 安装必要插件：Git plugin、Maven Integration plugin、Publish Over SSH

2. Jenkins上新建一个maven项目

   1. General

      勾选Discard old builds；GitHub项目，添加项目URL

   2. Source Code Management
      Git，添加Repository URL和Credentials，账户和密码均为GitHub的账户和密码

   3. Build Environment

      Send files or execute commands over SSH after the build runs，设置构建完成后执行的命令。添加两个SSH Publishers

      ​		a. Source file: `target/*.jar`；Remove prefix: `target`

      ​		b. Source files: `start.sh`；Exec command:

      ```shell
      cd /root/jenkins
      cp /dev/null nohup.out
      nohup sh start.sh & sleep 1
      ```

      ​		两个SSH Publishers项都要勾选`Exec in pty`，否则Jenkins的构建结果是`UNSTABLE`，参考[这篇文章](https://blog.csdn.net/u013066244/article/details/52788407)

   4. Build

      Goals and options添加mvn命令`clean package`

3. 开放远程服务器防火墙8080端口

   ```shell
   $ firewall-cmd --zone=public --add-port=8080/tcp --permanent
   $ firewall-cmd --reload
   ```

4. 构建项目



### SonarQube Demo

**TODO**