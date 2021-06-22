package ch03;

public class StudentTest {
	public static void main(String[] args) {
		// Stduent = 데이터 타입
		// stdKim = 변수명(이 때는, 참조변수라고도 함)
		// Student() = 생성자
		Student stdKim = new Student();
		// 위와 같은 객체를 인스턴스 객체라고 함
		stdKim.stdId = 1234;
		stdKim.address = "Seoul";
		stdKim.setStdName("Jamie Kim");
		
		stdKim.showStdInfo();
		
		System.out.println("name is " + stdKim.getStdName());	
	}
}
