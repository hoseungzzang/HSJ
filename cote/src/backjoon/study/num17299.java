package backjoon.study;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Stack;
import java.util.StringTokenizer;

public class num17299 {
	

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		int n = Integer.parseInt(br.readLine());
		Stack<Integer> main = new Stack<>();
		Stack<Integer> sub = new Stack<>();
		int [] answer = new int[n];
		//빈도 수를 저장하기 위한 map 선언
		Map<Integer,Integer> map = new HashMap<>();
		StringTokenizer str = new StringTokenizer(br.readLine());
		//이미 넣었던 수면 해당 수의 빈도수+1
		for(int i=0; i<n; i++) {
			int su = Integer.parseInt(str.nextToken());
			main.push(su);
			if(map.containsKey(su)) {
				map.put(su, map.get(su)+1); 
			}else {
				map.put(su,1);
			}
		}
		//맨 오른쪽은 오등큰수를 구할 수 없기에 sub stack에 추가해주고, 정답배열에 -1 추가
		int i =1;
		sub.push(main.pop());
		answer[0] = -1;
		//main이 빌때까지 반복
		while(!main.isEmpty()) {
			//main stack의 가장 위 값 num에 저장 후 제거
			int num = main.pop();
			//num의 빈도수와 sub stack의 가장 위의 값의 빈도 수 비교
				if(map.get(num)>=map.get(sub.peek())){
					//num의 빈도 수가 더 크다면 해당 수보다 더 큰 값을 찾기 위해 sub stack 탐색
					while(!sub.isEmpty()) {
						//더 큰 수를 찾았으면 정답에 해당 수 저장
						if(map.get(sub.peek())>map.get(num)) {
							answer[i] = sub.peek();
							break;
						}else {
							//작은 값이라면 제거
							sub.pop();
						}
					}
					//큰 값을 못찾았으면 -1 저장
					if(sub.isEmpty()) answer[i] = -1;
				}else {
					answer[i] = sub.peek();
				}
			sub.push(num);
			i++;
		}
		
		for(int j= answer.length-1; j>=0; j--) {
			bw.write(answer[j]+" ");
		}
		bw.flush();
	}
	
}




