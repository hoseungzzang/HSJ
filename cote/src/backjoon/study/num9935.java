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
		Stack<Character> answer = new Stack<>();
		String an = "";
		for(int i=0; i<s.length(); i++) {
			if()
			for(int j=0;j<boom.length(); j++) {
				if(s.charAt(i)==boom.charAt(j)) {
					
				}
			}
		}
		
		if(answer.isEmpty()) {
			System.out.println("FRULA");
		}else {
			int k=0;
			while(k<answer.size()) {
				bw.write(answer.get(k)+"");
				k++;
			}
			
		}
		bw.flush();
	}
	
}




