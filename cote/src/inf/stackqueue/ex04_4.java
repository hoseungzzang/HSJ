package inf.stackqueue;

public class ex04_4 {

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
	
	public String solution(String str1 , String str2) {
		String answer = "";
		int cnt = 0;
		Map<Character,Integer> map1 = new HashMap<>(); 
		Map<Character,Integer> map2 = new HashMap<>(); 
		for(int i=0; i<str2.length(); i++) {
			map1.put(str2.charAt(i), map1.getOrDefault(str2.charAt(i),0)+1);
		}
		for(int i=0; i<str2.length()-1; i++) {
			map2.put(str1.charAt(i), map2.getOrDefault(str1.charAt(i),0)+1);
		}
		int lt = 0;
		for(int i=str2.length()-1; i<str1.length(); i++) {
			map2.put(str1.charAt(i), map2.getOrDefault(str1.charAt(i),0)+1);
			if(map1.equals(map2)) {
				cnt++;
			}
			map2.put(str1.charAt(lt), map2.get(str1.charAt(lt)) -1);
			if(map2.get(str1.charAt(lt))==0) {
				map2.remove(str1.charAt(lt));
			}
			lt++;
		}

		return Integer.toString(cnt);
		
	}
	

	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		Main T = new Main();
		
		String str1 = br.readLine();
		String str2 = br.readLine();
		
		System.out.println(T.solution(str1, str2));
	}

}



*/