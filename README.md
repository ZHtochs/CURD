# CURD

分别使用了J2EE 和SpringBoot框架实现了对英雄数据的CURD管理。
不得不说Springboot真是比servlet什么的方便多了。。。
项目均使用了idea Maven，直接在idea里导入应该就好了。
数据库使用了MySQL。

将配置文件里的数据库和密码改成自己的。
表的数据如下：
DROP TABLE IF EXISTS `hero`;
CREATE TABLE `hero`  (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `name` varchar(30) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `hp` float NULL DEFAULT NULL,
  `damage` int(11) NULL DEFAULT NULL,
  PRIMARY KEY (`id`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 55 CHARACTER SET = utf8 COLLATE = utf8_general_ci ROW_FORMAT = Compact;
