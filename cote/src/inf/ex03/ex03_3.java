package inf.ex03;

public class ex03_3 {

}

/*


import java.io.BufferedReader;
import java.util.HashMap;import java.util.Map;import java.util.Map.Entry;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Stack;
import java.util.StringTokenizer;

public class Main {
	
	public 	ArrayList<Integer>  solution(int sell, int pri, int [] arr) {

		int cnt = 0;
		ArrayList<Integer> answer = new ArrayList<Integer>();
		Map<Integer,Integer> map = new HashMap<Integer,Integer>(); 
		for(int i=0; i<pri-1; i++) {
			map.put(arr[i], map.getOrDefault(arr[i],0)+1);
		}
		int lt=0;
		for(int i=pri-1; i<sell; i++) {
			map.put(arr[i], map.getOrDefault(arr[i],0)+1);
			answer.add(map.size());
			map.put(arr[lt], map.get(arr[lt])-1);
			if(map.get(arr[lt])==0) {
				map.remove(arr[lt]);
				
			}
			lt++;
		}
		return answer;
		
	}
	

	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		Main T = new Main();
		
		StringTokenizer st = new StringTokenizer(br.readLine());
		int sell = Integer.parseInt(st.nextToken());
		int pri = Integer.parseInt(st.nextToken());
		st = new StringTokenizer(br.readLine());
		int [] arr= new int[sell];
		for(int i=0; i<sell; i++) {
			arr[i] = Integer.parseInt(st.nextToken());
		}
		for(int x : T.solution(sell,pri,arr)) {
			System.out.print(x+" ");
		}
		//System.out.println(T.solution(sell,pri,arr));
	}

}




*/