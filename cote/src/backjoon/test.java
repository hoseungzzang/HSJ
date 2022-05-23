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
//최빈수구하기
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		String [] score = new String[101];
		for(int i=0; i<=100; i++) {score[i] =Integer.toString(i);}
		
		int roop = Integer.parseInt(br.readLine());
		for (int i = 1; i <= roop; i++) {
			int _case = Integer.parseInt(br.readLine());
			int highscore=0;
			int cnt=0;
			int cnt2=0;
			StringTokenizer str = new StringTokenizer(br.readLine());
			int roop2= str.countTokens();
			String [] arr = new String[roop2];
			for(int j=0;j<roop2; j++) {
				arr[j]=str.nextToken();
			}
			
			for(int j=0; j<score.length; j++) {
				cnt=0;
				for(int k=0;k<roop2; k++) {
					if(score[j].equals(arr[k])) {
						cnt++;
					}
				}
				if(cnt2<=cnt) {//수 비교 안해도 됨
					highscore = j;
					cnt2=cnt;
				}
			}
			bw.write("#"+i+" "+highscore+"\n");
			
		}
		bw.flush();
	}
//10 8 7 2 2 4 8 8 8 9 5 5 3
	public static void test() {
		int a = 123;
		a = a % 10;
		a /= 1;
		System.out.println(a);
	}

}
