package backjoon;

import java.util.Arrays;

public class test2 {

	public static void main(String[] args) {
		long n=121;
		Double a = Math.sqrt(n);

		System.out.println(a);
		
		if(a==a.intValue()) {

			System.out.println(a.intValue());
			a=Math.pow((a+1), 2);
			
		}
		else a = (double) -1;
	
		
		System.out.println(a);
	}

	}

