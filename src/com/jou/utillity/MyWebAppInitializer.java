package com.jou.utillity;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.web.WebApplicationInitializer;
import org.springframework.web.context.ContextLoaderListener;

public class MyWebAppInitializer implements WebApplicationInitializer{

	@Override
	public void onStartup(ServletContext arg0) throws ServletException {
		AnnotationConfigApplicationContext rootContext = new AnnotationConfigApplicationContext();
		rootContext.register(SpringConfiguration.class);
		// TODO Auto-generated method stub
		
		
	}

}
