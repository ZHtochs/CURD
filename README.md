# CURD

分别使用了J2EE 和SpringBoot框架实现了对英雄数据的CURD管理。<br/>
不得不说Springboot真是比servlet什么的方便多了。。。<br/>
项目均使用了idea Maven，直接在idea里导入应该就好了。<br/>
数据库使用了MySQL。<br/>

将配置文件里的数据库和密码改成自己的。<br/>
表的数据如下：<br/>
DROP TABLE IF EXISTS `hero`;<br/>
CREATE TABLE `hero`  (<br/>
  `id` int(11) NOT NULL AUTO_INCREMENT,<br/>
  `name` varchar(30) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,<br/>
  `hp` float NULL DEFAULT NULL,<br/>
  `damage` int(11) NULL DEFAULT NULL,<br/>
  PRIMARY KEY (`id`) USING BTREE<br/>
) ENGINE = InnoDB AUTO_INCREMENT = 55 CHARACTER SET = utf8 COLLATE = utf8_general_ci ROW_FORMAT = Compact;<br/>
