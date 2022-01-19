package 기초예제;

import java.util.Scanner;

public class ScannerClassEx {

	public static void main(String[] args) {
		//Scanner 클래스 객체 생성 방법
		Scanner scan = new Scanner(System.in);
		//scan은 참조타입의 클래스타입이며 주소값을 참조한다.(참조타입변수)
		
		System.out.print("실수 입력 >>> ");
		double inputDouble = scan.nextDouble();
		System.out.println(inputDouble);
		
		/*
		System.out.print("정수 입력 >>> "); //ln은 줄바꿈을 하겠다 ln이 있을때와 없을때 차이점?
		int inputInt = scan.nextInt();  //scan은 객체 nextInt는 매소드, 매소드는 객체에 행위를 시킨다.
		System.out.println(inputInt);
		*/
		
		/*
		System.out.print("문자열 입력 >>> ");
		String inputString = scan.nextLine();
		System.out.println(inputString);
		*/
		
	}

}
