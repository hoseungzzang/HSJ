package backjoon.homework;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class num1654 {
	

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		StringTokenizer str = new StringTokenizer(br.readLine());
		int n = Integer.parseInt(str.nextToken());
		int m = Integer.parseInt(str.nextToken());
		
		int [] arr= new int[n];
		long rt =0;
		long lt = 0;
		for(int i=0; i<n; i++) {
			arr[i]  = Integer.parseInt(br.readLine());
			if(rt<arr[i]) {
				rt = arr[i];
			}
		}
		rt++;
		long middle = 0;
		while(lt<rt) {
			long num =0; 
			middle =  (lt+rt)/2;
			for(int i=0; i<n; i++) {
					num+=(arr[i]/middle);
			}
			if(num<m) {
				rt = middle;
			}else {
				lt = middle+1;
			}
		}
		System.out.println(lt-1);
	}
	
}




