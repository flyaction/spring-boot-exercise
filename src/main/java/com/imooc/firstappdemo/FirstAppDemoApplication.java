package com.imooc.firstappdemo;

//import org.mybatis.spring.annotation.MapperScan;
import org.springframework.scheduling.annotation.EnableAsync;
import org.springframework.scheduling.annotation.EnableScheduling;
import tk.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;
import org.springframework.context.annotation.ComponentScan;



@SpringBootApplication
@MapperScan(basePackages ="com.imooc.firstappdemo.mapper")
@ComponentScan(basePackages= {"com.imooc.firstappdemo","org.n3r.idworker"})
@EnableScheduling
@EnableAsync
public class FirstAppDemoApplication extends SpringBootServletInitializer {
	@Override
	protected SpringApplicationBuilder configure(SpringApplicationBuilder builder) {
		return builder.sources(FirstAppDemoApplication.class);
	}

	public static void main(String[] args) {
		SpringApplication.run(FirstAppDemoApplication.class, args);
	}

}
