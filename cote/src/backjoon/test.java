package backjoon;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.SyncFailedException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.StringTokenizer;

public class test {

	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		int roop = Integer.parseInt(br.readLine());
		for (int i = 1; i <= roop; i++) {
			bw.write("#"+i+"\n");
			int N=0;
			int roop2 = Integer.parseInt(br.readLine());
			for(int j =0;j <roop2; j++) {
				for(int k=0; k<=j;k++) {
					if(k==0||k==j) {
						bw.write(1+" ");
					}
					else {
						bw.write(N+" ");
					}
					
				}
				N++;
				bw.write("\n");
			}
			

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
