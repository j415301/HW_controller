package com.kh.practice.chap01;

import java.util.Scanner;

public class ControlPractice2 {
	
	public void practice11() {
		Scanner sc = new Scanner(System.in);
		System.out.print("비밀번호 입력(1000~9999) : ");
		String lock = sc.next();
		boolean flag = true;
		boolean flag2 = true;
		while (flag) {
			if (lock.length()>4) {
				System.out.println("자리수 안맞음");
				break;
			}
			gugu:
			for (int i=0 ; i<4 ; i++) {
				for(int j=0 ; j<4 ; j++) {
					if (i!=j && lock.charAt(i)==lock.charAt(j)) {
						flag = false;
						flag2 = false;
						break gugu;//실패를 1번만 출력할 수 있도록 도와줌
					} else {
						flag = false;
					}
				}
			}
			System.out.println(flag2? "성공" : "실패");
		}
	}
	
	public void practice11_2() {
		Scanner sc = new Scanner(System.in);
		System.out.print("비밀번호 입력(1000~9999) : ");
		String lock = sc.next();
		boolean flag = false;
		if (lock.length()<=4) {
			for (int i=0 ; i<lock.length() ; i++) {
				for (int j=0 ; j<lock.length(); j++) {
					if (i!=j && lock.charAt(i)==lock.charAt(j)) {
						flag = true;
						break;
					}
				}
			}
			if (flag) {
				System.out.println("실패");
			} else {
				System.out.println("성공");
			}
		} else {
			System.out.println("자리수 안맞음");
		}
	}
}
