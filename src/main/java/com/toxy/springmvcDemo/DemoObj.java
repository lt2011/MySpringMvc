package com.toxy.springmvcDemo;
/**
 * 此类用来演示获取request对象参数和返回此对象到response
 * @author liutao
 *liutao2017年11月1日
 */
public class DemoObj {
	private Long id;
	private String name;

	//jackson对对象和json做转换时，一定要构造此空构造方法
	public DemoObj() {
		super();
	}

	public DemoObj(Long id, String name) {
		super();
		this.id = id;
		this.name = name;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

}
