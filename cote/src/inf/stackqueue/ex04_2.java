package inf.stackqueue;

public class ex04_2 {

}

/*


import java.io.BufferedReader;
import java.util.HashMap;import java.util.Map;import java.util.Map.Entry;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Stack;
import java.util.StringTokenizer;

public class Main {
	
	public String solution(String str1) {
		String answer = "";
		int cnt = 0;
		
		Stack<Character> stack = new Stack<>();
		
			for(int i=0; i<str1.length() ; i++) {
				if(str1.charAt(i)=='(') {
					stack.push(str1.charAt(i));
				}else if(!stack.isEmpty() && str1.charAt(i)==')') {
					stack.pop();
				}
				
				if(stack.isEmpty()&&str1.charAt(i)!=')') {
					answer+=str1.charAt(i);
				}
				
				
			}
		

		return answer;
		
	}
	

	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		Main T = new Main();
		
		String str1 = br.readLine();
		
		System.out.println(T.solution(str1));
	}

}





*/