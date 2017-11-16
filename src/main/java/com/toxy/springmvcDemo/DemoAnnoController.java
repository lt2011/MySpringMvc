package com.toxy.springmvcDemo;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * 注解演示控制器
 * 
 * @author liutao liutao2017年11月1日
 */
@Controller
@RequestMapping("/anno") // 映射此类的访问路径为/anno
public class DemoAnnoController {
	/*
	 * 此方法未标明路径，使用的是类上的路径/anno，
	 * produces可制定返回的response的媒体类型或字符集，若需要返回是json对象，则配置为produces=
	 * "application/json:charset=UTF-8"
	 */
	@RequestMapping(produces = "text/plain;charset=UTF-8")
	public @ResponseBody String index(HttpServletRequest request) {
		return "url: " + request.getRequestURL() + "can access";
	}

	@RequestMapping(value = "/pathvar/{string}", produces = "text/plain;charset=UTF-8")//访问路径为/anno/pathvar/xx
	public @ResponseBody String demoPathVar(@PathVariable String string, HttpServletRequest request) {
		return "url: " + request.getRequestURL() + "can access,str: " + string;
	}

	@RequestMapping(value = "/requestParam", produces = "text/plain;charset=UTF-8")//访问路径为/anno/requestParam?id=1
	public @ResponseBody String passRequestParam(Long id, HttpServletRequest request) {
		return "url: " + request.getRequestURL() + "can access,id: " + id;
	}

	@RequestMapping(value = "/obj", produces = "application/json:charset=UTF-8")//访问路径为/anno/obj?id=1&name=xx
	@ResponseBody // 此注解也可以用在方法上
	public String passObj(DemoObj obj, HttpServletRequest request) {
		return "url: " + request.getRequestURL() + "can access, obj id: " + obj.getId() + "obj name: " + obj.getName();
	}

	@RequestMapping(value={"/name1","/name2"},produces="text/plain;charset=UTF-8")//访问路径为/anno/name1或 /anno/name2
	public @ResponseBody String remove(HttpServletRequest request) {
		return "url: " + request.getRequestURL() + "can access";
	}

}
