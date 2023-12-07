package com.spring.sExam.exam1207;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SungjukXmlRun {
	public static void main(String[] args) {
			
		// 스프링 프로젝트에서 src/main/resources 디렉토리는 클래스 패스에 자동으로 포함되므로,
		// ClassPathXmlApplicationContext로 xml/sungjuk.xml을 로드할 때 src/main/resources를 생략할 수 있다
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
