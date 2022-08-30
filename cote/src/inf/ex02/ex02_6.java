package inf.ex02;

public class ex02_6 {

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
	
	public String solution( int roop , int [][] str) {
		String answer = "";
		int cnt = 0;
		for(int i=1; i<=roop ; i++) {
			for(int j=1; j<=roop; j++) {
				if(str[i][j] > str[i][j-1] && str[i][j] > str[i-1][j] && str[i][j] > str[i][j+1] && str[i][j] > str[i+1][j]) {
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
		int roop = Integer.parseInt(br.readLine());
		int [][] str = new int[roop+2][roop+2]; 
		
		for(int i=1; i<=roop; i++) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			for(int j=1; j<=roop; j++) {
				str[i][j] = Integer.parseInt(st.nextToken());
			}
		}
		System.out.println(T.solution(roop,str));
	}

}





*/