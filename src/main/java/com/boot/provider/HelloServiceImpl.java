/*
 * 项目:	spring-boot  
 * 文件:	HelloServiceImpl.java  
 * 包名:	com.boot.provider  
 * 日期:	2015年11月15日下午7:20:56  
 * 版权：Copyright (c) 2015, wacai.com All Rights Reserved.  
 *  
 */

package com.boot.provider;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Service;

/**
 * 类名:HelloServiceImpl 功能:TODO 日期: 2015年11月15日 下午7:20:56
 * 
 * @author 财宝
 * @version 1.0.0
 * @since JDK 1.7
 * @see
 */
@Service
@Configuration
public class HelloServiceImpl implements HelloService {

    /**
     * TODO
     * 
     * @see com.boot.provider.HelloService#say(java.lang.String)
     */
    @Override
    public String say(String words) {

        return words;
    }

    @Bean
    public HelloService helloService() {
        return new HelloServiceImpl();
    }

}
