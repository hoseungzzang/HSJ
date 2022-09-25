package backjoon.study;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Collections;
import java.util.PriorityQueue;


public class num1655 {
	

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		int n = Integer.parseInt(br.readLine());
		PriorityQueue<Integer> min = new PriorityQueue<>();
		
		PriorityQueue<Integer> max = new PriorityQueue<>(Collections.reverseOrder());
		for(int i=0; i<n; i++) {
			int num = Integer.parseInt(br.readLine());
			int calc = i/2;
			min.offer(num);
			max.offer(num);
			PriorityQueue<Integer> minCalc = new PriorityQueue<>(min);
			PriorityQueue<Integer> maxCalc = new PriorityQueue<>(max);
				for(int j=0; j<calc; j++) {
					minCalc.poll();
					maxCalc.poll();
				}
				bw.write(Integer.min(minCalc.peek(), maxCalc.peek())+"\n");
		}
		bw.flush();
		
	}
	
}




