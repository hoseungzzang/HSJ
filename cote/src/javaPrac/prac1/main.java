package javaPrac.prac1;

public class main {

	public static void main(String[] args) {
		Undergraduate s1 = new Undergraduate("홍길동","201901012","소프트웨어학과",3.88,2);
		Graduate s2 = new Graduate("홍길동","201901012","소프트웨어학과",4.12,"미정","박교수");
		Student s3 = new Graduate("홍길동","201901012","소프트웨어학과",3.88,"미정","박교수");
		s2.setPrj("정보보안");
		((Graduate)s3).setPrj("빅데이터");
		System.out.println(s1.toString()); 
		System.out.println(s2.toString()); 
		System.out.println(s3.toString()); 
	}

}
