package javaPrac.prac1;

public class Undergraduate extends Student {
	int grade;
	
	public Undergraduate(String name, String stuNum, String major, double score,int grade) {
		super(name,stuNum,major,score);
		this.grade = grade;
		
	}

	@Override
	public String toString() {
		
		return super.toString() + ", 학년=" + grade;
	}
	
}
