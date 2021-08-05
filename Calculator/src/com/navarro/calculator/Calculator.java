package com.navarro.calculator;

public class Calculator {
	// variables
	private double nums1;
	private double nums2;
	private String operator;
	private double result;
	//constructor
	//method
	public void performOperation() {
		if (this.getOperator() == "+") {			
			this.setResult(this.getNums1() + this.getNums2());
		}else if(this.getOperator() == "-") {
			this.setResult(this.getNums1() - this.getNums2());
		}
	}
	//getter setter
	public double getNums1() {
		return nums1;
	}
	public void setNums1(double nums1) {
		this.nums1 = nums1;
	}
	public double getNums2() {
		return nums2;
	}
	public void setNums2(double nums2) {
		this.nums2 = nums2;
	}
	public String getOperator() {
		return operator;
	}
	public void setOperator(String operator) {
		this.operator = operator;
	}
	public double getResult() {
		return result;
	}
	public void setResult(double result) {
		this.result = result;
	}
	
	
	
	
	
}
