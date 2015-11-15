/*
 * 项目:	spring-boot  
 * 文件:	Bootstrap.java  
 * 包名:	main  
 * 日期:	2015年11月15日下午6:00:40  
 * 版权：Copyright (c) 2015, wacai.com All Rights Reserved.  
 *  
 */

package com.boot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * 类名:Bootstrap 功能:TODO 日期: 2015年11月15日 下午6:00:40
 * 
 * @author 财宝
 * @version 1.0.0
 * @since JDK 1.7
 * @see
 */

// it should under package com.xxx

@SpringBootApplication
public class Application {
    public static void main(String[] args) throws Exception {
        SpringApplication.run(Application.class, args);
    }
}
