package ��������_��������_����;

public class GlobalLocalEx {
	static int class_var;  //'Ŭ���� ����(����Ӽ�)'�̰� 0���� �ڵ� �ʱ�ȭ /�����ñ�� Ŭ������ �޸𸮿� �ö� ��
	int instance_var;      //'�ν��Ͻ� ����(�����Ӽ�)'�̰� 0���� �ڵ� �ʱ�ȭ /�����ñ�� �ν��Ͻ��� �����Ǿ��� ��

	public static void main(String[] args) {
		int local_var = 0;  //'���� ����'�̰� �ݵ�� �ʱ�ȭ ���Ѿ� �Ѵ�.
		
		System.out.println("Ŭ���� ������ = "+ GlobalLocalEx.class_var);
		                              //���ٹ�� => 'Ŭ������.Ŭ����������'
		
		GlobalLocalEx gle = new GlobalLocalEx();
		System.out.println("�ν��Ͻ� ������ = " + gle.instance_var);
		                     //���ٹ�� => '����������.�ν��Ͻ�������'
		
		System.out.println("�������� �� = " + local_var);

	}

}
