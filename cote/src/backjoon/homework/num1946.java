package backjoon.homework;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.StringTokenizer;

public class num1946 {
	

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		//총 테스트 수 입력
		int roop = Integer.parseInt(br.readLine());
		
		for(int i=0; i<roop; i++) {
			//1차 시험에 해당하는 2차시험의 점수를 알기 위한 맵 저장. 
			Map<Integer,Integer> map = new HashMap<Integer,Integer>();
			//합격자수 카운팅을 위한 변수 선언
			int cnt =0;
			//신입사원의 수 입력
			int num = Integer.parseInt(br.readLine());
			int [] arr= new int[num];
			//맵에 1차,2차시험 성적을 넣고, 배열에는 1차시험 성적의 오름차순 정렬을 위해 1차 시험성적만 따로 저장한다.
			for(int j=0; j<num; j++) {
				StringTokenizer str = new StringTokenizer(br.readLine());
				int su1 = Integer.parseInt(str.nextToken());
				int su2 = Integer.parseInt(str.nextToken());
				map.put(su1,su2);
				arr[j] = su1;
			}
			//오름차순 정렬
			Arrays.sort(arr);
			//현 2차시험 성적 기준을 구별하기 위한 변수 선언
			int val =Integer.MAX_VALUE;
			
			for(int j=0; j<arr.length; j++) {
				//현 기준이 비교하려는 사원의 시험성적보다 낮으면 현 기준을 비교중인 성적으로 변경 후 카운팅+1
				if(val>map.get(arr[j])) {
					val = map.get(arr[j]);
					cnt++;
				}
			}
			bw.write(cnt+"\n");
		}
		bw.flush();
	}
	
}




