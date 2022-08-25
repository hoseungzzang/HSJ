package inf.ex01;

public class ex01_2 {

}

/*import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {
	
	public String solution(String str) {

	String answer = "";
		for(int i=0; i<str.length(); i++) {
			int num = (int)str.charAt(i);
			if(num<90) {
				answer+= (char)(num+32);
			}else {
				answer+= (char)(num-32);
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

}*/