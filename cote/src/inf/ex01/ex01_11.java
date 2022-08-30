package inf.ex01;

public class ex01_11 {

}

/*


import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.Stack;

public class Main {
	
	public String solution(String str) {
		//이보다 좋은 방법은 String에 마지막 " "를 추가하여 인덱스를 기존 string의 끝까지만 돌게하고 비교 
		String answer = "";
		int cnt=1;
		for(int i=0; i<str.length(); i++) {
			if(i == str.length()-1 && str.charAt(i) == str.charAt(i-1)) {
				answer+=Character.toString( str.charAt(i));
				answer+= Integer.toString(cnt);
			}
			else if(i == str.length()-1 && str.charAt(i) != str.charAt(i-1)) {
				answer+=Character.toString( str.charAt(i));
			}else {
				if(str.charAt(i)==str.charAt(i+1)) {
					cnt++;
				}else {
					answer+=Character.toString( str.charAt(i));
					if(cnt!=1) {
						answer+= Integer.toString(cnt);
					}
					cnt=1;
				}
			}
			
		}
		
		return answer;
		
	}
	

	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		Main T = new Main();
		String str = br.readLine();
		
		System.out.println(T.solution(str));
	}

}



*/