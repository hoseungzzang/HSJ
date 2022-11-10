package cote;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
//다시풀어야함 프로그래머스 메뉴리뉴얼
public class menu {
	static boolean[] check;

	static boolean prime[] = new boolean[10000001];
	static ArrayList<String> list;
	static HashMap<Integer, HashMap<String, Integer>> map;
	public static void main(String[] args) {
		String[] orders = { "XYZ", "XWY", "WXA" };
		int[] course = { 2, 3, 4 };
		 map = new HashMap<>();
		ArrayList<String> answerList = new ArrayList<>();
		for(int i=0; i<course.length; i++) {
		map.put(course[i], new HashMap<String, Integer>());
		}
			
		
		
		for (int i = 0; i < orders.length; i++) {
			list = new ArrayList<>();
			String[] s = orders[i].split("");
			check = new boolean[s.length];
			DFS(s, "");
		}
		for (int i = 0; i < course.length; i++) {
			int max = Integer.MIN_VALUE;
			HashMap<String, Integer> map2 = map.get(course[i]);
			for (String key : map2.keySet()) {
				max = Math.max(max, map2.get(key));
			}
			if (max < 2)
				continue;

			for (String key : map2.keySet()) {
				if (map2.get(key) == max) {
					answerList.add(key);
				}
			}

		}
		String[] answer = new String[answerList.size()];
		for (int i = 0; i < answer.length; i++) {
			answer[i] = answerList.get(i);
		}
		Arrays.sort(answer);
	}
	public static void DFS(String[] s, String str) {
		if (map.containsKey(str.length())) {
			char[] c = str.toCharArray();
			Arrays.sort(c);
			String so = new String(c);
			if (!list.contains(so)) {
				map.get(so.length()).put(so, map.get(so.length()).getOrDefault(so, 0) + 1);
				// map.put(so.length(), so,map.getOrDefault(so, 0)+1);
				list.add(so);
			}

		}
		for (int i = 0; i < s.length; i++) {
			if (!check[i]) {
				check[i] = true;
				DFS(s, str + s[i]);
				check[i] = false;
			}

		}
	}

}
