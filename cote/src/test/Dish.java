package test;

public class Dish extends Shef{

	public Dish(String menu, String foodDiv, String item) {
		super(menu, foodDiv, item);
	}
	public void cook(){
	System.out.println(super.foodDiv+" 요리사는 "+super.menu+" 을(를) 만들었습니다.");
	}
	public void serv(){
		System.out.println("고객은 주문한 "+super.menu+"을(를) 받았으며, "+super.item+"을 먹었습니다.");
	}
}
