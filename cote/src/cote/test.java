package cote;

import java.io.IOException;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.Map;
import java.util.Queue;
import java.util.Set;
import java.util.Stack;

public class test {
	
	static boolean [] check;
	static int answer=0;
	static int [] by ;
	static HashMap<Integer,String> map = new HashMap<>();
	public static void main(String[] args) throws IOException {
		/*
		String source = "bbaabd";
		String dest="" ;
		String answer ="";
		for(char i = 'a' ; i<='z'; i++) {
			if(source.contains(Character.toString(i))) {
				source = source.replaceFirst(Character.toString(i), "");
				dest += i;
			}
		}
		String [] arr = source.split("");
		Arrays.sort(arr);
		answer = dest.concat(String.join("", arr));		
		System.out.println(answer);
		*/
		test2();
	}
	
	public static void test2() {
		int [] music = {10,9,4,5,12};
		int start =1;
		map.put(1, "white");
		map.put(3, "white");
		map.put(5, "white");
		map.put(7, "white");
		map.put(8, "white");
		map.put(10, "white");
		map.put(12, "white");
		map.put(2, "black");
		map.put(4, "black");
		map.put(6, "black");
		map.put(9, "black");
		map.put(11, "black");
		
		for(int i=0; i<music.length; i++) {
			check = new boolean[13];
			by = new int [13];
			check[0]= true;
			BFS(start,music[i]);
			start = music[i]; 
		}
		System.out.println(answer);
	}
	public static void BFS(int start, int end) {
		Queue<Integer> que = new LinkedList<Integer>(); 
		Queue<Integer> index = new LinkedList<Integer>(); 
		que.add(start);
		index.add(0);
		check[start]= true;
		while(!que.isEmpty()) {
			int num = que.poll();
			int id = index.poll();
			if(num == end) {
				answer+=id;
				break;
			}
			if(map.get(num).equals("white")) {
				for(int i=1; i<=2; i++) {
					if(num-i>0 && !check[num-i]) {
						if(num==8 && i==2){
							
						}else {
							que.offer(num-i);
							index.offer(id+1);
							check[num-i] = true;
						}
						
					}
					if(num+i<13 && !check[num+i]) {
						if(num == 7 && i==2) {
							
						}else {
							que.offer(num+i);
							index.offer(id+1);
							check[num+i] = true;
						}
						
					}
				}
			}else {
				if(!check[num+1]) {
					que.offer(num+1);
					index.offer(id+1);
					check[num+1] = true;
				}
				if(!check[num-1]) {
					que.offer(num-1);
					index.offer(id+1);
					check[num-1] = true;
				}
			}
		}
	}
}
