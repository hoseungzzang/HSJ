package javaPrac.prac1;

public class Graduate extends Student{
	String prj;
	String profe;
	
	public Graduate(String name, String stuNum, String major, double score,String prj, String profe) {
		super(name,stuNum,major,score);
		this.prj = prj;
		this.profe =profe;
	}
	@Override
	public String toString() {
		
		return super.toString() + ", 논문주제=" + prj + ", 지도교수=" + profe;
	}
	
	public void setPrj(String prj) {
		this.prj = prj;
	}
	public void setProfe(String profe) {
		this.profe = profe;
	}
	
}
