package backjoon.homework;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class num2805 {
	

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer str = new StringTokenizer(br.readLine());
		//나무와 필요한 길이 입력
		int n = Integer.parseInt(str.nextToken());
		int m = Integer.parseInt(str.nextToken());
		int [] arr= new int[n];
		//max, min 입력
		int max =0;
		int min = 0;
		str = new StringTokenizer(br.readLine());
		for(int i=0; i<n; i++) {
			arr[i]  = Integer.parseInt(str.nextToken());
			//가장 큰 수가 max가 된다.
			if(max<arr[i]) {
				max = arr[i];
			}
		}
		//중간값 선언
		int middle = 0;
		//min<max면 돌린다.
		while(min<max) {
			//높이의 길이가 int형의 범위를 넘을 수 있기에 long으로 선언
			long num =0; 
			//중간값 계산
			middle =  (min+max)/2;
			//양수 일 경우만 num에 합쳐준다.
			for(int i=0; i<n; i++) {
				if(arr[i]-middle>0) {
					num+=(arr[i]-middle);
				}
			}
			//필요한 길이보다 적을 시 max 이상으로 탐색할 필요 없기 때문에 max를 중간값으로 변경
			//그 외엔 최소값에 중간값+1 부터 탐색
			if(num<m) {
				max = middle;
			}else {
				min = middle+1;
			}
		}
		//마지막에 수를 구한 후 min+middle+1이 항상 성립하여 출력할 땐 -1을 해준다.
		System.out.println(min-1);
	}
	
}




