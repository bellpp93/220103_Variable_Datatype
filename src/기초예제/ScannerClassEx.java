package ���ʿ���;

import java.util.Scanner;

public class ScannerClassEx {

	public static void main(String[] args) {
		//Scanner Ŭ���� ��ü ���� ���
		Scanner scan = new Scanner(System.in);
		//scan�� ����Ÿ���� Ŭ����Ÿ���̸� �ּҰ��� �����Ѵ�.(����Ÿ�Ժ���)
		
		System.out.print("�Ǽ� �Է� >>> ");
		double inputDouble = scan.nextDouble();
		System.out.println(inputDouble);
		
		/*
		System.out.print("���� �Է� >>> "); //ln�� �ٹٲ��� �ϰڴ� ln�� �������� ������ ������?
		int inputInt = scan.nextInt();  //scan�� ��ü nextInt�� �żҵ�, �żҵ�� ��ü�� ������ ��Ų��.
		System.out.println(inputInt);
		*/
		
		/*
		System.out.print("���ڿ� �Է� >>> ");
		String inputString = scan.nextLine();
		System.out.println(inputString);
		*/
		
	}

}
