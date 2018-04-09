package com.liqihua;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.context.annotation.ComponentScan;

//要将spring boot自带的DataSourceAutoConfiguration禁掉，因为它会自动读取配置文件的spring.datasource.*属性并自动配置单数据源
@EnableAutoConfiguration(exclude = {DataSourceAutoConfiguration.class})
@ComponentScan(basePackages={"com.*"})//如果不加这个注解，只会扫描本类同级和下级往下的目录里面的controller
public class Run {

    public static void main(String[] args) {
        SpringApplication.run(Run.class,args);
    }
}
