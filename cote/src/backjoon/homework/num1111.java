package backjoon.homework;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.StringTokenizer;

public class num1111 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int n = Integer.parseInt(br.readLine());
		
		StringTokenizer str = new StringTokenizer(br.readLine());
		int [] arr = new int[n];
		for(int i=0; i<n; i++) {
			arr[i] = Integer.parseInt(str.nextToken());
		}
		ArrayList<Integer> aList =new ArrayList<Integer>();
		ArrayList<Integer> bList=new ArrayList<Integer>();
		for(int i=0; i<n-1; i++) {
			ArrayList<Integer> newAList = new ArrayList<Integer>();
			ArrayList<Integer> newBList = new ArrayList<Integer>();
			System.out.println(aList.size());
			System.out.println(bList.size());
			for(int a= 0; a<=arr[i+1];a++  ) {
				for(int b = 0; b<=arr[i+1]; b++) {
					if((arr[i]*a)+b == arr[i+1]) {
						if(i!=0) {
							if(aList.indexOf(a)!=-1 &&aList.indexOf(a) == bList.indexOf(b)) {
								System.out.println(arr[i]+" "+a+" "+b);
								newAList.add(a);
								newBList.add(b);
							}
						}else {
							System.out.println("0번째"+arr[i]+" "+a+" "+b);
							newAList.add(a);
							newBList.add(b);
						}
					}
				}
			}
			aList = (ArrayList<Integer>) newAList.clone();
			bList = (ArrayList<Integer>) newBList.clone();
		}
		if(aList.size()==1) {
			System.out.println(arr[arr.length-1]*aList.get(0)+bList.get(0));
		}else if(aList.size()>1) {
			System.out.println("A");
		}else {
			System.out.println("B");
		}
	}
	 
}

