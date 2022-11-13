package backjoon.study;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class num2581 {
	

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int a = Integer.parseInt(br.readLine());
		int b=  Integer.parseInt(br.readLine());
		boolean [] prime = new boolean[10001];
		prime[0] = prime[1] = true;
		 for(int i=2; i*i<10001; i++){
	        	// prime[i]가 소수라면
	            if(!prime[i]){
	            	// prime[j] 소수가 아닌 표시
	            	for(int j=i*i; j<10001; j+=i) prime[j] = true;                
	            }        
	        }    
		 int sum = 0;
		 int min = 0;
		 for(int i=a; i<=b; i++) {
			 if(!prime[i]) {
				 if(min==0) {
					 min = i;
				 }
				 sum+=i;
			 }
		 }
		 if(sum!=0) {
			 System.out.println(sum+"\n"+min);
		 }else {
			 System.out.println(-1);
		 }
		
	}
	
}




