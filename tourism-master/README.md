# tourism  
项目栈：SpringMVC SpringDataJPA MySQL    
## 注意：  
推荐使用Idea或eclipse启动项目，使用Tomcat部署  
项目启动后会自动创建表，需要先在MySQL新建一个“tourism”数据库  
使用Mysql5.X版本，若为更高版本需修改pom连接池的配置，具体请百度  

# 启动后访问地址  
首页访问地址：http://localhost:8080/tourism/base/index  
后台访问地址：http://localhost:8080/tourism/admin/index  

# 首次启动  
## 1.第一次启动需添加第三方接口showapi.jar（在线查询景点功能）  
如图右键添加到library（在线查询景点请往下看）   
![](https://github.com/jwwam/tourism/blob/master/src/main/webapp/images/addjar1.png)    
启动后报错showapi可将jar复制到Tomcat的lib下再尝试   
## 2.第一次启动务必在desktop表添加一条数据，否则访问首页会报错  
![](https://github.com/jwwam/tourism/blob/master/src/main/webapp/images/beforestart.png)  

# 图片不显示  
部分图片加载不出来是因为springmvc拦截   
在Tomcat下webapps目录下创建images目录用来存放上传的图片 idea配置Tomcat的images路径  
具体Tomcat启动配置如下  
![](https://github.com/jwwam/tourism/blob/master/src/main/webapp/images/imageUpload1.png)   
![](https://github.com/jwwam/tourism/blob/master/src/main/webapp/images/imageUpload2.png)   
![](https://github.com/jwwam/tourism/blob/master/src/main/webapp/images/imageUpload3.png)   


