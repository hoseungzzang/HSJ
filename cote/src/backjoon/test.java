package backjoon;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.StringTokenizer;

public class test {

	public static void main(String[] args) {
		//test();
		String s= "a B Z";
		String answer = "";
		int n=4;
		
		char [] arr = s.toCharArray();
		for(int i=0; i<arr.length; i++) {
			int sum=0;
			if (Character.isUpperCase(arr[i])) {
				if((int)arr[i]+n>90) {
					answer+=(char)(arr[i]+n-26);
				}
				else answer+=(char)(arr[i]+n);
			}
          

			else if (arr[i] == ' ') {
				answer+=' ';
			}else {
				if((int)arr[i]+n>122) {
					answer+=(char)(arr[i]+n-26);
				}
				else answer+=(char)(arr[i]+n);
			}
                
		}
		
	}
	
	
	public static void test() {
		char a = 'Z';//97~122 소문자  대문자 65~90 
		System.out.println((int)a);
	}
	
}
