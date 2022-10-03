package backjoon.study;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.Map;
import java.util.Queue;
import java.util.Stack;
import java.util.StringTokenizer;

public class num9935 {
	

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		String s = br.readLine();
		String boom = br.readLine();
		Map<String,Integer> map = new HashMap<>();
		for(int i=0; i<boom.length(); i++) {
			map.put(Character.toString(boom.charAt(i)),i);
		}
		Stack<String> main = new Stack<>();
		Stack<Integer> sub = new Stack<>();
		String answer = "";
		for(int i=0; i<s.length(); i++) {
			String st = Character.toString(s.charAt(i));
			main.push(st);
			if(map.containsKey(st)) {
				if(sub.isEmpty() && map.get(st)==0) {
					sub.push(map.get(st));
				}else if(!sub.isEmpty()) {
					if(sub.peek()+1 < map.get(st)) {
						sub.clear();
					}else {
						sub.push(map.get(st));
						if(sub.peek()+1 == boom.length()) {
							for(int j=0; j<boom.length(); j++) {
								sub.pop();
								main.pop();
							}
						}
					}
				
				}
			}
			
			
		}
		if(main.isEmpty()) {
			System.out.println("FRULA");
		}else {
				String [] arr = new String[main.size()];
				arr = main.toArray(arr);
				for(int i=0; i<arr.length; i++) {
					System.out.print(arr[i]); 
				}
		}
	}
	
}




