package com.spring.sExam.exam1207;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class SungjukVO {
	private String name;
	private int kor;
	private int eng;
	private int mat;
	private int tot;
	private double avg;
	private String grade;
	
	private SungjukService service = new SungjukService();
	
	public void sungjukCalc() {
		SungjukVO vo = service.calc(name, kor, eng, mat);
		this.tot = vo.getTot();
		this.avg = vo.getAvg();
		this.grade = vo.getGrade();
	}
	
	public void sungjukPrint() {
		service.printSungjuk(name, kor, eng, mat, tot, avg, grade);
	}
	
	public void sungjukTitle() {
		service.printTitle();
	}
}
