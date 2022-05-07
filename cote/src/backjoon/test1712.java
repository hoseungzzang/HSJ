package backjoon;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class test1712 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringTokenizer str = new StringTokenizer(bf.readLine());// 자를문자
		long arr[] = new long[str.countTokens()];// 3개
		long cnt=1;
		arr[0] = Long.parseLong(str.nextToken());
		arr[1] = Long.parseLong(str.nextToken());
		arr[2] = Long.parseLong(str.nextToken());
		System.out.println(arr[0]+" "+arr[1]+" "+ arr[2]);
		if(arr[1]>arr[2]){
			bw.write(-1+"\n");
		}
		else {
			while((arr[0]+(arr[1]*cnt))>=(arr[2]*cnt)) {
				cnt++;
			}
			bw.write(cnt+"\n");
		}
		
		bw.flush();
		bw.close();
		bf.close();
	}

}
