/**
 * 
 */
package com.toxy.springmvc;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.ServletRegistration.Dynamic;

import org.springframework.web.WebApplicationInitializer;
import org.springframework.web.context.support.AnnotationConfigWebApplicationContext;
import org.springframework.web.servlet.DispatcherServlet;

/**
 * @author liutao
 *liutao2017年10月26日
 */
public class WebInitializer implements WebApplicationInitializer {

	@Override
	public void onStartup(ServletContext servletContext) throws ServletException {
		AnnotationConfigWebApplicationContext acwac = new AnnotationConfigWebApplicationContext();
		acwac.register(MyMvcConfig.class);
		acwac.setServletContext(servletContext);
		
		Dynamic servlet  = servletContext.addServlet("dispatcher", new DispatcherServlet(acwac));
		servlet.addMapping("/");
		servlet.setLoadOnStartup(1);

	}

}
