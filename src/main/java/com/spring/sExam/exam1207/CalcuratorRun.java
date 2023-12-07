package com.spring.sExam.exam1207;

public class CalcuratorRun {
	public static void main(String[] args) {
		Calcurator calc = new Calcurator();
		
		calc.setSu1(100);
		calc.setSu2(200);
		
		calc.add();
		calc.sub();
		calc.mul();
		calc.div();
	}
}
