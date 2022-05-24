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
		// 369����
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		int num = Integer.parseInt(br.readLine());

		for (int i = 1; i <= num; i++) {
			String answer = Integer.toString(i);
			if (answer.contains("3") || answer.contains("6") || answer.contains("9")) {
				answer = answer.replace("3", "-");
				answer = answer.replace("6", "-");
				answer = answer.replace("9", "-");

				answer = answer.replace("1", "");
				answer = answer.replace("2", "");
				answer = answer.replace("4", "");
				answer = answer.replace("5", "");
				answer = answer.replace("7", "");
				answer = answer.replace("8", "");
				answer = answer.replace("0", "");

				bw.write(answer + " ");
			} else
				bw.write(answer + " ");
		}

		bw.flush();
	}

	public static void test2() throws NumberFormatException, IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		int roop = Integer.parseInt(br.readLine());

		for (int k = 1; k <= roop; k++) {
			int cnt = 1;
			String[] madi = br.readLine().split("");
			String st1 = "";
			String st2 = "";
			for (int i = 1; i < 30; i++) {
				if (madi[0].equals(madi[i])) {
					for (int j = 0; j < cnt; j++) {
						st1 += madi[j];
						st2 += madi[j + cnt];
					}
					if (st1.equals(st2)) {
						bw.write("#" + k + " " + st1.length());
						break;
					}
					st1 = "";
					st2 = "";
				}
				cnt++;
			}
			bw.write("\n");
		}

		bw.flush();
	}

	public static void test3() throws NumberFormatException, IOException {
//������ݰ��
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		int roop = Integer.parseInt(br.readLine());

		for (int i = 1; i <= roop; i++) {
			StringTokenizer str = new StringTokenizer(br.readLine());
			// ���ʹ� 9 20���ش� 100 1���ʹ� 3 10���� ���
			int p = Integer.parseInt(str.nextToken());// A�� 9
			int q = Integer.parseInt(str.nextToken());// 100 �⺻��
			int r = Integer.parseInt(str.nextToken());// 20 �⺻ 20����
			int s = Integer.parseInt(str.nextToken());// �ʰ� 1���ʹ� 3
			int w = Integer.parseInt(str.nextToken());// �Ѵ޻�� 10
			int aCalc = p * w;
			int bCalc = 0;
			if (w <= r) {
				bCalc = q;
			} else {
				bCalc = ((w - r) * s) + q;
			}

			if (aCalc > bCalc) {
				bw.write("#" + i + " " + bCalc + "\n");
			} else
				bw.write("#" + i + " " + aCalc + "\n");
		}
		bw.flush();

	}

	public static void test4() throws NumberFormatException, IOException {
//�������� 0���ͰŸ����
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		int roop = Integer.parseInt(br.readLine());
		for (int i = 1; i <= roop; i++) {
			int cnt = 0;
			int num = Integer.parseInt(br.readLine());
			int[] arr = new int[num];
			StringTokenizer str = new StringTokenizer(br.readLine());
			for (int j = 0; j < arr.length; j++) {
				arr[j] = Integer.parseInt(str.nextToken());
				if (arr[j] < 0) {
					arr[j] = arr[j] * -1;
				}
			}
			Arrays.sort(arr);
			for (int j = 0; j < arr.length; j++) {
				if (arr[0] == arr[j]) {
					cnt++;
				}
			}
			bw.write("#" + i + " " + arr[0] + " " + cnt + "\n");
		}

		bw.flush();

	}

	public static void test5() throws NumberFormatException, IOException {
		// �Ҹ��� �缼��
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		int roop = Integer.parseInt(br.readLine());
		for (int i = 1; i <= roop; i++) {
			int cnt = 1;
			int num = Integer.parseInt(br.readLine());
			int num2 = 0;
			List<String> list = new ArrayList<String>(Arrays.asList("0", "1", "2", "3", "4", "5", "6", "7", "8", "9"));
			while (list.size() != 0) {

				num2 = num * cnt;
				String rem = Integer.toString(num2);
				for (int j = 0; j < rem.length(); j++) {

					list.remove(rem.substring(j, j + 1));
				}
				cnt++;
			}
			bw.write("#" + i + " " + num2 + "\n");

		}

		bw.flush();

	}

	public static void test6() throws NumberFormatException, IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		int roop = Integer.parseInt(br.readLine());
		for (int i = 1; i <= roop; i++) {
			int fSum = 0;
			int lSum = 0;
			StringTokenizer str = new StringTokenizer(br.readLine());
			int[] arr1 = new int[Integer.parseInt(str.nextToken())];
			int[] arr2 = new int[Integer.parseInt(str.nextToken())];
			StringTokenizer str1 = new StringTokenizer(br.readLine());
			StringTokenizer str2 = new StringTokenizer(br.readLine());
			for (int j = 0; j < arr1.length; j++) {
				arr1[j] = Integer.parseInt(str1.nextToken());
			}
			for (int j = 0; j < arr2.length; j++) {
				arr2[j] = Integer.parseInt(str2.nextToken());
			}
			if (arr1.length < arr2.length) {
				for (int j = 0; j < arr1.length; j++) {
					fSum += (arr1[j] * arr2[j]);
				}
				for (int j = 0; j < arr1.length; j++) {
					lSum += (arr1[j] * arr2[j + (arr2.length - arr1.length)]);
				}
				bw.write("#" + i + " " + Math.max(fSum, lSum) + "\n");
			} else if (arr1.length > arr2.length) {
				for (int j = 0; j < arr2.length; j++) {
					fSum += (arr1[j] * arr2[j]);
				}
				for (int j = 0; j < arr2.length; j++) {
					lSum += (arr2[j] * arr1[j + (arr1.length - arr2.length)]);
				}
				bw.write("#" + i + " " + Math.max(fSum, lSum) + "\n");
			} else {
				for (int j = 0; j < arr2.length; j++) {
					fSum += (arr1[j] * arr2[j]);
				}
				bw.write("#" + i + " " + fSum + "\n");
			}
		}

		bw.flush();

	}

	public static void test7() throws NumberFormatException, IOException {
		// �ּҰ� �ִ밪 ���� �� �ݿø�
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		int roop = Integer.parseInt(br.readLine());
		for (int i = 1; i <= roop; i++) {
			StringTokenizer str = new StringTokenizer(br.readLine());
			int[] arr = new int[str.countTokens()];
			int calc = 0;
			int cnt = str.countTokens();
			for (int j = 0; j < cnt; j++) {
				arr[j] = Integer.parseInt(str.nextToken());
			}
			Arrays.sort(arr);
			for (int j = 1; j < arr.length - 1; j++) {
				calc += arr[j];
			}
			bw.write("#" + i + " " + String.format("%.0f", (double) calc / 8) + "\n");
		}
		bw.flush();
	}

	public static void test8() throws NumberFormatException, IOException {
		// �������
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		String[] grade = { "A+", "A0", "A-", "B+", "B0", "B-", "C+", "C0", "C-", "D0" };
		int roop = Integer.parseInt(br.readLine());
		for (int i = 1; i <= roop; i++) {
			StringTokenizer str = new StringTokenizer(br.readLine());
			int stu = Integer.parseInt(str.nextToken());
			int find = Integer.parseInt(str.nextToken());
			double[] arr = new double[stu];
			for (int j = 0; j < stu; j++) {
				str = new StringTokenizer(br.readLine());
				arr[j] = Integer.parseInt(str.nextToken()) * 0.35 + Integer.parseInt(str.nextToken()) * 0.45
						+ Integer.parseInt(str.nextToken()) * 0.20;
			}
			double target = arr[find - 1];
			Arrays.sort(arr);
			int cnt = 0;
			for (int j = arr.length - 1; j >= 0; j--) {
				if (arr[j] == target) {
					bw.write("#" + i + " " + grade[cnt / (stu / 10)] + "\n");
					break;
				}
				cnt++;
			}

		}
		bw.flush();
	}

	public static void test9() throws NumberFormatException, IOException {
		// Ȧ¦����
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		String[] grade = { "A+", "A0", "A-", "B+", "B0", "B-", "C+", "C0", "C-", "D0" };
		int roop = Integer.parseInt(br.readLine());
		for (int i = 1; i <= roop; i++) {
			int calc = 0;
			int num = Integer.parseInt(br.readLine());
			for (int j = 1; j <= num; j++) {
				if (j % 2 == 0) {
					calc -= j;
				} else
					calc += j;
			}
			bw.write("#" + i + " " + calc + "\n");

		}
		bw.flush();
	}

	public static void test10() throws NumberFormatException, IOException {
//�յڱ���üũ
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		int roop = Integer.parseInt(br.readLine());
		for (int i = 1; i <= roop; i++) {
			String[] arr = br.readLine().split("");
			String a1 = "";
			String a2 = "";
			for (int j = 0; j < arr.length; j++) {
				a1 += arr[j];
			}
			for (int j = arr.length - 1; j >= 0; j--) {
				a2 += arr[j];
			}
			if (a1.equals(a2)) {
				bw.write("#" + i + " " + 1 + "\n");
			} else
				bw.write("#" + i + " " + 0 + "\n");

		}
		bw.flush();
	}

	public static void test11() throws NumberFormatException, IOException {
		// �Ľ�Į�ﰢ�� ���ϱ�. ���� �ϴ°� �ƴѰŰ����� ��·�� ����;;
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		int roop = Integer.parseInt(br.readLine());
		for (int i = 1; i <= roop; i++) {
			bw.write("#" + i + "\n");
			int N = 0;
			int roop2 = Integer.parseInt(br.readLine());
			for (int j = 0; j < roop2; j++) {
				for (int k = 0; k <= j; k++) {
					if (k == 0 || k == j) {
						bw.write(1 + " ");
					} else {
						bw.write(N + " ");
					}

				}
				N++;
				bw.write("\n");
			}

		}
		bw.flush();
	}
	public static void test12() throws NumberFormatException, IOException {
		//�ֺ�����ϱ�
				BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
				BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
				String [] score = new String[101];
				for(int i=0; i<=100; i++) {score[i] =Integer.toString(i);}
				
				int roop = Integer.parseInt(br.readLine());
				for (int i = 1; i <= roop; i++) {
					int _case = Integer.parseInt(br.readLine());
					int highscore=0;
					int cnt=0;
					int cnt2=0;
					StringTokenizer str = new StringTokenizer(br.readLine());
					int roop2= str.countTokens();
					String [] arr = new String[roop2];
					for(int j=0;j<roop2; j++) {
						arr[j]=str.nextToken();
					}
					
					for(int j=0; j<score.length; j++) {
						cnt=0;
						for(int k=0;k<roop2; k++) {
							if(score[j].equals(arr[k])) {
								cnt++;
							}
						}
						if(cnt2<=cnt) {//�� �� ���ص� ��
							highscore = j;
							cnt2=cnt;
						}
					}
					bw.write("#"+i+" "+highscore+"\n");
					
				}
				bw.flush();
			}
	
	public static void test13() throws NumberFormatException, IOException {
		//�鸸����������Ʈ
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int roop = Integer.parseInt(br.readLine());
		for(int i=1; i<=roop; i++) {
			int roop2 = Integer.parseInt(br.readLine());
			StringTokenizer str = new StringTokenizer(br.readLine());
			int max=0;
			int index = 0;
			int[] arr = new int[roop2];
			for (int j = 0; j < roop2; j++) {
				arr[j] = Integer.parseInt(str.nextToken());
				if(max<arr[j]){
					max = arr[j];
					index = j;
				}
			}
			long sum=0;
			int cnt=0;
			int cnt2=index;
			int choo = 0;
			while(true) {
				if(choo==0) {
					for(int j=cnt; j<cnt2;j++) {
						sum+= max-arr[j];
					}
				}
			
				if(cnt2!=roop2-1) {
					max=0;
					index=0;
					for (int j = cnt2+1; j < roop2; j++) {
						if(max<arr[j]){
							max = arr[j];
							index = j;
						}
					}
					cnt=cnt2+1;
					cnt2=index;
					choo=0;
					if(arr[cnt]==max) {
						choo=1;
					}
				}
				else break;
			}
			bw.write("#"+i+" "+sum+"\n");
		}
		
		
		
		bw.flush();
	}
	public static void test14() throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		//���ڳֱ�
		int roop = Integer.parseInt(br.readLine());
		
		for(int i=1; i<=roop; i++) {
			StringTokenizer str = new StringTokenizer(br.readLine());
			int arrSize = Integer.parseInt(str.nextToken());
			int [][] arr = new int[arrSize][arrSize];
			int cnt = Integer.parseInt(str.nextToken());
			int garopin=0;
			int garosum=0;
			int seropin=0;
			int serosum=0;
			
			for(int j=0; j<arrSize; j++) {
				str=new StringTokenizer(br.readLine());
				for(int k=0; k<arrSize; k++) {
					arr[j][k] = Integer.parseInt(str.nextToken());
				}
			}
			//����
			for(int j=0; j<arrSize; j++) {
				//����
				for(int k=0; k<arrSize; k++) {
					if(arr[j][k]==1) {
						garopin++;
						
					}
					else if(arr[j][k]==0) {
						if(garopin==cnt) {
							garosum++;
							garopin=0;
						}
						else garopin=0;
					}
				}
				if(garopin==cnt){
					garosum++;
					garopin=0;
				}
				else garopin=0;
				//����
				for(int k=0; k<arrSize; k++) {
					if(arr[k][j]==1) {
						seropin++;
						
					}
					else if(arr[k][j]==0) {
						if(seropin==cnt) {
							serosum++;
							seropin=0;
						}
						else seropin=0;
					}
				}
				if(seropin==cnt){
					serosum++;
					seropin=0;
				}
				else seropin=0;
				
			
			}
			bw.write("#"+i+" "+(garosum+serosum)+"\n");
		}
		
		bw.flush();
	}
	public static void test15() throws NumberFormatException, IOException {
		//�úд��ϱ�
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int roop = Integer.parseInt(br.readLine());
		
		for(int i=1; i<=roop; i++) {
			StringTokenizer str = new StringTokenizer(br.readLine());
			int asi = Integer.parseInt(str.nextToken());
			int abun = Integer.parseInt(str.nextToken());
			int bsi = Integer.parseInt(str.nextToken());
			int bbun = Integer.parseInt(str.nextToken());
			int bun= 0;
			int si = 0;
			if(abun+bbun>60) {
				bun = abun+bbun-60;
				si++;
			}
			else bun = abun+bbun;
			
			if(asi+bsi>12) {
				si+= asi+bsi-12;
			}
			else si+= asi+bsi;
			
			bw.write("#"+i+" "+si+" "+bun+"\n");
		}
	
		
		bw.flush();
	}
	public static void test16() throws NumberFormatException, IOException {
		//���������
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int roop = Integer.parseInt(br.readLine());
		
		for(int i=1;i<=roop; i++) {
			
			int [][] arr = new int[9][9];
			int [][] arr2 = new int[9][9];
			
			int breakPoint=0;
			int cnt=0;
			int sero = 0;
			for(int j=0; j<9;j++) {
				StringTokenizer str = new StringTokenizer(br.readLine());
				for(int k=0; k<9; k++) {
					arr[j][k] = Integer.parseInt(str.nextToken());
				}
				
			}
			for(int j=0; j<9; j++) {
				for(int k=0; k<9;k++) {
					int num = arr[j][k]-1;
					arr2[j][num] += 1;//����
				}
				for(int k=0; k<9; k++){
					int num = arr[k][j]-1;
					arr2[j][num] += 1;//����
				}
			}
			for(int j=0; j<9; j++) {
				for(int k=0; k<9; k++) {
					if(arr2[j][k]!=2) {
						breakPoint =1;
						bw.write("#"+i+" "+0+"\n");
						break;
					}
				}
				if(breakPoint==1) break;
			}
			for(int l = 0; l<9; l++) {
				int [] arr3 = new int[9];
				for(int j=sero; j<sero+3;j++) {
					for(int k=cnt;k<cnt+3;k++) {
						int num = arr[j][k]-1;
						arr3[num]+=1;
					}	
				}
				for(int k=0; k<9; k++) {
					if(arr3[k]!=1) {
						bw.write("#"+i+" "+0+"\n");
						breakPoint =1;
						break;
					}
				}
			
				
				if(breakPoint==1) {
					break;
				}
				
				cnt= cnt+3;
				if(cnt>6) {
					cnt=0;
					sero+=3;
				}	
				
				
			}
			
		
			if(breakPoint==0) {
				bw.write("#"+i+" "+1+"\n");
			}
			
		
			
			
		}
		
		bw.flush();
	}
	public static void test17() throws NumberFormatException, IOException {
		//��¥���ϱ�
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int roop = Integer.parseInt(br.readLine());
		int [] mon = {1,2,3,4,5,6,7,8,9,10,11,12};
		int [] day = {31,28,31,30,31,30,31,31,30,31,30,31};
		
		for(int i=1;i<=roop; i++) {
			StringTokenizer str = new StringTokenizer(br.readLine());
			int fm = Integer.parseInt(str.nextToken())-1;//7
			int fd = Integer.parseInt(str.nextToken());//17
			int lm = Integer.parseInt(str.nextToken());//12
			int ld = Integer.parseInt(str.nextToken());//24
			int cnt=0;
			if(fm==lm) {
				for(int j= fd; j<=ld;j++) {
					cnt++;
				}
			}
			else {
				while(mon[fm]<=lm) {
					int sumDay = 0;
					if(mon[fm]==lm) {
						sumDay= ld;
					}
					else sumDay = day[fm];
					
					for(int j= fd; j<=sumDay;j++) {
						cnt++;
					}
					fm++;
					fd=1;
					if(fm==12) {
						break;
					}
				}
				
			}
			bw.write("#"+i+" "+cnt+"\n");
			
		}
	
		
		
		bw.flush();
	
	}
	public static void test18() throws NumberFormatException, IOException {

		//�ݾ׿� �´� �Ž������ֱ�
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int roop = Integer.parseInt(br.readLine());
		
		int [] gap = {50000,10000,5000,1000,500,100,50,10};
		for(int i=1;i<=roop; i++) {
			int [] arr = new int[8];
			bw.write("#"+i+"\n");
			int n = Integer.parseInt(br.readLine());
			for(int j=0; j<8;j++) {
				arr[j] = n/gap[j];
				n= n%gap[j];
				bw.write(arr[j]+" ");
			}
			bw.write("\n");
		}
	
		
		
		bw.flush();
	
		
	
	}
	public static void test19() throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		//����
		int roop = Integer.parseInt(br.readLine());
		
		
		for(int i=1;i<=roop; i++) {
			bw.write("#"+i+" ");
			int roop2 = Integer.parseInt(br.readLine());
			int [] arr = new int[roop2];
			StringTokenizer str = new StringTokenizer(br.readLine());
			for(int j=0; j<roop2;j++) {
				arr[j]= Integer.parseInt(str.nextToken());
				
			}
			Arrays.sort(arr);
			for(int j=0; j<arr.length;j++) {
				bw.write(arr[j]+" ");
			}
			bw.write("\n");
		}
	
		
		
		bw.flush();
	}
}
