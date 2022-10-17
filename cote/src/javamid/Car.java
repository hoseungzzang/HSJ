package javamid;

import java.util.Objects;

public class Car {
	String name;
	int number;
	Car(){
		this.name = "Car";
		this.number = 1234;
		System.out.println(this.toString());
	}
	@Override
	public String toString() {
		return "\"name: " + name +", number: "+number+"\"";
	}


}
