package org.intellect.specs;

import org.intellect.interfaces.Engine;
import org.springframework.stereotype.Component;

public class V6 implements Engine {

	public String type() {
		return "V6 Engine";
	}
}