package ch03;

public class StudentTest {
	public static void main(String[] args) {
		// Stduent = ������ Ÿ��
		// stdKim = ������(�� ����, ����������� ��)
		// Student() = ������
		Student stdKim = new Student();
		// ���� ���� ��ü�� �ν��Ͻ� ��ü��� ��
		stdKim.stdId = 1234;
		stdKim.address = "Seoul";
		stdKim.setStdName("Jamie Kim");
		
		stdKim.showStdInfo();
		
		System.out.println("name is " + stdKim.getStdName());	
	}
}
