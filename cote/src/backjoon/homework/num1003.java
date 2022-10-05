package backjoon.homework;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class num1003 {
	
	static Integer [][] dy =new Integer[41][2];
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		// 입력 값 저장
		int n = Integer.parseInt(br.readLine());
		dy[0][0] = 1;
		dy[0][1] = 0;
		dy[1][0] = 0;
		dy[1][1] = 1;
  
		 // 0 1 3
		for (int i = 0; i < n; i++) {
			// 0: 1 0 
			//1 : 0 1
			//3
			int N = Integer.parseInt(br.readLine());
			fibonacci(N);
			System.out.println(dy[N][0] +" "+dy[N][1]);

		}

	}

	public static Integer[] fibonacci(int n) {
		// 0 1
		if(dy[n][0] == null || dy[n][1] == null) {
			dy[n][0] = fibonacci(n-1)[0] +fibonacci(n-2)[0];
			dy[n][1] = fibonacci(n-1)[1] +fibonacci(n-2)[1];
		}
		
		return dy[n];
	}

}
