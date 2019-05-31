package com.example.test;

import com.amazonaws.services.lambda.runtime.Context;
import com.amazonaws.services.lambda.runtime.RequestHandler;

public class TestApplication implements RequestHandler<Object, String> {
	@Override
	public String handleRequest(Object input, Context context) {
		System.out.println("TestApplication::handleRequest - input  : " + input);

		return "Hello " + input;
	}
}
