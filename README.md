# protobuf-android
Use Google Protocol Buffer to Transport Data for Android NDK Development

protobuf-android使用说明

本项目主要利用 protobuf, 实现了 Android 上层和 native 层间传递数据
仅需几步操作即可实现，简单易用
使用前请先阅读README.md文档，查看使用说明
如有任何问题，欢迎沟通交流

环境准备：
  配置ndk环境变量，网上有很多相关文章，就不赘述了

1.编辑 app\src\main\proto\rtcm.proto 文件
  初学者可以网上搜索相关文章，先简单了解一下

2. cmd 窗口切换到 app\src\main\proto\ 目录下，生成 java 和 c++ 文件，命令如下
  protoc --cpp_out=../jni/   rtcm.proto
  protoc --java_out=../java/ rtcm.proto

3. 编辑 jni_interface.cpp 文件，在app\src\main\jni\ 目录下，主要是下面两个互相传值的方法
  Java_com_fty_utils_RtcmUtil_passStructToJava
  Java_com_fty_utils_RtcmUtil_passObjToNative

4. cmd 窗口切换到 app\src\main\jni\ 目录下，生成 so 文件，命令如下
  ndk-build

5. 运行APP，查看结果
  可以先运行APP，看下效果
