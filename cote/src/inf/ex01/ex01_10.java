package inf.ex01;

public class ex01_10 {

}

/*


import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;

public class Main {
	
	public String solution(String str,int roop) {
		
		String answer = "";
		str = str.replaceAll("#", "1");
		str = str.replaceAll("\\*", "0");
		for(int i=0; i<roop; i++) {
			char c = (char) Integer.parseInt(str.substring(0+(i*7),7+(i*7)),2);
			answer+= Character.toString(c);
			
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