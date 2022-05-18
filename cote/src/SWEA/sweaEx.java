package SWEA;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Arrays;
import java.util.StringTokenizer;

public class sweaEx {
	public static void main(String[] args) throws NumberFormatException, IOException {
		

	}
	
	public static void ex1() throws IOException {
		//반올림 
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int T = Integer.parseInt(br.readLine());

		for (int i = 1; i <= T; i++) {
			int sum=0;
			StringTokenizer st = new StringTokenizer(br.readLine());
			for (int j = 0; j < 10; j++) {
				int num = Integer.parseInt(st.nextToken());
				
					sum+=num;
				

			}
			double calc = (double)sum/10;
			String a = String.format("%.0f", calc);
			bw.write("#"+i+" "+a+"\n");
		}
		bw.flush();

	
		
	}
	
	public static void ex2() throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		//최대값찾기
		int roop = Integer.parseInt(br.readLine());
		
		for(int i=1; i<=roop; i++) {
			int [] arr = new int[10];
			StringTokenizer str = new StringTokenizer(br.readLine());
			for(int j=0; j<10; j++) {
				arr[j]=Integer.parseInt(str.nextToken());
			}
			Arrays.sort(arr);
			bw.write("#"+i+" "+arr[9]+"\n");
			
		}
		bw.flush();
		
	
	}
	public static void ex3() throws IOException {
		//중간값찾기 전체수 /2
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int roop = Integer.parseInt(br.readLine());
		int [] arr = new int[roop];
		StringTokenizer str = new StringTokenizer(br.readLine());
		for(int i=0; i<roop; i++) {
			
		arr[i]=Integer.parseInt(str.nextToken());
		
			
		}
		Arrays.sort(arr);
		for(int i=0; i<roop; i++) {
			
			System.out.println(i +" 는 "+arr[i]);
				
			}
		bw.write(arr[99]+"\n");
		bw.flush();
		
	}
	
	public static void ex4() throws IOException {
		//자릿값 전부 더하기
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int roop = Integer.parseInt(br.readLine());
		char [] arr = Integer.toString(roop).toCharArray();
		int sum=0;
		for(int i=0; i<arr.length;i++) {
			sum += arr[i]-'0';
			
		}
		bw.write(sum+"\n");
		bw.flush();
		
	}
	
	public static void ex5() throws IOException {
		//조건부 연월일 출력
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int roop = Integer.parseInt(br.readLine());
		for(int i=1; i<=roop;i++) {
			String date = br.readLine();
			String [] arr =new String[3];
			arr[0] = date.substring(0, 4);//yyyy
			arr[1] = date.substring(4, 6);//mm
			arr[2] = date.substring(6, 8);//dd
			if(Integer.parseInt(arr[0])!=0 && (13>Integer.parseInt(arr[1])&&0<Integer.parseInt(arr[1]))&&
					(32>Integer.parseInt(arr[2])&&0<Integer.parseInt(arr[2]))) {
				if(Integer.parseInt(arr[1])==2) {
					if(Integer.parseInt(arr[2])>28) {
						bw.write("#"+i+" "+-1+"\n");
					}
					else bw.write("#"+i+" "+arr[0]+"/"+arr[1]+"/"+arr[2]+"\n");
				}
				else if(Integer.parseInt(arr[1])==4||Integer.parseInt(arr[1])==6||Integer.parseInt(arr[1])==9||Integer.parseInt(arr[1])==10) {
					if(Integer.parseInt(arr[2])>30) {
						bw.write("#"+i+" "+-1+"\n");
					}
					else bw.write("#"+i+" "+arr[0]+"/"+arr[1]+"/"+arr[2]+"\n");
				}
				else bw.write("#"+i+" "+arr[0]+"/"+arr[1]+"/"+arr[2]+"\n");
				
			}
			else bw.write("#"+i+" "+-1+"\n");
			
		}

		bw.flush();
		
	}
	
	public static void ex6() throws IOException {
		//인덱스 출력, 문자열 문자열 변환, charAt을 이용한 문자떄어내기
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		String str = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
		String [] arr = str.split("");
		
		String input = br.readLine();
	
		for(int i=0; i<input.length(); i++) {
		
			int index = Arrays.asList(arr).indexOf(String.valueOf(input.charAt(i)));
		
			bw.write((index+1)+" ");
		}
		
		

		bw.flush();
		
	}
	
	public static void ex7() throws IOException {
		//카운트하기
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		StringTokenizer str = new StringTokenizer(br.readLine());
		String [] arr = new String[2];
		arr[0]=str.nextToken();
		arr[1]=str.nextToken();
		int cnt=0;
		for(int i=Integer.parseInt(arr[1]); i<=Integer.parseInt(arr[0]); i++ ) {
			cnt++;
		}
		bw.write(cnt+"");
		
		bw.flush();
		
	}
	public static void ex8() throws IOException {
		//나눗몫과 나머지 구하기
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		
		
		int roop=Integer.parseInt(br.readLine());
		for(int i=1; i<=roop; i++ ) {
			StringTokenizer str = new StringTokenizer(br.readLine());
			int [] arr = new int[2];
			arr[0]=Integer.parseInt(str.nextToken());
			arr[1]=Integer.parseInt(str.nextToken());
			
			bw.write("#"+i+" "+(arr[0]/arr[1])+" "+(arr[0]%arr[1])+"\n");
			
			
		}
		
		
		bw.flush();
		
	}
	
	public static void ex9() throws IOException {
		//가위바위보
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		StringTokenizer str = new StringTokenizer(br.readLine());
		String a =str.nextToken();
		String b =str.nextToken();
		
		if((a.equals("1") && b.equals("3")) || (a.equals("2")&&b.equals("1")) || (a.equals("3")&&b.equals("2"))) {
			bw.write("A");
		}
		else bw.write("B");
		
		bw.flush();
	}
}
