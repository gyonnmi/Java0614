package org.java.oop;

public class OverLoding {

	//�����ε� "�ż������ �Ȱ��� �޼��� �Ű� ���� ������ ���̰� �ִ� �޼��� ���"
	//���������� ��ȯŸ�� �޼����(�Ű�����) {     }
	
	//�����
	public void method() {
		//������
		System.out.println("�޼���");
	}
	//��ȯ Ÿ�԰� �����ص� �����ε� �������� �ʴ´�
//	public int method() {
//		return 0;
//	}
	public void method(int num1, String name) {
		System.out.println(name+num1);
	}
	public void method(int num1) {
		System.out.println(num1);
	}
	//�Ű������� �̸��� �޶� Ÿ���� ������ ���� �޼��� ���
//	public void method(int num2, String name) {
//		System.out.println(name+num1);
//	}
	public void method(String name, int num1) {
		System.out.println(name+num1);
	}
	
	
	
	
	
	
	
	
	
	
	
	
}
