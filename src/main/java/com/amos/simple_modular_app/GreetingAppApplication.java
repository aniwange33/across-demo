package com.amos.simple_modular_app;

import com.example.demo.DemoApplication;
import com.foreach.across.config.AcrossApplication;
import com.foreach.across.modules.adminweb.AdminWebModule;
import org.springframework.boot.SpringApplication;
import org.springframework.context.annotation.Bean;

@AcrossApplication(
		modules = {
				//AcrossWebModule.NAME,
				//AcrossHibernateJpaModule.NAME,
				AdminWebModule.NAME,
				//DemoApplication.NAME

		}
)
public class GreetingAppApplication {

	@Bean
	public DemoApplication getDemo(){
		return new DemoApplication();
	}
	public static void main( String[] args ) {
		SpringApplication.run( GreetingAppApplication.class, args );
	}
}