package backjoon;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class returnPrac {

	static boolean [] check ;
	static int [] node;
	static String [][] move;
	
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int N = Integer.parseInt(br.readLine());
		node = new int[N+1];
		move = new String[N+1][N+1];
	
		for(int i=1; i<move.length; i++) {
			StringTokenizer str = new StringTokenizer(br.readLine());
			int num = str.countTokens();
			for(int j=0;j<num;j++) {
				move[i][j] = str.nextToken();
			}
		}
		
		dfs(N,"A");
	}
	
	public static void dfs(int n, String start) {
		check[start] = true;
		System.out.println();
		for(int i=1; i<=n;i++) {
			for(int j=1; j<=move[start].length;j++) {
				
			}
		}
	}
}
