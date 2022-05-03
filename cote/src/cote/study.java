package cote;

import java.util.Scanner;
import java.util.Arrays;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class study {

	public static void main(String[] args) throws  IOException {
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		int cnt = Integer.parseInt(bf.readLine());
		int[] arr2 = new int[cnt];
		for (int i = 0; i < cnt; i++) {
			int cnt2 = Integer.parseInt(bf.readLine());
			arr2[i] = cnt2;

			if ((i + 1) % 2 != 0) {
				Arrays.sort(arr2, 0, i + 1);
				bw.write(arr2[(i / 2)] + "\n");

			} else if ((i + 1) % 2 == 0) {
				Arrays.sort(arr2, 0, i + 1);// 15
				bw.write(arr2[(i / 2)] + "\n");
			}

		}
		bw.flush();
		bw.close();
		bf.close();
	}

}
