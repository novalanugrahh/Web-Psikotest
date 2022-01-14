package com.juaracoding.psikotes.mobile.utils;

public enum TestCases {
	
	T1("Web Psikotes"),
	T2("Login");
	
	private String testName;
	
	private TestCases(String Value) {
		this.testName = Value;
	}

	public String getTestName() {
		return testName;
	}
	
}
