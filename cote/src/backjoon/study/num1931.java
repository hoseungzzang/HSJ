package backjoon.study;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Comparator;
import java.util.StringTokenizer;

public class num1931 {
	

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		//회의의 수와 시간 입력
		int n = Integer.parseInt(br.readLine());
		int [][] arr= new int[n][2];

	
		for(int i=0; i<n; i++) {
			StringTokenizer str = new StringTokenizer(br.readLine());
			arr[i][0]  = Integer.parseInt(str.nextToken());
			arr[i][1]  = Integer.parseInt(str.nextToken());
		}
		//중복 수가 들어올 수 있으므로 종료 시간이 같을 경우 시작 시간을 기준으로 오름차순 정렬
		Arrays.sort(arr, new Comparator<int[]>() {
			@Override
			public int compare(int[] o1, int[] o2) {
				if(o1[1] == o2[1]) {
					return o1[0] - o2[0];
				}else {
					return o1[1] - o2[1];
				}
			}
		});
		
		int cnt =0;
		int max = Integer.MIN_VALUE;
		//현재 종료 시간으로 들어와 있는 값보다 현재 비교하려는 시작 시간의 값이 크거나 같을 경우 
		//카운팅 해주고, 현재 종료 시간으로 바꿔준다.
		for(int i=0; i<n; i++) {
			int num = arr[i][0];
			if(num>=max) {
				max = arr[i][1];
				cnt++;
			}
		}
		System.out.println(cnt);
		
	}
	
}




