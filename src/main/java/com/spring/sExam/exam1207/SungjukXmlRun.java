package com.spring.sExam.exam1207;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SungjukXmlRun {
	public static void main(String[] args) {
			
		ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext("xml/sungjuk.xml");
		
		SungjukVO vo = (SungjukVO) ctx.getBean("vo");
		
		vo.sungjukTitle();
		vo.sungjukCalc();
		vo.sungjukPrint();
		System.out.println();

		SungjukVO vo2 = (SungjukVO) ctx.getBean("vo2");
		
		vo2.sungjukTitle();
		vo2.sungjukCalc();
		vo2.sungjukPrint();
		
		ctx.close();
	}
}
