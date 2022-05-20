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
public class swea2lv {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	public static void test1() throws NumberFormatException, IOException {
		//369게임
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		int num = Integer.parseInt(br.readLine());

		for (int i = 1; i <= num; i++) {
			String answer = Integer.toString(i);
			if (answer.contains("3") || answer.contains("6") || answer.contains("9")) {
				answer=answer.replace("3", "-");
				answer=answer.replace("6", "-");
				answer=answer.replace("9", "-");
				
				answer=answer.replace("1", "");
				answer=answer.replace("2", "");
				answer=answer.replace("4", "");
				answer=answer.replace("5", "");
				answer=answer.replace("7", "");
				answer=answer.replace("8", "");
				answer=answer.replace("0", "");
				
				bw.write(answer+" ");
			}
			else bw.write(answer+" ");
		}

		bw.flush();
	}
	
	public static void test2() throws NumberFormatException, IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int roop = Integer.parseInt(br.readLine());
		
		
		for(int k=1; k<=roop; k++) {
		int cnt=1;
		String [] madi = br.readLine().split("");	
		String st1 = "";
		String st2 = "";
		for (int i = 1; i <30; i++) {
			if(madi[0].equals(madi[i])) {
				for(int j=0; j<cnt;j++) {
					st1+=madi[j];
					st2+=madi[j+cnt];
				}
				if(st1.equals(st2)) {
					bw.write("#"+k+" "+st1.length());
					break;
				}
				st1 ="";
				st2 = "";
			}
			cnt++;
		}
		bw.write("\n");
		}

		bw.flush();
	}
	public static void test3() throws NumberFormatException, IOException {
//수도요금계산
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		int roop = Integer.parseInt(br.readLine());

		for (int i = 1; i <= roop; i++) {
			StringTokenizer str = new StringTokenizer(br.readLine());
			// 리터당 9 20이해는 100 1리터당 3 10리터 사용
			int p = Integer.parseInt(str.nextToken());//A사 9
			int q = Integer.parseInt(str.nextToken());//100 기본료 
			int r = Integer.parseInt(str.nextToken());//20 기본 20리터
			int s = Integer.parseInt(str.nextToken());//초과 1리터당 3
			int w = Integer.parseInt(str.nextToken());//한달사용 10 
			int aCalc = p*w;
			int bCalc = 0;
			if(w<=r) {
				 bCalc= q;
			}
			else {
				 bCalc = ((w-r)*s)+q;
			}
			
			if(aCalc>bCalc) {
				bw.write("#"+i+" "+bCalc+"\n");
			}else bw.write("#"+i+" "+aCalc+"\n");
		}
		bw.flush();

	}
	public static void test4() throws NumberFormatException, IOException {
//돌던지기 0부터거리계산
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		int roop = Integer.parseInt(br.readLine());
		for(int i=1; i<=roop; i++ ) {
			int cnt=0;
			int num = Integer.parseInt(br.readLine());
			int [] arr = new int[num];
			StringTokenizer str = new StringTokenizer(br.readLine());
			for(int j=0; j<arr.length;j++) {
				arr[j]=Integer.parseInt(str.nextToken());
				if(arr[j]<0) {
					arr[j] = arr[j]*-1;
				}
			}
			Arrays.sort(arr);
			for(int j=0; j<arr.length;j++) {
				if(arr[0]==arr[j]) {
					cnt++;
				}
			}
			bw.write("#"+i+" "+arr[0]+" "+cnt+"\n");
		}
		
		bw.flush();

	}
	public static void test5() throws NumberFormatException, IOException {
		//불면증 양세기
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		int roop = Integer.parseInt(br.readLine());
		for(int i=1; i<=roop; i++) {
			int cnt=1;
			int num = Integer.parseInt(br.readLine());
			int num2 = 0;
			List<String> list = new ArrayList<String>(Arrays.asList("0","1","2","3","4","5","6","7","8","9"));
			while(list.size()!=0) {
			
				num2=num*cnt;
				String rem = Integer.toString(num2);
				for(int j=0; j<rem.length();j++) {
					
					list.remove(rem.substring(j,j+1));			
				}
				cnt++;
			}
			bw.write("#"+i+" "+num2+"\n");

		}
		
		bw.flush();

	}

	public static void test6() throws NumberFormatException, IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		int roop = Integer.parseInt(br.readLine());
		for(int i=1; i<=roop; i++) {
			int fSum=0;
			int lSum=0;
			StringTokenizer str= new StringTokenizer(br.readLine());
			int [] arr1 = new int[Integer.parseInt(str.nextToken())];
			int [] arr2 = new int[Integer.parseInt(str.nextToken())];
			StringTokenizer str1= new StringTokenizer(br.readLine());
			StringTokenizer str2= new StringTokenizer(br.readLine());
			for(int j=0; j<arr1.length;j++) {
				arr1[j]=Integer.parseInt(str1.nextToken());
			}
			for(int j=0; j<arr2.length;j++) {
				arr2[j]=Integer.parseInt(str2.nextToken());
			}
			if(arr1.length<arr2.length) {
				for(int j=0; j<arr1.length;j++) {
					fSum += (arr1[j]*arr2[j]);
				}
				for(int j=0; j<arr1.length;j++) {
					lSum += (arr1[j]*arr2[j+(arr2.length-arr1.length)]);
				}
				bw.write("#"+i+" "+Math.max(fSum, lSum)+"\n");
			}
			else if(arr1.length>arr2.length){
				for(int j=0; j<arr2.length;j++) {
					fSum += (arr1[j]*arr2[j]);
				}
				for(int j=0; j<arr2.length;j++) {
					lSum += (arr2[j]*arr1[j+(arr1.length-arr2.length)]);
				}
				bw.write("#"+i+" "+Math.max(fSum, lSum)+"\n");
			}
			else {
				for(int j=0; j<arr2.length;j++) {
					fSum += (arr1[j]*arr2[j]);
				}
				bw.write("#"+i+" "+fSum+"\n");
			}
		}
		
		
		bw.flush();

	}
}


