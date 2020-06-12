package org.intellect;

import org.intellect.car.Corolla;
import org.intellect.car.Swift;
import org.intellect.specs.V6;
import org.intellect.specs.V8;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan("org.intellect")
public class AppConfig {
	
	@Bean("corolla")
	public Corolla corolla() {
		return new Corolla();
	}
	
	@Bean("swift")
	public Swift swift() {
		return new Swift();
	}
	
	@Bean("v6")
	public V6 v6 () {
		return new V6();
	}
	
	@Bean("v8")
	public V8 v8() {
		return new V8();
	}
}
