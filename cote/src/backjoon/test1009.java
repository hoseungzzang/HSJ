package backjoon;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

import java.util.StringTokenizer;

public class test1009 {

	public static void main(String[] args) throws IOException {

		// sum();

		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		int resultNum = Integer.parseInt(bf.readLine());
		int result = 0;
		for (int k = 0; k < resultNum; k++) {// 5번돌린다
			StringTokenizer str2 = new StringTokenizer(bf.readLine());// 자를문자
			int arr2[] = new int[str2.countTokens()];// 2개
			arr2[0] = Integer.parseInt(str2.nextToken());
			arr2[1] = Integer.parseInt(str2.nextToken());

			result = 1;
			for (int j = 0; j < arr2[1]; j++) {
				result = result * arr2[0] % 10;
			}
			System.out.println(result);
			if(result==0) {
				result=10;
			}
			bw.write(result + "\n");

		}

		bw.flush();
		bf.close();
		bw.flush();
	}

	public static void sum() {
		double result = Math.pow(7, 100);
		System.out.println(result);
	}

}
