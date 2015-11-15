/*
 * 项目:	spring-boot  
 * 文件:	Bootstrap.java  
 * 包名:	main  
 * 日期:	2015年11月15日下午6:00:40  
 * 版权：Copyright (c) 2015, wacai.com All Rights Reserved.  
 *  
 */

package main;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import controller.HelloController;

/**
 * 类名:Bootstrap 功能:TODO 日期: 2015年11月15日 下午6:00:40
 * 
 * @author 财宝
 * @version 1.0.0
 * @since JDK 1.7
 * @see
 */
@Configuration
@ComponentScan
@EnableAutoConfiguration
public class Bootstrap {

    public static void main(String[] args) throws Exception {
        SpringApplication.run(HelloController.class, args);
    }

}
