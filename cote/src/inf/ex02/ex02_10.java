package inf.ex02;

public class ex02_10 {

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
	
	public String solution( int [] arr1, int [] arr2) {
		String answer = "";
		Arrays.sort(arr1);
		Arrays.sort(arr2);
		for(int i=0; i<arr1.length; i++) {
			for(int j =0; j<arr2.length; j++) {
				if(arr1[i] == arr2[j]) {
					answer+= arr1[i]+" ";
					break;
				}
			}
		}
		
		
		return answer;
		
	}
	

	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		Main T = new Main();
		
	
		int roop1 = Integer.parseInt(br.readLine());
		StringTokenizer st = new StringTokenizer(br.readLine());
		int [] arr1 = new int [roop1];
		for(int i=0; i<roop1; i++) {
			arr1[i] = Integer.parseInt(st.nextToken());
		}
		int roop2 = Integer.parseInt(br.readLine());
		st = new StringTokenizer(br.readLine());
		int [] arr2 = new int [roop2];
		for(int i=0; i<roop2; i++) {
			arr2[i] = Integer.parseInt(st.nextToken());
		}
		System.out.println(T.solution(arr1, arr2));
	}

}




*/