package inf.ex02;

public class ex02_8 {

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
import java.util.Stack;
import java.util.StringTokenizer;

public class Main {
	
	public String solution( int [] arr1, int [] arr2) {
		String answer = "";
		int cnt = arr1.length;
		int [] result = new int[arr1.length+arr2.length];
		for(int i=0; i<arr1.length; i++) {
			result[i] = arr1[i];
		}
		for(int i= 0; i<arr2.length; i++) {
			result[cnt+i] = arr2[i];
		}
		Arrays.sort(result);
		
		for(int i=0; i<result.length; i++) {
			answer+= Integer.toString(result[i]);
			answer+= " ";
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