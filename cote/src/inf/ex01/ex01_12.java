package inf.ex01;

public class ex01_12 {

}

/*

//for문을 두번돌려 앞뒤로 체크 후 작은값을 가진 배열의 수를 넣어주는 방법도 존제
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.Stack;

public class Main {
	
	public String solution(String str) {
		String answer = "";
		
		String [] arr = str.split(" ");
		for(int i=0; i<arr[0].length(); i++) {
			int plus = 1;
			int minus = 1;
			if(arr[0].charAt(i) == arr[1].charAt(0)) {
				answer+="0 ";
			}
			else {
				while(true) {
					if(i-minus>=0) {
						if(arr[0].charAt(i-minus) == arr[1].charAt(0)) {
							answer+=Integer.toString(minus)+" ";
							break;
						}else {
							minus++;
						}
					}
					
					if(i+plus<=arr[0].length()-1) {
						if(arr[0].charAt(i+plus) == arr[1].charAt(0)) {
							answer+=Integer.toString(plus)+" ";
							break;
						}else {
							plus++;
						}
					}
				}
				
			}
			
			
		}
		
		return answer;
		
	}
	

	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		Main T = new Main();
		String str = br.readLine();
		
		System.out.println(T.solution(str));
	}

}



*/