package ���ʿ���;

public class CharTypeEx {

	public static void main(String[] args) {
		char c1 = 'A';       //���ڸ� ���� ����(���ڸ� �ƽ�Ű�ڵ尪���� => ���ڵ�)
		char c2 = 65;        //10������ ����(���ڸ� �ƽ�Ű�ڵ尪���� => ���ڵ�)
		char c3 = '\u0041';  //16������ ����(utf�� u�� �����ڵ带 ����)
		
		/*
		 * ���ڸ� ���ڷ� ��ȯ�ϴ� ���� ���ڵ��̶�� ��
		 * ���ڸ� ���ڷ� ��ȯ�ϴ� ���� ���ڵ�
		 */
		
		System.out.println(c1); // A ���
		System.out.println(c2); // A ���
		System.out.println(c3); // A ���
		
		char c4 = '��';
		char c5 = 44032;
		char c6 = '\uac00';  //�����ڵ尪(16����)
		
		System.out.println(c4); // �� ���
		System.out.println(c5); // �� ���
		System.out.println(c6); // �� ���
		
		// long ������ Ÿ�� ����
		long var1 = 1000000000000L;  //longŸ���� �빮�� L�� ���δ�.
		System.out.println(var1);
		
		//[�߿�] byte Ÿ���� �н����尪�� ��ȣȭ ��ų �� ����
		// byte aa = 127; ����Ʈ�� -128 ~ 127
		// short bb = 32767; ��Ʈ�� -32768 ~ 32767
		// int ��Ʈ�� -2147483648 ~ 2147483647

	}

}
