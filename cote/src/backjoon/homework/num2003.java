package backjoon.homework;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class num2003 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		StringTokenizer str = new StringTokenizer(br.readLine());
		//입력 값 저장
		int n = Integer.parseInt(str.nextToken());
		int s = Integer.parseInt(str.nextToken());
		int[] arr = new int[n];
		str = new StringTokenizer(br.readLine());
		for (int i = 0; i < n; i++) {
			arr[i] = Integer.parseInt(str.nextToken());
		}
		
		int sum=0;
		int lp = 0;
		int rp = 0;
		int cnt=0;
		//lp가 모든 수를 탐색할 때까지 반복
		while (lp < n ) {
			//sum이 입력받은 값 이상이면
			if(sum>=s) {
				//sum이 입력받은 값과 같으면 카운트
				if(sum==s) {
					cnt++;
				}
				//sum에 기존 lp위치의 값을 빼주고 lp 증가
				sum-=arr[lp];
				lp++;
			}else if(rp<n){
				//sum 미만이라면 rp위치의 값 더해주고 rp 증가
				//else if 조건문을 건 이유는 rp가 끝까지 더해져도 sum이 입력받은 값 미만일 경우가 있기 때문
				sum+=arr[rp];
				rp++;
			}else {
				//현 lp 위치에서 모든 rp를 더해도 입력받은 값 미만이라면 반복할 이유가 없으므로 멈춤
				break;
			}
		}

		System.out.println(cnt);
		
		
	}

}
