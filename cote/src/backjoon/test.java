package backjoon;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.SyncFailedException;
import java.util.Arrays;
import java.util.StringTokenizer;

public class test {

	public static void main(String[] args) throws IOException {

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

	public static void test() {
		int a = 123;
		a = a % 10;
		a /= 1;
		System.out.println(a);
	}

}
