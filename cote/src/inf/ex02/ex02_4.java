package inf.ex02;

public class ex02_4 {

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
	
	public String solution( int roop , String str) {
		String answer = "";
		String [] arr = str.split(" ");
		int sum = 0;
		int plus=0;
		
		for(int i=0; i<roop; i++) {
			if(arr[i].equals("1")) {
				sum+=plus+1;
				plus++;
			}else {
				plus=0;
			}
		}
		
		return Integer.toString(sum);
		
	}
	

	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		Main T = new Main();
		int roop = Integer.parseInt(br.readLine());
		String str = br.readLine();
		
		System.out.println(T.solution(roop,str));
	}

}





*/