package com.cg.overloading;

public class Point {
	
	private floatx;
	private float y;
	 //constructor overloading
	//c1 -0 parameter
	public point() {
		x=0.0f;
		y=0.0f;
	}
	
	//c2 -1 parameter
	public point(int x) {
		this,x=x;
		}
	
	//c3 -2 parameter
	public point(float x) {
		this.x=x;
	}
	@override
	public String toString() {
		return"point[x=" + " ,y="+ y + "]";
	}
	
}
