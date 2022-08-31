package inf.ex03;

public class ex03_2 {

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
	
	public String solution( String str1, String str2) {
		String answer = "YES";
		Map<Character, Integer> map = new HashMap<>();
		
		for(int i=0; i<str1.length() ;i++) {
			if(map.containsKey(str1.charAt(i))) {
				int num = map.get(str1.charAt(i))+1;
				map.put(str1.charAt(i),  num);
			}else {
				map.put(str1.charAt(i),  1);
			}
		}
		for(int i=0; i<str2.length(); i++) {
			if(map.containsKey(str2.charAt(i))) {
				int num = map.get(str2.charAt(i))-1;
				map.put(str2.charAt(i),  num);
			}else {
				map.put(str2.charAt(i),  1);
			}
		}
		for (Entry<Character, Integer> entrySet : map.entrySet()) {
			if(entrySet.getValue()!=0) {
				answer="NO";
				break;
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