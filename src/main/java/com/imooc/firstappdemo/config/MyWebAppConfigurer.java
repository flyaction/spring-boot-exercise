package com.imooc.firstappdemo.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;

import com.imooc.firstappdemo.controller.interceptor.OneInterceptor;
import com.imooc.firstappdemo.controller.interceptor.TwoInterceptor;

@Configuration
public class MyWebAppConfigurer   implements   WebMvcConfigurer  {

	@Override
	public void addInterceptors(InterceptorRegistry registry) {
		/**
		 * 拦截器按照顺序执行
		 */
		registry.addInterceptor(new TwoInterceptor()).addPathPatterns("/two/**")
													 .addPathPatterns("/one/**");
		registry.addInterceptor(new OneInterceptor()).addPathPatterns("/one/**");

		WebMvcConfigurer.super.addInterceptors(registry);
	}

}
