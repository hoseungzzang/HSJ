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
		PriorityQueue<Integer> min = new PriorityQueue<>(Collections.reverseOrder());
		PriorityQueue<Integer> max = new PriorityQueue<>();
		for(int i=0; i<n; i++) {
				int num  = Integer.parseInt(br.readLine());
				if(max.size() != min.size()) {
					if(min.peek()>num) {
						max.offer(min.poll());
						min.offer(num);
					}else {
						max.offer(num);
					}
				}else {
					if(i==0) {
						min.offer(num);
					}else {
						if(max.peek()<num) {
							min.offer(max.poll());
							max.offer(num);
						}else {
							min.offer(num);
						}
					}
					
				}	
			bw.write(min.peek()+"\n");
		}
		bw.flush();
		
	}
	
}




