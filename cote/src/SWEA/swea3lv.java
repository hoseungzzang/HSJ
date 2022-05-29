package SWEA;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.SyncFailedException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.StringTokenizer;
public class swea3lv {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	public static void ex2() throws IOException {
		//아파트 조망권 swea3래밸
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		
		for(int m=1; m<=10;m++) {
			bw.write("#"+m+" ");
			int num = Integer.parseInt(br.readLine());
			int [] arr = new int[num];
			StringTokenizer str = new StringTokenizer(br.readLine());
			for(int i=0; i<num; i++) {
				arr[i] = Integer.parseInt(str.nextToken());
			}
			int sum =0;
			for(int i=2; i<num-2; i++) {
				int max = 0;
				for(int j=i-2; j<=i+2;j++) {
					if(i==j) {
						continue;
					}
					else {
						if(max<arr[j]) {
							max=arr[j];
						}
					}
				}
				if(arr[i]>max) {
					sum+=arr[i]-max;
				}
			}
			bw.write(sum+" \n");
		}
		bw.flush();
	}

	public static void ex3() throws IOException {
		//상자높이맞추기
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		
		for(int m=1; m<=10;m++) {
			bw.write("#"+m+" ");
			int num = Integer.parseInt(br.readLine());
			int [] arr = new int[100];
			int max=0;
			int min = 100;
			int maxIndex=0;
			int minIndex=0;
			StringTokenizer str = new StringTokenizer(br.readLine());
			for(int i=0; i<100; i++) {
				arr[i] = Integer.parseInt(str.nextToken());
			}
			while(true) {
			max=0;
			min=100;
				for(int i=0; i<100; i++) {
					if(arr[i]>max) {
						max=arr[i];
						maxIndex=i;
					}
					if(arr[i]<min) {
						min = arr[i];
						minIndex=i;
					}
				}
				arr[maxIndex]-=1;
				arr[minIndex]+=1;
				num--;
				if(num==0 || max-min<2) {
					break;
				}
			}
			max=0;
			min=100;
			for(int i=0; i<100; i++) {
				if(arr[i]>max) {
					max=arr[i];
					maxIndex=i;
				}
				if(arr[i]<min) {
					min = arr[i];
					minIndex=i;
				}
			}
			int sum=max-min;
			bw.write(sum+"\n");
			
		}
		bw.flush();
	}

	public static void ex4() throws IOException {
		//최대성적표만들기
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		
		int roop = Integer.parseInt(br.readLine());
		for(int i=1; i<=roop; i++) {
			StringTokenizer str = new StringTokenizer(br.readLine());
			int tCase = Integer.parseInt(str.nextToken());
			int limit = Integer.parseInt(str.nextToken());
			int [] arr = new int[tCase];
			str = new StringTokenizer(br.readLine());
			for(int j=0; j<tCase;j++) {
				arr[j] = Integer.parseInt(str.nextToken());
			}
			Arrays.sort(arr);
			int sum=0;
			for(int j=0; j<limit;j++) {
				sum+=arr[tCase-1-j];
			}
			bw.write("#"+i+" "+sum+"\n");
		}
		bw.flush();
	}
	public static void ex5() throws IOException {
		//최대값구하기
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		
		for(int i=1; i<=10; i++) {
			int tCase = Integer.parseInt(br.readLine());
			int max = 0;
			
			int [][] arr=  new int[100][100];
			for(int j=0; j<100; j++) {
				StringTokenizer str = new StringTokenizer(br.readLine());
				int roop = str.countTokens();
				
				for(int k=0;k<roop;k++) {
					arr[j][k] = Integer.parseInt(str.nextToken());
				}
				
			}
			//가로
			for(int j=0; j<100; j++) {
				int sum=0;
				for(int k=0;k<100;k++) {
					sum+=arr[j][k];
				}
				if(sum>max) {
					max=sum;
				}
			}
			for(int j=0; j<100; j++) {
				int sum=0;
				for(int k=0;k<100;k++) {
					sum+=arr[k][j];
				}
				if(sum>max) {
					max=sum;
				}
			}
			
			for(int j=0; j<100; j++) {
				int sum=0;
				sum+=arr[j][j];
				if(sum>max) {
					max=sum;
				}
			}
			
			for(int j=0; j<100; j++) {
				int sum=0;
				sum+=arr[99-j][j];
				if(sum>max) {
					max=sum;
				}
			}
			bw.write("#"+tCase+" "+max+"\n");
			
		}
		bw.flush();
		
	}
}
