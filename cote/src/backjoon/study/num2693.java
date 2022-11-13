package backjoon.study;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class num2693 {
	

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	
		//나무와 필요한 길이 입력
		int n = Integer.parseInt(br.readLine());
		for(int i=0; i<n; i++) {
			int [] arr = new int[10];
			StringTokenizer str = new StringTokenizer(br.readLine());
			for(int j=0;j<10;j++) {
				arr[j] = Integer.parseInt(str.nextToken());
			}
			Arrays.sort(arr);
			System.out.println(arr[7]);
		}
	}
	
}




