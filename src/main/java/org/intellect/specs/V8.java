package org.intellect.specs;

import org.intellect.interfaces.Engine;
import org.springframework.stereotype.Component;

@Component("v8")
public class V8 implements Engine {

	public String type() {
		return "V8 Engine";
	}
}
