package backjoon;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class test {

	public static void main(String[] args) {
		int[][] arr1 = {{1},{2}};
		int[][] arr2 =  {{3},{5}};
		int[][] answer = new int[arr1.length][arr1.length-1];
		System.out.println(arr1[arr1.length-1].length);
		
		for(int i=0; i<arr1.length; i++) {
			for(int j=0; j<arr1[arr1.length-1].length;j++) {
				answer[i][j] = arr1[i][j]+arr2[i][j];
				System.out.println(answer[i][j]);
			}
			
		}
	}
}
