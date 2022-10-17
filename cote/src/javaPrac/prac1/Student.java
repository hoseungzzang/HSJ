package javaPrac.prac1;

public class Student {

	String name;
	String stuNum;
	String major ;
	double score;
	
	public Student(String name, String stuNum, String major, double score) {
		this.name = name;
		this.stuNum = stuNum;
		this.major = major;
		this.score = score;
	
	}
	@Override
	public String toString() {
		
		return "이름=" + name + ", 학번=" + stuNum + ", 학과=" + major
				+ ", 성적=" + score;
	}
}
