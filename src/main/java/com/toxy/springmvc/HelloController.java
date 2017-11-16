package com.toxy.springmvc;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * 
 * @author liutao
 *liutao2017年10月26日
 */
@Controller //声明为一个控制器
public class HelloController {
	@RequestMapping("/index") 	//配置url和方法之间的映射
	public String hello(){
		return "index";
	}

}
