package com.juaracoding.psikotes.utils;

public enum TestCases {

	T1("Testing the authentication"),
	T2("Testing dashboard page");
	
	private String testName;	

	TestCases(String value){
		this.testName = value;
	}
	
	public String getTestName() {
		return testName;
	}
}
