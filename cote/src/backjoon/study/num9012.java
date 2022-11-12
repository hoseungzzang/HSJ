package backjoon.study;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Stack;

public class num9012 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		// 입력 값 저장
		int n = Integer.parseInt(br.readLine());
	
		for(int i=0; i<n; i++) {
			Stack<String> stack = new Stack<>();
			String [] s = br.readLine().split("");
			boolean flag = false;
			for(int j=0;j<s.length;j++) {
				if(s[j].equals("(")) {
					stack.push(s[j]);
				}else {
					if(stack.isEmpty() || stack.peek().equals(")")) {
						flag=true;
						break;
					}else {
						stack.pop();
					}
				}
			}
			if(flag || !stack.isEmpty()) {
				bw.write("NO\n");
			}else {
				bw.write("YES\n");
			}
		}
		bw.flush();
	}

}
