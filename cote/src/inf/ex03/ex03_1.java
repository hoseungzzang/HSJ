package inf.ex03;

public class ex03_1 {

}

/*


import java.io.BufferedReader;
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
	
	public String solution( int roop, String str) {
		String answer = "";
		Map<String, Integer> map = new HashMap<String,Integer>();
		map.put("A",0);
		map.put("B",0);
		map.put("C",0);
		map.put("D",0);
		map.put("E",0);
		int max=0;
		for(int i=0; i<roop; i++) {
			int num = map.get(Character.toString(str.charAt(i)))+1;
			map.put( Character.toString(str.charAt(i)), num);
			if(max < num) {
				max = num;
				answer = Character.toString(str.charAt(i));
			}
		}
		
		return answer;
		
	}
	

	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		Main T = new Main();
		
	
	

		int roop = Integer.parseInt(br.readLine());

		String str = br.readLine();
		System.out.println(T.solution(roop,str));
	}

}




*/