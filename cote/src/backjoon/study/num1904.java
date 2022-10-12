package backjoon.study;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class num1904 {
	static long [] dy;
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		// 입력 값 저장
		int n = Integer.parseInt(br.readLine());
		dy = new long[102];
		dy[1] = 1;
		dy[2] = 1;
		dy[3]=1;
		for(int i=0; i<n; i++) {
			System.out.println(tile(Integer.parseInt(br.readLine())));
		}


	}
	public static long tile(int n) {
		if(dy[n]==0) {
			dy[n] = (long)tile(n-3) + tile(n-2);
		}
		return dy[n];
	}
}
