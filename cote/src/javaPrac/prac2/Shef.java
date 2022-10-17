package javaPrac.prac2;

public class Shef extends Menu{

	public Shef(String menu, String foodDiv, String item) {
		super(menu, foodDiv, item);
		
	}
	public void order() {
		System.out.println(super.foodDiv+" 요리사는 "+super.menu+" 주문을 받았습니다.");
	}


}
