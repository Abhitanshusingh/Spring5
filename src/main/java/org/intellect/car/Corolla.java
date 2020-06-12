package org.intellect.car;

import org.intellect.interfaces.Car;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.sun.xml.internal.ws.api.pipe.Engine;

@Component("corolla")
public class Corolla implements Car {

	public String specs() {
		return "Hatchback from Suzuki";
	}
}
