package backjoon.study;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class num9461 {
	static long [] dy;
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		// 입력 값 저장
		int n = Integer.parseInt(br.readLine());
		dy = new long[1000003];
		dy[1] = 1;
		dy[2] = 2;
		
		System.out.println((tile(n)%15746));

	}
	public static long tile(int n) {
		if(dy[n]==0) {
			dy[n] = (long)(tile(n-1) + tile(n-2))%15746;
		}
		return dy[n];
	}

}
