package 전역변수_지역변수_예제;
/*
 * 자바의 클래스 변수와 인스턴스 변수를 이해하기 좋은 예제 프로그램
 */
class Card {
	static int width = 100;   //넚이 클래스 변수
	static int height = 250;  //높이 클래스 변수
	
	String kind;  //카드 마다 고유 무늬의 종류 인스턴스 변수
	int number;   //카드 마다 고유 숫자의 인스턴스 변수
	//클래스변수와 인스턴스변수의 글씨체는 다르다.
}

public class CardGameEx {  //class는 맘대로 만들수 있지만 public은 1개만 있어야함

	public static void main(String[] args) {
		System.out.println("Card.width = " + Card.width);
		//+는 사칙연산의 더하기가 아니라 연결의 개념임'연결연산자'
		System.out.println("Card.height = " + Card.height);
		
		Card card1 = new Card();  //Card라는 인스턴스 객체가 생성
		card1.kind = "Spaid";
		card1.number = 5;
		
		Card card2 = new Card();
		card2.kind = "Heart";
		card2.number = 8;
		
		System.out.println("card1은 "+card1.kind+","+card1.number+"이며,"
				+ "카드 크기는("+card1.width+","+card1.height+")");
		
		System.out.println("card2은 "+card2.kind+","+card2.number+"이며,"
				+ "카드 크기는("+card2.width+","+card2.height+")");

	}

}
