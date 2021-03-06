package org.cskj.springbootStudent.config;

import org.cskj.springbootStudent.interceptor.loginHandlerInterceptor;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;
//@Configuration
public class mvcConfig implements WebMvcConfigurer{
	@Override
	public void addInterceptors(InterceptorRegistry registry) {
		registry.addInterceptor(new loginHandlerInterceptor()).addPathPatterns("/**").excludePathPatterns("/login.jsp","/login","/**/*.js","/*.css");
	}
}
