package com.dimexer.ee.myejbs.impl;

import javax.ejb.Remote;
import javax.ejb.Stateless;

import com.dimexer.ee.myejbs.HelloEJB;

@Remote(HelloEJB.class)
@Stateless
public class HelloEJBImpl implements HelloEJB {
	public String sayHello(String name) {
		return "Hello, " + name + "!";
	}
}
