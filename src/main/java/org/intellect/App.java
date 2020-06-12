package org.intellect;

import org.intellect.car.Corolla;
import org.intellect.car.Swift;
import org.intellect.interfaces.Car;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App {

	public static void main(String[] args) {
		
		//Store Factory
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
		
		//Get object from bean factory
		Car myCar = context.getBean("corolla", Car.class);
		System.out.println(myCar.specs());
		context.close();
	}
}
