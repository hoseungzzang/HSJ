package cote;

import java.util.Scanner;
import java.util.Arrays;

public class study {

	public static void main(String[] args) {
		int [] arr = {7,1,5,2,10,-99,7,5};
	
		Scanner scan = new Scanner(System.in);
		int cnt = scan.nextInt();
		int []arr2 = new int[cnt];
		for(int i=0; i<cnt; i++) {
			int cnt2 = scan.nextInt();
			arr2[i]=cnt2;
			
			if((i+1)==1) {
				System.out.println(arr2[i]);
			}
			else {
				if((i+1)%2!=0) {
					Arrays.sort(arr2,0,i+1);
					for(int j=0; j<=i;j++) {
						System.out.print(arr2[j]+"  ");
					}
					System.out.println(arr2[(i/2)+1]);
				}
				else if((i+1)%2==0){
					Arrays.sort(arr2,0,i+1);//15
					for(int j=0; j<=i;j++) {
						System.out.println(arr2[j]);
					}
					System.out.println("짝수"+arr2[(i/2)]);
				}
			}
			
		}
		//Arrays.sort(arr2);
		//어레이 소트 인덱스 생각해야함.

	}

}
