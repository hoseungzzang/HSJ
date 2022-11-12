package backjoon.study;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Stack;
import java.util.StringTokenizer;

public class num2493 {
	static class point{
		int num ;
		int index;
		point(int num, int index){
			this.num= num;
			this.index = index;
			
		}
	}
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		// 입력 값 저장
		int n = Integer.parseInt(br.readLine());
		point [] p = new point[n];
		StringTokenizer str = new StringTokenizer(br.readLine());
		Stack<point> main = new Stack<>();
		for(int i=0; i<n; i++) {
			int num = Integer.parseInt(str.nextToken());
			p[i] = new point(num,i+1);
			if(i==0) {
				bw.write("0 ");
				main.push(p[i]);
			}else {
				point p1 = main.peek();
				if(p1.num>p[i].num) {
					
				}
			}
		}

		bw.flush();
	}

}
