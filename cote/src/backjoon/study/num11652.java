package backjoon.study;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Collections;
import java.util.HashMap;
import java.util.PriorityQueue;

public class num11652 {
	

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		HashMap<Long,Long> map = new HashMap<>();
		
		int n = Integer.parseInt(br.readLine());
		long answer = Long.MAX_VALUE;
		long size=Long.MIN_VALUE;
		for(int i=0; i<n; i++) {
			long num = Long.parseLong(br.readLine());
				map.put(num, map.getOrDefault(num, (long) 0)+1);
				if(size<map.get(num)) {
					answer = num;
					size = map.get(num);
				}else if (size == map.get(num) && num<answer) {
					answer = num;
					size = map.get(num);
				}
			}	
		System.out.println(answer);
		}

}
