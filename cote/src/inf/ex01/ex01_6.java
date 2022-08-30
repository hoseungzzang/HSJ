package inf.ex01;

public class ex01_6 {

}

/*

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;

public class Main {
	
	public String solution(String str) {
		String answer="YES";
		str = str.toLowerCase();
		int start = 0;
		int end = str.length()-1;
		
		while(start<end) {
			if(str.charAt(start) != str.charAt(end)) {
				answer = "NO";
				break;
			}
			start++;
			end--;
		}
		//stringbuilder 쓰면 반복문 하나 안돌려도 해결 가능
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