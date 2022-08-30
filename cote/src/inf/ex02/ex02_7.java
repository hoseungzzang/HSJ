package inf.ex02;

public class ex02_7 {

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
	
	public String solution( int student , int test , int [][] str) {
		String answer = "";
		int cnt =0;
		for(int i=0; i<student; i++) {
			int [] arr = new int[student+1];
			//5 생김
			for(int j=0; j<test; j++) {
				for(int l = 0; l<=student; l++) {
					if(str[j][l] == (i+1)) {
						//0 3 4 1 2 1
						for(int k= l+1; k<=student; k++) {
							arr[str[j][k]]++;
						}
						
						break;
					}
				}
				
			}
			for(int j=0; j<arr.length; j++) {
				if(arr[j] == test) {
					cnt++;
				}
			}
		}
		return Integer.toString(cnt);
		
	}
	

	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		Main T = new Main();
		
		StringTokenizer st = new StringTokenizer(br.readLine());
		int student = Integer.parseInt(st.nextToken());
		int test = Integer.parseInt(st.nextToken());
		int [][] str = new int[test][student+1]; 
		
		for(int i=0; i<test; i++) {
			 st = new StringTokenizer(br.readLine());
			for(int j=1; j<=student; j++) {
				str[i][j] = Integer.parseInt(st.nextToken());
			}
		}
		System.out.println(T.solution(student,test,str));
	}

}




*/