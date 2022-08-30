package inf.ex02;

public class ex02_1 {

}

/*


import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.Stack;

public class Main {
	
	public String solution(String str, int roop) {
		String answer = "";
		String [] arr= str.split(" ");
		int cnt=1;
		int tall = Integer.parseInt(arr[0]);
		for(int i=1; i<arr.length; i++) {
			int k = Integer.parseInt(arr[i]);
			if( k>tall) {
				tall = k;
				cnt++;
			}
		}
		
		return Integer.toString(cnt);
		
	}
	

	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		Main T = new Main();
		int roop = Integer.parseInt(br.readLine());
		String str = br.readLine();
		
		System.out.println(T.solution(str,roop));
	}

}



*/