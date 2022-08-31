package inf.stackqueue;

public class ex04_1 {

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
		String answer = "YES";
		int cnt = 0;
		
		Stack<Character> stack = new Stack<>();
		if(str1.charAt(0)==')') {
			answer = "NO";
		}
		else{
			for(int i=0; i<str1.length() ; i++) {
				char c = str1.charAt(i);
				if(c=='(') {
					stack.push(str1.charAt(i));
				}else if(c == ')' ) {
					if(stack.isEmpty()) {
						answer = "NO";
						break;
					}
					else if(stack.peek() =='(') {
						stack.pop();
					}
					
				}
			}
		}
		
		if(!stack.isEmpty()) {
			answer="NO";
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