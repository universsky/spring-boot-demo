
package com.boot.controller;

import java.util.Date;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * 
 * 类名:HelloController 功能:TODO 日期: 2015年11月15日 下午4:51:14
 * 
 * @author 财宝
 * @version 1.0.0
 * @since JDK 1.7
 * @see
 */

// let's say, it is under package com.xxx.controller

@Controller
public class HelloController {
    @RequestMapping("/")
    @ResponseBody
    String home() {
        return "Hello Spring Boot!";
    }

    @RequestMapping("/say")
    @ResponseBody
    String say() {
        return "I am Spring Boot! Now time is: " + new Date();
    }

}
