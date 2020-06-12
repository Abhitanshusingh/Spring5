package org.intellect.car;

import org.intellect.interfaces.Car;
import org.intellect.interfaces.Engine;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

public class Corolla implements Car {
	
	//Using Autowired no need to create object
	@Autowired
	//Give name which we wish to Autowired
	@Qualifier("v8")
	Engine engine;
	
	public String specs() {
		String spec = "sadan from toyota with engine type: "+engine.type();
		return spec;
	}
}
