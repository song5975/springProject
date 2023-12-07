package com.spring.sExam.exam1207;

public class Calcurator2 {
	private int su1;
	private int su2;
	
	public Calcurator2() {}
	
	public Calcurator2(int su1, int su2) {
		this.su1 = su1;
		this.su2 = su2;
	}
	
	public int getSu1() {
		return su1;
	}
	public void setSu1(int su1) {
		this.su1 = su1;
	}
	public int getSu2() {
		return su2;
	}
	public void setSu2(int su2) {
		this.su2 = su2;
	}
	
	public void add() {
		System.out.println(su1 +" + "+ su2 + " = " + (su1 + su2));
	}
	public void sub() {
		System.out.println(su1 +" - "+ su2 + " = " + (su1 - su2));
	}
	public void mul() {
		System.out.println(su1 +" * "+ su2 + " = " + (su1 * su2));
	}
	public void div() {
		System.out.println(su1 +" / "+ su2 + " = " + (su1 / su2));
	}
}
