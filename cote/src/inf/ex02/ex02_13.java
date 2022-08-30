package inf.ex02;

public class ex02_13 {

}

/*
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Stack;
import java.util.StringTokenizer;

public class Main {
	
	public String solution( int roop, int n, int [] arr) {
		String answer = "";
	
		int max=0;
		for(int i=0; i<roop; i++) {
			int su = n;
			int cnt = 0;
			for(int j=i;j<arr.length; j++) {
				if(arr[j]==1) {
					cnt++;
				}else if(su!=0 && arr[j]==0) {
					su --;
					cnt++;
				}else {
					break;
				}
			}
			max = Integer.max(max, cnt);
		}
		
		return Integer.toString(max);
		
	}
	

	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		Main T = new Main();
		
	
	
		StringTokenizer st = new StringTokenizer(br.readLine());
		int roop = Integer.parseInt(st.nextToken());
		int n =  Integer.parseInt(st.nextToken());
		int [] arr = new int [roop];
		st = new StringTokenizer(br.readLine());
		for(int i=0; i<roop; i++) {
	
			arr[i] = Integer.parseInt(st.nextToken());
		}

		System.out.println(T.solution(roop,n,arr));
	}

}




*/