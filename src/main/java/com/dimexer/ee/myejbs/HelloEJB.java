package com.dimexer.ee.myejbs;

import javax.ejb.Remote;

@Remote
public interface HelloEJB {
	public String sayHello(String name);
}
