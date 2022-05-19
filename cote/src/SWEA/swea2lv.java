package SWEA;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.SyncFailedException;
import java.util.Arrays;
import java.util.StringTokenizer;
public class swea2lv {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	public static void test1() throws NumberFormatException, IOException {
		//369∞‘¿”
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		int num = Integer.parseInt(br.readLine());

		for (int i = 1; i <= num; i++) {
			String answer = Integer.toString(i);
			if (answer.contains("3") || answer.contains("6") || answer.contains("9")) {
				answer=answer.replace("3", "-");
				answer=answer.replace("6", "-");
				answer=answer.replace("9", "-");
				
				answer=answer.replace("1", "");
				answer=answer.replace("2", "");
				answer=answer.replace("4", "");
				answer=answer.replace("5", "");
				answer=answer.replace("7", "");
				answer=answer.replace("8", "");
				answer=answer.replace("0", "");
				
				bw.write(answer+" ");
			}
			else bw.write(answer+" ");
		}

		bw.flush();
	}
	
	public static void test2() throws NumberFormatException, IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int roop = Integer.parseInt(br.readLine());
		
		
		for(int k=1; k<=roop; k++) {
		int cnt=1;
		String [] madi = br.readLine().split("");	
		String st1 = "";
		String st2 = "";
		for (int i = 1; i <30; i++) {
			if(madi[0].equals(madi[i])) {
				for(int j=0; j<cnt;j++) {
					st1+=madi[j];
					st2+=madi[j+cnt];
				}
				if(st1.equals(st2)) {
					bw.write("#"+k+" "+st1.length());
					break;
				}
				st1 ="";
				st2 = "";
			}
			cnt++;
		}
		bw.write("\n");
		}

		bw.flush();
	}

}
