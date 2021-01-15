package com.kh.practice.chap01;

import java.util.Scanner;

public class ControlPractice {
	
	public void practice1() {
		Scanner sc = new Scanner(System.in);
		System.out.println("1. �Է�\n2. ����\n3. ��ȸ\n4. ����\n7. ����");
		System.out.print("�޴� ��ȣ�� �Է��ϼ���: ");
		int num = sc.nextInt();
		switch (num) {
			case 1: System.out.println("�Է� �޴��Դϴ�.");
			case 2: System.out.println("���� �޴��Դϴ�.");
			case 3: System.out.println("��ȸ �޴��Դϴ�.");
			case 4: System.out.println("���� �޴��Դϴ�.");
			case 7: System.out.println("���α׷��� ����˴ϴ�.");
		}
	}
	
	public void practice2() {
		Scanner sc = new Scanner(System.in);
		System.out.print("���ڸ� �� �� �Է��ϼ��� : ");
		int num = sc.nextInt();
		if (num>0) {
			if (num%2==0) {
				System.out.println("¦����");
			} else {
				System.out.println("Ȧ����");
			}
		} else {
			System.out.println("����� �Է����ּ���.");
		}
	}
	
	public void practice3() {
		Scanner sc = new Scanner(System.in);
		System.out.print("�������� : ");
		int kor = sc.nextInt();
		System.out.print("�������� : ");
		int math = sc.nextInt();
		System.out.print("�������� : ");
		int eng = sc.nextInt();
		int sum = kor+eng+math;
		if (kor>=40 && eng>=40 && math>=40 && (sum)/3.0>=60) {
			System.out.printf("���� : %d\n���� : %d\n���� : %d\n�հ� : %d\n���: %.1f\n�����մϴ�, �հ��Դϴ�!", kor, math, eng, sum, sum/3.0);
		} else {
			System.out.println("���հ��Դϴ�.");
		}
	}
	
	public void practice4() {
		Scanner sc = new Scanner(System.in);
		System.out.print("1~12 ������ ���� �Է� : ");
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
			case 1: System.out.println(month+"���� �ܿ��Դϴ�."); break;
			case 2: System.out.println(month+"���� ���Դϴ�."); break;
			case 3: System.out.println(month+"���� �����Դϴ�."); break;
			case 4: System.out.println(month+"���� �����Դϴ�."); break;
			default: System.out.println(month+"���� �߸� �Էµ� ���Դϴ�.");
		}
	}
	
	public void practice5() {
		Scanner sc = new Scanner(System.in);
		System.out.print("���̵� : ");
		String id = sc.next();
		System.out.print("��й�ȣ : ");
		String pw = sc.next();
		if (id.equals("myId")) {
			if (pw.equals("myPassword12")) {
				System.out.println("�α��� ����");
			} else {
				System.out.println("��й�ȣ�� Ʋ�Ƚ��ϴ�.");
			}
		} else {
			System.out.println("���̵� Ʋ�Ƚ��ϴ�.");
		}
	}
	
	public void practice6() {
		Scanner sc = new Scanner(System.in);
		System.out.print("������ Ȯ���ϰ��� �ϴ� ȸ�� ��� : ");
		String role = sc.next();
		switch (role) {
			case "������": System.out.println("ȸ������, �Խñ� ����, �Խñ� �ۼ�, �Խñ� ��ȸ, ��� �ۼ�"); break;
			case "ȸ��": System.out.println("�Խñ� �ۼ�, �Խñ� ��ȸ, ��� �ۼ�"); break;
			case "��ȸ��": System.out.println("�Խñ� ��ȸ");
		}
	}
	
	public void practice7() {
		Scanner sc = new Scanner(System.in);
		System.out.print("Ű(m)�� �Է����ּ��� : ");
		double height = sc.nextDouble();
		System.out.print("������(kg)�� �Է����ּ��� : ");
		double weight = sc.nextDouble();
		double bmi = weight/(height*height);
		System.out.println("BMI ���� : "+bmi);
		if (bmi<18.5) {
			System.out.println("��ü��");
		} else if (bmi<23) {
			System.out.println("����ü��");
		} else if (bmi<25) {
			System.out.println("��ü��");
		} else if (bmi<30) {
			System.out.println("��");
		} else {
			System.out.println("�� ��");
		}
	}
	
	public void practice8() {
		Scanner sc = new Scanner(System.in);
		System.out.print("�ǿ�����1 �Է� : ");
		int num1 = sc.nextInt();
		System.out.print("�ǿ�����2 �Է� : ");
		int num2 = sc.nextInt();
		System.out.print("������ �Է�(+, -, *, /, %) : ");
		char op = sc.next().charAt(0);
		if (num1>0 && num2>0) {
			switch (op) {
				case '+': System.out.printf("%d + %d = %d", num1, num2, num1+num2); break;
				case '-': System.out.printf("%d - %d = %d", num1, num2, num1-num2); break;
				case '*': System.out.printf("%d * %d = %d", num1, num2, num1*num2); break;
				case '/': System.out.printf("%d / %d = %.6f", num1, num2, (double)num1/num2); break;
				case '%': System.out.println(num1+" % "+num2+" = "+num1%num2); break;
				default: System.out.println("�߸� �Է��ϼ̽��ϴ�. ���α׷��� �����մϴ�.");
			}
		}
	}
	
	public void practice9() {
		Scanner sc = new Scanner(System.in);
		System.out.print("�߰� ��� ���� : ");
		int mid = sc.nextInt();
		System.out.print("�⸻ ��� ���� : ");
		int fin = sc.nextInt();
		System.out.print("���� ���� : ");
		int work = sc.nextInt();
		System.out.print("�⼮ ȸ�� : ");
		int attend = sc.nextInt();
		System.out.println("========== ��� ==========");
		if (attend>=14) {
			if (mid*0.2+fin*0.3+work*0.3+attend>=70) {
				System.out.println("�߰� ��� ����(20) : "+mid*0.2);
				System.out.println("�⸻ ��� ����(30) : "+fin*0.3);
				System.out.println("���� ����    (30) : "+work*0.3);
				System.out.println("�⼮ ����    (20) : "+(double)attend);
				System.out.println("���� : "+(mid*0.2+fin*0.3+work*0.3+attend));
				System.out.println("PASS");
			} else {
				System.out.println("�߰� ��� ����(20) : "+mid*0.2);
				System.out.println("�⸻ ��� ����(30) : "+fin*0.3);
				System.out.println("���� ����    (30) : "+work*0.3);
				System.out.println("�⼮ ����    (20) : "+(double)attend);
				System.out.println("���� : "+(mid*0.2+fin*0.3+work*0.3+attend));
				System.out.println("Fail [���� �̴�]");
			}
		} else {
			System.out.println("Fail [�⼮ ȸ�� ���� ("+attend+"/20]");
		}
	}
	
	public void practice10() {
		 System.out.println("������ ����� �����ϼ���.\n1. �޴� ���\n2. ¦��/Ȧ��\n3. �հ�/���հ�\n4. ����\n5. �α���\n"
		 		+ "6. ���� Ȯ��\n7. BMI\n8. ����\n9. P/F");
		 Scanner sc = new Scanner(System.in);
		 System.out.println("���� : ");
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
