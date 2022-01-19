package 기초예제;

public class CharTypeEx {

	public static void main(String[] args) {
		char c1 = 'A';       //문자를 직접 저장(숫자를 아스키코드값으로 => 디코딩)
		char c2 = 65;        //10진수로 저장(문자를 아스키코드값으로 => 인코딩)
		char c3 = '\u0041';  //16진수로 저장(utf의 u는 유니코드를 뜻함)
		
		/*
		 * 문자를 숫자로 변환하는 것을 인코딩이라고 함
		 * 숫자를 문자로 변환하는 것은 디코딩
		 */
		
		System.out.println(c1); // A 출력
		System.out.println(c2); // A 출력
		System.out.println(c3); // A 출력
		
		char c4 = '가';
		char c5 = 44032;
		char c6 = '\uac00';  //유니코드값(16진수)
		
		System.out.println(c4); // 가 출력
		System.out.println(c5); // 가 출력
		System.out.println(c6); // 가 출력
		
		// long 데이터 타입 관련
		long var1 = 1000000000000L;  //long타입은 대문자 L을 붙인다.
		System.out.println(var1);
		
		//[중요] byte 타입은 패스워드값을 암호화 시킬 때 적용
		// byte aa = 127; 바이트는 -128 ~ 127
		// short bb = 32767; 소트는 -32768 ~ 32767
		// int 인트는 -2147483648 ~ 2147483647

	}

}
