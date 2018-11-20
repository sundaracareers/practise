package com.example.demo;

public class Values {
	
	public int getA() {
		return a;
	}

	public void setA(int a) {
		this.a = a;
	}

	public int getB() {
		return b;
	}

	public void setB(int b) {
		this.b = b;
	}

	public int getValue() {
		return Value;
	}

	public void setValue(int value) {
		Value = value;
	}
	
	

	public Values(int a, int b, int value) {
		super();
		this.a = a;
		this.b = b;
		Value = value;
	}



	private int a;
	private int b;
	
	private int Value;

}
