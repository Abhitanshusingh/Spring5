package org.intellect.car;

import org.intellect.interfaces.Car;
import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Component;
@Component("corolla")
public class Corolla implements Car {
	
	//Using Autowired no need to create object
	@Autowired
	Engine engine;
	
	public String specs() {
		String spec = "sadan from toyota with engine type :"+engine.type;
		return spec;
	}
}
