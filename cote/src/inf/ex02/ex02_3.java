package inf.ex02;

public class ex02_3 {

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
	
	public String solution( int roop) {
		String answer = "1 1 ";
		int [] arr = new int[roop];
		arr[0] =1;
		arr[1] = 1;	
		
		for(int i=2; i<roop; i++) {
			arr[i] = arr[i-2] + arr[i-1];
			answer += Integer.toString(arr[i-2] + arr[i-1]);
			answer+=" ";
		}
		
		return answer;
		
	}
	

	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		Main T = new Main();
		int roop = Integer.parseInt(br.readLine());
		System.out.println(T.solution(roop));
	}

}





*/