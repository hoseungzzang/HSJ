package inf;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;

public class Main {
	
	public String solution(String str) {
		String answer="";
		ArrayList<String> list = new ArrayList<String>();
		
		for(int i=0; i<str.length(); i++) {
			String s = Character.toString(str.charAt(i));
			if(list.indexOf(s)==-1) {
				list.add(s);
				answer+=s;
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
