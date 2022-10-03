package backjoon.homework;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class num1644 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer str = new StringTokenizer(br.readLine());
		ArrayList<Integer> list = new ArrayList<>();
		//입력 값 저장
		int n = Integer.parseInt(str.nextToken());
		boolean prime [] = new boolean[n+1];
		prime[0] = prime[1] = true;
		for(int i = 2; i*i <=n; i++) {
			 if(!prime[i]){
	            	// prime[j] 소수가 아닌 표시
	            	for(int j=i*i; j<=n; j+=i) {
	            		prime[j] = true;                
	            	}
	            }     
		}
		for(int i=0; i<=n; i++) {
			if(!prime[i]) { list.add(i);}
		}
		int start = 0;
		int end = 0;
		int sum =0;
		int cnt=0;
		while(start<list.size()) {
			if(sum>=n) {
				if(sum==n) {
					cnt++;
				}
				sum-=list.get(start);
				start++;
				
			}else if(end<list.size()){
				sum+=list.get(end);
				end++;
			}else {
				break;
			}
		}
		System.out.println(cnt);
		
	}

}
