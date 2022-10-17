package test;

public class Client {

	public static void main(String[] args) {
	
		Dish shef = new Dish("양꼬치","중식","손");
		System.out.println("고객은 "+shef.menu+"을(를) 주문하였습니다.");
		shef.order();
		shef.cook();
		shef.serv();
	}

}
