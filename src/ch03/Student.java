package ch03;

public class Student {
	int stdId;
	String stdName;
	String address;
	
	public void showStdInfo() {
		System.out.println(stdId + "학번의 이름은 " + stdName + "이고, 주소는 " + address + "입니다.");
	}
	
	public String getStdName() {
		return stdName;
	}
	
	public void setStdName(String name) {
		stdName = name;
	}
}
