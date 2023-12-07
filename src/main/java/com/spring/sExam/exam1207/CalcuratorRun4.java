package com.spring.sExam.exam1207;

import java.util.Scanner;

public class CalcuratorRun4 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		Calcurator4VO vo = new Calcurator4VO();
		CalcuratorService4 service = new CalcuratorService4();
		
		
		int ans;
		while(true) {
			System.out.print("첫번째 수를 입력하세요?(작업종료:0) ");
			ans = scanner.nextInt();
			
			if(ans != 0) vo.setSu1(ans);
			else break;
			
			System.out.print("두번째 수를 입력하세요?");
			vo.setSu2(scanner.nextInt());
			
			service.add(vo.getSu1(), vo.getSu2());
			service.sub(vo.getSu1(), vo.getSu2());
			service.mul(vo.getSu1(), vo.getSu2());
			service.div(vo.getSu1(), vo.getSu2());
		}
		System.out.println("작업끝....");
		scanner.close();
	}
}
