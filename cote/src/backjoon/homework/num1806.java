package backjoon.homework;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class num1806 {

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
		
		//len의 경우 조건의 해당하는 수가 나올때 무조건 바뀌어야 하기에 가장 길게 설정
		int len = Integer.MAX_VALUE;
		int sum=0;
		int lp = 0;
		int rp = 0;
		int cnt=0;
		//lp가 입력받은 수열의 길이보다 작을 때 반복
		while (lp < n ) {
			//sum이 입력받은 값 이상이면
			if(sum>=s) {
				//min 함수로 현재 길이와, 저장된 길이를 비교 후 작은 값이 len에 저장됨
				len = Integer.min(cnt,len);
				//sum에 기존 lp위치의 값을 빼주고 lp 증가, 길이 감소
				sum-=arr[lp];
				lp++;
				cnt--;
			}else if(rp<n){
				//sum 미만이라면 rp위치의 값 더해주고 rp 증가, 길이 증가
				//else if 조건문을 건 이유는 rp가 끝까지 더해져도 sum이 입력받은 값 미만일 경우가 있기 때문
				sum+=arr[rp];
				cnt++;
				rp++;
			}else {
				//현 lp 위치에서 모든 rp를 더해도 입력받은 값 미만이라면 반복할 이유가 없으므로 멈춤
				break;
			}
		}
		//해당 되는 수열의 길이가 하나도 없을 경우 값은 max상태이므로 따로 조건처리
		if(len == Integer.MAX_VALUE) {
			System.out.println(0);
		}else {
			System.out.println(len);
		}
		
	}

}
