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
		
		int num = Integer.parseInt(br.readLine());
		
		for(int i=num; i>=0; i--) {
			bw.write(i+" ");
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
