package inf.ex02;

public class ex02_5 {

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

public class Main {
	
	public String solution( int roop , String [][] str) {
		String answer = "";
		int max = 0;
		for(int i=0; i<roop ; i++) {
			int [] sum = new int[4];
			for(int j=0; j<str[i].length; j++) {
				if(i==0) {
					sum[2] += Integer.parseInt(str[j][j]);
					sum[3] += Integer.parseInt(str[str[j].length-1-j][str[j].length-1-j]);
				}
				sum[0] += Integer.parseInt(str[i][j]);
				sum[1] += Integer.parseInt(str[j][i]);
				
			}
			Arrays.sort(sum);
			max = Integer.max(max, sum[3]);
			
			
			
		}
		
		return Integer.toString(max);
		
	}
	

	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		Main T = new Main();
		int roop = Integer.parseInt(br.readLine());
		String [][] str = new String[roop][roop]; 
		for(int i=0; i<roop; i++) {
			String st = br.readLine();
			str[i] = st.split(" ");
		}
		System.out.println(T.solution(roop,str));
	}

}





*/