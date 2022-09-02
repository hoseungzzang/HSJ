package inf.stackqueue;

public class ex04_5 {

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
	
	public String solution(String str1, String str2) {
		String answer= "YES";
		int cnt = 0;
	
		Map<Character,Integer> map = new HashMap<>();
		Boolean[] arr=  new Boolean[str1.length()];
		for(int i=0; i<str1.length(); i++) {
			map.put(str1.charAt(i),i);
		}
		
		for(int i=0; i<str2.length(); i++) {
			if(map.containsKey(str2.charAt(i))) {
				if(map.get(str2.charAt(i))!=cnt) {
				answer= "NO";
			
				}else {
					arr[cnt] = true;
					cnt++;
				}
			}
		}
		for(int i=0; i<arr.length; i++) {
			if(arr[i] == null) {
				return "NO";
			}
		}
		return answer;
		
	}
	

	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		Main T = new Main();
		
		String str1 = br.readLine();
		String str2 = br.readLine();
		
		System.out.println(T.solution(str1,str2));
	}

}


*/