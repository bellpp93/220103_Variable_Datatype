package 전역변수_지역변수_예제;

public class GlobalLocalEx {
	static int class_var;  //'클래스 변수(공통속성)'이고 0으로 자동 초기화 /생성시기는 클래스가 메모리에 올라갈 때
	int instance_var;      //'인스턴스 변수(개별속성)'이고 0으로 자동 초기화 /생성시기는 인스턴스가 생성되었을 때

	public static void main(String[] args) {
		int local_var = 0;  //'지역 변수'이고 반드시 초기화 시켜야 한다.
		
		System.out.println("클래스 변수값 = "+ GlobalLocalEx.class_var);
		                              //접근방법 => '클래스명.클래스변수명'
		
		GlobalLocalEx gle = new GlobalLocalEx();
		System.out.println("인스턴스 변수값 = " + gle.instance_var);
		                     //접근방법 => '참조변수명.인스턴스변수명'
		
		System.out.println("지역변수 값 = " + local_var);

	}

}
