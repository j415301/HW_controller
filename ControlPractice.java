package com.kh.practice.chap01;

import java.util.Scanner;

public class ControlPractice {
	
	public void practice1() {
		Scanner sc = new Scanner(System.in);
		System.out.println("1. 입력\n2. 수정\n3. 조회\n4. 삭제\n7. 종료");
		System.out.print("메뉴 번호를 입력하세요: ");
		int num = sc.nextInt();
		switch (num) {
			case 1: System.out.println("입력 메뉴입니다.");
			case 2: System.out.println("수정 메뉴입니다.");
			case 3: System.out.println("조회 메뉴입니다.");
			case 4: System.out.println("삭제 메뉴입니다.");
			case 7: System.out.println("프로그램이 종료됩니다.");
		}
	}
	
	public void practice2() {
		Scanner sc = new Scanner(System.in);
		System.out.print("숫자를 한 개 입력하세요 : ");
		int num = sc.nextInt();
		if (num>0) {
			if (num%2==0) {
				System.out.println("짝수다");
			} else {
				System.out.println("홀수다");
			}
		} else {
			System.out.println("양수만 입력해주세요.");
		}
	}
	
	public void practice3() {
		Scanner sc = new Scanner(System.in);
		System.out.print("국어점수 : ");
		int kor = sc.nextInt();
		System.out.print("수학점수 : ");
		int math = sc.nextInt();
		System.out.print("영어점수 : ");
		int eng = sc.nextInt();
		int sum = kor+eng+math;
		if (kor>=40 && eng>=40 && math>=40 && (sum)/3.0>=60) {
			System.out.printf("국어 : %d\n수학 : %d\n영어 : %d\n합계 : %d\n평균: %.1f\n축하합니다, 합격입니다!", kor, math, eng, sum, sum/3.0);
		} else {
			System.out.println("불합격입니다.");
		}
	}
	
	public void practice4() {
		Scanner sc = new Scanner(System.in);
		System.out.print("1~12 사이의 정수 입력 : ");
		int month = sc.nextInt();
		int num = 0;
		if (month==1 || month==2 || month==12) {
			num = 1;
		} else if (month<=5) {
			num = 2;
		} else if (month<=8) {
			num = 3;
		} else if (month<=11) {
			num = 4;
		} else {
			num = month;
		}
		switch (num) {
			case 1: System.out.println(month+"월은 겨울입니다."); break;
			case 2: System.out.println(month+"월은 봄입니다."); break;
			case 3: System.out.println(month+"월은 여름입니다."); break;
			case 4: System.out.println(month+"월은 가을입니다."); break;
			default: System.out.println(month+"월은 잘못 입력된 달입니다.");
		}
	}
	
	public void practice5() {
		Scanner sc = new Scanner(System.in);
		System.out.print("아이디 : ");
		String id = sc.next();
		System.out.print("비밀번호 : ");
		String pw = sc.next();
		if (id.equals("myId")) {
			if (pw.equals("myPassword12")) {
				System.out.println("로그인 성공");
			} else {
				System.out.println("비밀번호가 틀렸습니다.");
			}
		} else {
			System.out.println("아이디가 틀렸습니다.");
		}
	}
	
	public void practice6() {
		Scanner sc = new Scanner(System.in);
		System.out.print("권한을 확인하고자 하는 회원 등급 : ");
		String role = sc.next();
		switch (role) {
			case "관리자": System.out.println("회원관리, 게시글 관리, 게시글 작성, 게시글 조회, 댓글 작성"); break;
			case "회원": System.out.println("게시글 작성, 게시글 조회, 댓글 작성"); break;
			case "비회원": System.out.println("게시글 조회");
		}
	}
	
	public void practice7() {
		Scanner sc = new Scanner(System.in);
		System.out.print("키(m)를 입력해주세요 : ");
		double height = sc.nextDouble();
		System.out.print("몸무게(kg)을 입력해주세요 : ");
		double weight = sc.nextDouble();
		double bmi = weight/(height*height);
		System.out.println("BMI 지수 : "+bmi);
		if (bmi<18.5) {
			System.out.println("저체중");
		} else if (bmi<23) {
			System.out.println("정상체중");
		} else if (bmi<25) {
			System.out.println("과체중");
		} else if (bmi<30) {
			System.out.println("비만");
		} else {
			System.out.println("고도 비만");
		}
	}
	
	public void practice8() {
		Scanner sc = new Scanner(System.in);
		System.out.print("피연산자1 입력 : ");
		int num1 = sc.nextInt();
		System.out.print("피연산자2 입력 : ");
		int num2 = sc.nextInt();
		System.out.print("연산자 입력(+, -, *, /, %) : ");
		char op = sc.next().charAt(0);
		if (num1>0 && num2>0) {
			switch (op) {
				case '+': System.out.printf("%d + %d = %d", num1, num2, num1+num2); break;
				case '-': System.out.printf("%d - %d = %d", num1, num2, num1-num2); break;
				case '*': System.out.printf("%d * %d = %d", num1, num2, num1*num2); break;
				case '/': System.out.printf("%d / %d = %.6f", num1, num2, (double)num1/num2); break;
				case '%': System.out.println(num1+" % "+num2+" = "+num1%num2); break;
				default: System.out.println("잘못 입력하셨습니다. 프로그램을 종료합니다.");
			}
		}
	}
	
	public void practice9() {
		Scanner sc = new Scanner(System.in);
		System.out.print("중간 고사 점수 : ");
		int mid = sc.nextInt();
		System.out.print("기말 고사 점수 : ");
		int fin = sc.nextInt();
		System.out.print("과제 점수 : ");
		int work = sc.nextInt();
		System.out.print("출석 회수 : ");
		int attend = sc.nextInt();
		System.out.println("========== 결과 ==========");
		if (attend>=14) {
			if (mid*0.2+fin*0.3+work*0.3+attend>=70) {
				System.out.println("중간 고사 점수(20) : "+mid*0.2);
				System.out.println("기말 고사 점수(30) : "+fin*0.3);
				System.out.println("과제 점수    (30) : "+work*0.3);
				System.out.println("출석 점수    (20) : "+(double)attend);
				System.out.println("총점 : "+(mid*0.2+fin*0.3+work*0.3+attend));
				System.out.println("PASS");
			} else {
				System.out.println("중간 고사 점수(20) : "+mid*0.2);
				System.out.println("기말 고사 점수(30) : "+fin*0.3);
				System.out.println("과제 점수    (30) : "+work*0.3);
				System.out.println("출석 점수    (20) : "+(double)attend);
				System.out.println("총점 : "+(mid*0.2+fin*0.3+work*0.3+attend));
				System.out.println("Fail [점수 미달]");
			}
		} else {
			System.out.println("Fail [출석 회수 부족 ("+attend+"/20]");
		}
	}
	
	public void practice10() {
		 System.out.println("실행할 기능을 선택하세요.\n1. 메뉴 출력\n2. 짝수/홀수\n3. 합격/불합격\n4. 계절\n5. 로그인\n"
		 		+ "6. 권한 확인\n7. BMI\n8. 계산기\n9. P/F");
		 Scanner sc = new Scanner(System.in);
		 System.out.println("선택 : ");
		 int func = sc.nextInt();
		 switch (func) {
		 	case 1: practice1(); break;
		 	case 2: practice2(); break;
		 	case 3: practice3(); break;
		 	case 4: practice4(); break;
		 	case 5: practice5(); break;
		 	case 6: practice6(); break;
		 	case 7: practice7(); break;
		 	case 8: practice8(); break;
		 	case 9: practice9(); break;
		 }
	}

}
