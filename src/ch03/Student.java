package ch03;

public class Student {
	int stdId;
	String stdName;
	String address;
	
	public void showStdInfo() {
		System.out.println(stdId + "�й��� �̸��� " + stdName + "�̰�, �ּҴ� " + address + "�Դϴ�.");
	}
	
	public String getStdName() {
		return stdName;
	}
	
	public void setStdName(String name) {
		stdName = name;
	}
}
