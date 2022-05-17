package SWEA;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class sweaEx {
	public static void main(String[] args) throws NumberFormatException, IOException {
		

	}
	
	public static void ex1() throws IOException {
		//¹Ý¿Ã¸² 
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int T = Integer.parseInt(br.readLine());

		for (int i = 1; i <= T; i++) {
			int sum=0;
			StringTokenizer st = new StringTokenizer(br.readLine());
			for (int j = 0; j < 10; j++) {
				int num = Integer.parseInt(st.nextToken());
				
					sum+=num;
				

			}
			double calc = (double)sum/10;
			String a = String.format("%.0f", calc);
			bw.write("#"+i+" "+a+"\n");
		}
		bw.flush();

	
		
	}

}
