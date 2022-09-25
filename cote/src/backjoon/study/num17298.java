package backjoon.study;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;
import java.util.StringTokenizer;

public class num17298 {
	

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		int n = Integer.parseInt(br.readLine());
		Stack<Integer> main = new Stack<>();
		Stack<Integer> sub = new Stack<>();
		int [] answer = new int[n];
		StringTokenizer str = new StringTokenizer(br.readLine());
		for(int i=0; i<n; i++) {
			main.push(Integer.parseInt(str.nextToken()));
		}
		int i =1;
		sub.push(main.pop());
		answer[0] = -1;
		while(!main.isEmpty()) {
			int num = main.pop();
				if(num>=sub.peek()){
					while(!sub.isEmpty()) {
						if(sub.peek()>num) {
							answer[i] = sub.peek();
							sub.push(num);
							break;
						}else {
							sub.pop();
						}
					}
					if(sub.isEmpty()) answer[i] = -1;
				}else {
					answer[i] = sub.peek();
				}
			sub.push(num);
			i++;
		}
		
		for(int j= answer.length-1; j>=0; j--) {
			bw.write(answer[j]+" ");
		}
		bw.flush();
	}
	
}




