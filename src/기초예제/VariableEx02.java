package ���ʿ���;

public class VariableEx02 {

	static int v2;  //v2�� 'Ŭ���� ����(���� ����)'�����. �ڵ����� 0���� �ʱ�ȭ�ȴ�.
	
	public static void main(String[] args) {
		int v1 = 15;  //v1�� '���� ����'�̴�. ���������� �ʱⰪ�� �����ؾ��Ѵ�.
		
		/*
		 * ������ '����� ��� ��'������ ����� �����ϴ�.
		 * static�� ����������.
		 */
		
		if(v1 > 10) {   //if[�ּ�] ���
			v2 = v1 - 10;
		}
		int v3 = v1 + v2 + 5;
		System.out.println(v3);
		
	}

}
