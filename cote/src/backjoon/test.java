package backjoon;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.StringTokenizer;

public class test {

	public static void main(String[] args) {
	
		int x=2;
		int calc=0;
		char[] a = Integer.toString(x).toCharArray();
		
		if(a.length>1) {
			for(int i=0; i<a.length;i++) {
				
				calc+=(a[i]-'0');
				System.out.println(calc);
				
			}
			if(x%calc==0) {
				System.out.println("true");
			}
			else System.out.println("false");
			
		}
		else System.out.println("true");
		
		
	}
	
}
