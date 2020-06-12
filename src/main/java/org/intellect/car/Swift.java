package org.intellect.car;

import org.intellect.interfaces.Car;
import org.springframework.stereotype.Component;
public class Swift implements Car {

	public String specs() {
		return "Hatchback from Suzuki";
	}
}
