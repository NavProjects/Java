package com.navarro.calculator;

public class CalcTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Calculator calc = new Calculator();
		calc.setNums1(10.5);
		calc.setOperator("+");
		calc.setNums2(5.2);
		calc.performOperation();
		System.out.println(calc.getResult());
	}

}
