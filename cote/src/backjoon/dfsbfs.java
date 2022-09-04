package backjoon;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class dfsbfs {

	static int N;
	static int M;
	static int start;
	static Boolean [][] arr ;
	
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		StringTokenizer str = new StringTokenizer(br.readLine());
		 N = Integer.parseInt(str.nextToken());
		 M = Integer.parseInt(str.nextToken());
		 start = Integer.parseInt(str.nextToken());
		 arr = new Boolean[N+1][N+1];
		for(int i=0; i<M; i++) {
			 str = new StringTokenizer(br.readLine());
		 int num1 = Integer.parseInt(str.nextToken());
			 int num2 = Integer.parseInt(str.nextToken());
			arr[num1][num2] = true;
		}
		int cnt=0;
		DFS(start,cnt);
	}

	public static  void DFS( int start,int cnt) {
		if(cnt>N) {
			return;
		}else {
			System.out.println(start + " ");
			for(int i=1; i<M; i++) {
				if(arr[start][i]!=null) {
					arr[start][i] = null;
					start = i;
					DFS(start, cnt+1);
				}
				
			}
		}
	}
}
