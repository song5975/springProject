package com.spring.sExam.exam1207;

public class SungjukService {

	public SungjukVO calc(String name, int kor, int eng, int mat) {
		SungjukVO vo = new SungjukVO();
		
		int tot = kor + eng + mat;
		double avg = tot / 3.0;
		String grade = "";
		
		if(avg >= 90) grade = "A";
		else if(avg >= 80) grade = "B";
		else if(avg >= 70) grade = "C";
		else if(avg >= 60) grade = "D";
		else grade = "F";
		
		vo.setTot(tot);
		vo.setAvg(avg);
		vo.setGrade(grade);
		
		return vo;
	}

	public void printSungjuk(String name, int kor, int eng, int mat, int tot, double avg, String grade) {
		System.out.println(name+"\t"+kor+"\t"+eng+"\t"+mat+"\t"+tot+"\t"+avg+"\t"+grade);
	}

	public void printTitle() {
		System.out.println("====================================================================");
		System.out.println("성명\t국어\t영어\t수학\t총점\t평균\t학점");
		System.out.println("====================================================================");
		
	}
	
}
