package com.one.day;

import java.util.Scanner;

public class E_passWord_12_22 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("��й�ȣ�� �����Ͻðڽ��ϱ�? [y/n] : ");
		char ch = sc.next().charAt(0);

		if(ch == 'y' || ch =='Y' ) {
			sc.nextLine();
			System.out.print("���� ��й�ȣ�� �Է��Ͻÿ� : ");
			String str = sc.nextLine(); 
			char ch2 = str.charAt(0);
			char ch3 = str.charAt(1);
			char ch4 = str.charAt(2);
			char ch5 = str.charAt(3);
			char ch6 = str.charAt(4);
			char ch7 = str.charAt(5);
			char ch8 = str.charAt(6);
			char ch9 = str.charAt(7);

			System.out.print("������ ��й�ȣ�� �Է��Ͻÿ� : ");
			String str2 = sc.nextLine();
			char ch22 = str2.charAt(0);
			char ch33 = str2.charAt(1);
			char ch44 = str2.charAt(2);
			char ch55 = str2.charAt(3);
			char ch66 = str2.charAt(4);
			char ch77 = str2.charAt(5);
			char ch88 = str2.charAt(6);
			char ch99 = str2.charAt(7);

			if(ch2 != ch22 || ch3 !=ch33 || ch4 !=ch44 || ch5 != ch55 || ch6 != ch66 || ch7 != ch77 || ch8 != ch88 || ch9 != ch99) {
				System.out.println("��й�ȣ ���濡 �����ϼ̽��ϴ�."); }

			if(ch2 == ch22 && ch3 ==ch33 && ch4 ==ch44 && ch5 == ch55 && ch6 == ch66 && ch7 == ch77 && ch8 == ch88 && ch9 == ch99) {
				System.out.println("���� ��й�ȣ�� �����մϴ�. ��й�ȣ ���濡 �����ϼ̽��ϴ�."); }




		}
		if(ch == 'n' || ch =='N' ) {
			System.out.println("��й�ȣ ������ ��û���� �ʾҽ��ϴ�");
		}

		System.out.println("���α׷� ����");
	}

}
