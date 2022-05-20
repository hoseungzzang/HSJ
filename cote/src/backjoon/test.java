package backjoon;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.SyncFailedException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.StringTokenizer;

public class test {

	public static void main(String[] args) throws IOException {
		  Scanner sc = new Scanner(System.in);
	        int T = sc.nextInt();
	        for( int t=1; t<=T; t++) {
	            int n, m, i, k;
	            n = sc.nextInt();//5
	            m = sc.nextInt();//15
	            int a[] = new int[n];
	            int b[] = new int[m];
	            for( i=0; i<n; i++) a[i] = sc.nextInt();//5
	            for( i=0; i<m; i++) b[i] = sc.nextInt();//15
	            int sum, max = 0;
	            for( k=0; k<m-n+1; k++ ) {//11
	                sum = 0;
	                for( i=0; i<n; i++) sum += a[i] * b[i+k];//5
	                if( sum > max ) max = sum;
	            }
	            for( k=0; k<n-m+1; k++ ) {
	                sum = 0;
	                for( i=0; i<m; i++) sum += a[i+k] * b[i];
	                if( sum > max ) max = sum;
	            }
	            System.out.format("#%d %d\n", t, max );
	        }
		
		
	}
	
	
	public static void test() {
		int a = 123;
		a = a % 10;
		a /= 1;
		System.out.println(a);
	}

}
