package backjoon.homework;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.StringTokenizer;

public class num1055 {
	static HashMap<String,String> map = new HashMap<>();
	static ArrayList<String> list = new ArrayList<>();
	static int roop;
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		String s = br.readLine();
		String answer = br.readLine();
		map.put("$", s);
		 roop  = Integer.parseInt(br.readLine());
		StringTokenizer str = new StringTokenizer(br.readLine());
		int start = Integer.parseInt(str.nextToken());
		int end = Integer.parseInt(str.nextToken());
		str = new StringTokenizer(answer , "$" , true);
		while(str.hasMoreElements()) {
			list.add(str.nextToken());
		}
		calc(0,end);
		if(map.get("$").length()<end) {
			bw.write(map.get("$"));
			for(int i=0; i<end-map.get("$").length();i++) {
				bw.write("-");
			}
		}else {
			bw.write(map.get("$").substring(start-1,end));
		}
		bw.flush();
	}
	public static void calc(int i, int end) {
		if(i==roop || map.get("$").length()>=end) {
			return;
		}
		StringBuffer  sb = new StringBuffer();
		for(int j=0;j<list.size();j++) {
			if(list.get(j).equals("$")) {
				sb.append(map.get("$"));
			}else {
				sb.append(list.get(j));
			}
		}
		map.put("$",sb.toString());
		calc(i+1,end);
	}
}
