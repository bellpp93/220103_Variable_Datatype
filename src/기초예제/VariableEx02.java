package 기초예제;

public class VariableEx02 {

	static int v2;  //v2를 '클래스 변수(전역 변수)'라고함. 자동으로 0으로 초기화된다.
	
	public static void main(String[] args) {
		int v1 = 15;  //v1은 '지역 변수'이다. 지역변수는 초기값을 설정해야한다.
		
		/*
		 * 변수는 '선언된 블록 내'에서만 사용이 가능하다.
		 * static은 정적변수다.
		 */
		
		if(v1 > 10) {   //if[주석] 블록
			v2 = v1 - 10;
		}
		int v3 = v1 + v2 + 5;
		System.out.println(v3);
		
	}

}
