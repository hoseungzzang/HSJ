package backjoon.homework;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class num1149 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		// 입력 값 저장
		int n = Integer.parseInt(br.readLine());
		 int [][] arr = new int[n][3];
		for (int i = 0; i < n; i++) {
			StringTokenizer str = new StringTokenizer(br.readLine());
			arr[i][0]= Integer.parseInt(str.nextToken());
			arr[i][1]= Integer.parseInt(str.nextToken());
			arr[i][2]= Integer.parseInt(str.nextToken());
		}
		//R : 26 , G : 40 , B : 83
		//R: 49 , G: 60 , B : 57
		//R: 13 , G: 89, B : 99
		
		//R : 26 , G : 40 , B : 83
		//R: 89 , G: 89 , B : 83
		//R: 96 , G: 172, B : 187
		for(int i=1; i<n; i++) {
			arr[i][0] = arr[i][0] + Math.min(arr[i-1][1],arr[i-1][2] );  
			arr[i][1] = arr[i][1] + Math.min(arr[i-1][0],arr[i-1][2] );  
			arr[i][2] = arr[i][2] + Math.min(arr[i-1][0],arr[i-1][1] );  
		}
		
		System.out.println(Math.min(arr[n-1][0],Math.min(arr[n-1][1],arr[n-1][2])));

	}

}
