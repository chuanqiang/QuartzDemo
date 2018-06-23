# QuartzDemo
Spring Boot + Quartz 搭建的一个拥有展示界面的任务调度系统的 Demo.

Quartz是个开源JAVA库,可以简单看做以上三种的结合的扩展。

![](https://upload-images.jianshu.io/upload_images/59743-e0bcebfc55ebeac2.png?imageMogr2/auto-orient/strip%7CimageView2/2/w/668)

Quartz组件图

**Scheduler**：调度容器

**Job**：Job接口类

**JobDetail** ：Job的描述类，job执行时的依据此对象的信息反射实例化出Job的具体执行对象。

**Trigger**：存放Job执行的时间策略

**JobStore**： 存储作业和调度期间的状态

**Calendar**：指定排除的时间点（如排除法定节假日）

![](https://upload-images.jianshu.io/upload_images/59743-b08b2adde3f2f568.png?imageMogr2/auto-orient/strip%7CimageView2/2/w/691)
