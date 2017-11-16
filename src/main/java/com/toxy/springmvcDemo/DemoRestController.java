package com.toxy.springmvcDemo;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController//声明是控制器，并且返回数据时不需要 @ResponseBody
@RequestMapping("/rest")
public class DemoRestController {

	@RequestMapping(value="/getjson",produces={"application/json;charset=UTF-8"}) //返回json
	public DemoObj getJson(DemoObj obj) {
		return new DemoObj(obj.getId() + 1, obj.getName() + "yy");//返回对象，对象会转换成json
	}
	
	@RequestMapping(value="/getxml",produces={"application/xml;charset=UTF-8"}) //返回xml
	public DemoObj getXml(DemoObj obj) {
		return new DemoObj(obj.getId() + 1, obj.getName() + "yy"); //返回对象，对象会转换成xml
	}

}
