package com.toxy.springmvc;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;
import org.springframework.web.servlet.view.InternalResourceViewResolver;
import org.springframework.web.servlet.view.JstlView;

@Configuration
@EnableWebMvc //开启SpringWebMVC支持
@ComponentScan("com.toxy.springmvc")
public class MyMvcConfig extends WebMvcConfigurerAdapter{
	@Bean
	public InternalResourceViewResolver viewResolver(){
		InternalResourceViewResolver internalResourceViewResolver = new InternalResourceViewResolver();
		internalResourceViewResolver.setPrefix("/WEB-INF/classes/views/");
		internalResourceViewResolver.setSuffix(".jsp");
		internalResourceViewResolver.setViewClass(JstlView.class);
		return internalResourceViewResolver;
	}
	
	@Override
	public void addResourceHandlers(ResourceHandlerRegistry registry){
		registry.addResourceHandler("/assets/**").addResourceLocations("classpath:/assets/");
	}
	
}
