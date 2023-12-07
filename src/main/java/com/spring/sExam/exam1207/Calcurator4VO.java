package com.spring.sExam.exam1207;

public class Calcurator4VO {
	private int su1;
	private int su2;
	
	public int getSu1() {
		return su1;
	}
	public void setSu1(int su1) {
		int res = bigyo(su1);
		if(res == 1) this.su1 = su1;
		else this.su1 = 0;
	}
	public int getSu2() {
		return su2;
	}
	public void setSu2(int su2) {
		int res = bigyo(su2);
		if(res == 1) this.su2 = su2;
		else this.su2 = 0;
	}
	
	private int bigyo(int su) {
		int res = 1;
		if(su < 0) {
			System.out.println("입력되는 수는 양수만 가능합니다.");
			res = 0;
		}
		return res;
	}
	
}
