package com.spring.sExam.exam1207;

public class CalcuratorService4 {

	public void add(int su1, int su2) {
		System.out.println(su1 +" + "+ su2 + " = " + (su1 + su2));
	}
	public void sub(int su1, int su2) {
		System.out.println(su1 +" - "+ su2 + " = " + (su1 - su2));
	}
	public void mul(int su1, int su2) {
		System.out.println(su1 +" * "+ su2 + " = " + (su1 * su2));
		
	}
	public void div(int su1, int su2) {
		if(su2 != 0) {
		  System.out.println(su1 +" / "+ su2 + " = " + (su1 / su2));
		}
		else {
			System.out.println("0으로 나눌수 없습니다.");
		}
	}
	
}
