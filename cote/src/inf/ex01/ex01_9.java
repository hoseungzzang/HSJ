package inf.ex01;

public class ex01_9 {

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

		String answer = "YES";
		str= str.toLowerCase();
		str=str.replaceAll("[^a-z]", "");
		StringBuilder sb = new StringBuilder(str);
		if(!sb.reverse().toString().equals(str)) {
			answer = "NO";
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