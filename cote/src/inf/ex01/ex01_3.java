package inf.ex01;

public class ex01_3 {

}

/*import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {
	
	public String solution(String str) {

	String answer = "";
	String [] arr=  str.split(" ");
	int len = 0;
	for(int i=0; i<arr.length; i++) {
		if(len<arr[i].length()) {
			answer= arr[i];
			len = arr[i].length();
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