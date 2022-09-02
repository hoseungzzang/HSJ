package cote;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class programersnumbersum {

	public static void main(String[] args) {
		String[] record= {"Enter uid1234 Muzi", "Enter uid4567 Prodo","Leave uid1234","Enter uid1234 Prodo","Change uid4567 Ryan"};
		Map<String,String> map = new HashMap<String,String>();//아이디를 저장하는 맵
		ArrayList<String> list = new ArrayList<String>();//행위와 아이디를 저장
		 String[] answer = {};
		 //행위를 구분하여 맵에는 유저아이디와 네임 , 리스트에는 행위와 아이디 저장  
		for(int i=0; i<record.length; i++) {
			String [] arr = record[i].split(" ");
			if(arr[0].equals("Enter")) {
				map.put(arr[1], arr[2]);
				list.add(arr[0]+" "+arr[1]);
			}else if(arr[0].equals("Leave")) {
				list.add(arr[0]+" "+arr[1]);
			}else {
				map.put(arr[1], arr[2]);
			}
		}
		//리스트 크기만큼 정답 배열 생성
		 answer = new String[list.size()];
		 
		 //리스트에 쌓인 행위별로 나눈 후 아이디를 맵에서 조회하여 문자열을 정답배열에 넣음.
		for(int i=0; i<list.size(); i++) {
			//Enter uid1234
			String [] arr = list.get(i).split(" ");
			if(arr[0].equals("Enter")) {
				answer[i]= map.get(arr[1])+"님이 들어왔습니다.";
			
			}else if(arr[0].equals("Leave")) {
				answer[i]= map.get(arr[1])+"님이 나갔습니다.";
			}
		}
		
	}

}







/* 
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.Map;
import java.util.Queue;
import java.util.Stack;
import java.util.StringTokenizer;

class Solution {
    public String[] solution(String[] record) {
		Map<String,String> map = new HashMap<String,String>();
		Map<String,String> map2 = new HashMap<String,String>();
		int cnt=0;
		for(int i=0; i<record.length; i++) {
			String [] arr = record[i].split(" ");

			if(arr[0].equals("Enter")) {
				map.put(arr[1], arr[2]);
				if(map2.containsKey(arr[1])) {
					map2.put(arr[1], arr[2]);
				}
				cnt++;
			}else if(arr[0].equals("Leave")) {
				map2.put(arr[1], map.get(arr[1]));
				map.put(arr[1], "");
				cnt++;
			}else {
				map.put(arr[1], arr[2]);
				if(map2.containsKey(arr[1])) {
					map2.put(arr[1], arr[2]);
				}
			}
		}

		String [] answer = new String[cnt];
		cnt=0;
		for(int i=0; i<record.length; i++) {
			String [] arr = record[i].split(" ");
			if(arr[0].equals("Enter")) {
			if(!map.get(arr[1]).equals("")) {
					answer[cnt] =map.get(arr[1])+"님이 들어왔습니다.";
				}else {
					answer[cnt] =map2.get(arr[1])+"님이 들어왔습니다.";
				}
			cnt++;
			}else if(arr[0].equals("Leave")) {
			answer[cnt] = map2.get(arr[1])+"님이 나갔습니다.";
			cnt++;
			}
		}
        return answer;
    }
}
 */