package inf.ex02;

public class ex02_2 {

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
		for(int i=0; i<arr.length; i++) {
			if(i==0) {
				answer+= arr[i]+" ";
			}
			else {
				if(Integer.parseInt(arr[i]) > Integer.parseInt(arr[i-1])) {
					answer+= arr[i]+" ";
				}
			}
		}
		
		return answer;
		
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