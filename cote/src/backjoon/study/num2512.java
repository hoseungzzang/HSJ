package backjoon.study;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class num2512 {
	

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		int n = Integer.parseInt(br.readLine());
		int [] arr= new int[n];
		int lt = 0;
		int rt = 0;
		int sum = 0;
		StringTokenizer str = new StringTokenizer(br.readLine());
		for(int i=0; i<n; i++) {
			arr[i]  = Integer.parseInt(str.nextToken());
			if(rt<arr[i]) rt = arr[i];
			
			sum+=arr[i];
		}
		int max =Integer.parseInt(br.readLine());
		if(sum<max) {
			lt = rt;
			System.out.println(lt);
		}else {
			int middle = 0;
			while(lt<rt) {
				long num =0; 
				middle =  (lt+rt)/2;
				for(int i=0; i<n; i++) {
					if(arr[i]<middle) {
						num+=arr[i];
					}
					else {
						num+=middle;
					}
				}
				if(num<max) {
					lt = middle+1;
				}else {
					rt = middle-1;
				}
			}
			System.out.println(lt-1);
		}
	
		
	}
	
}




