package com.spring.sExam.exam1207;

import java.util.Scanner;

public class CalcuratorRun3 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		Calcurator2 calc = new Calcurator2();
		
		System.out.print("첫번째 수를 입력하세요? ");
		calc.setSu1(scanner.nextInt());
		
		System.out.print("두번째 수를 입력하세요? ");
		calc.setSu2(scanner.nextInt());
		
		calc.add();
		calc.sub();
		calc.mul();
		calc.div();
		
		scanner.close();
	}
}
