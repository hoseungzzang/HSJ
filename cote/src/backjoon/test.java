package backjoon;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.StringTokenizer;
import java.util.Map;
import java.util.Map.Entry;
import java.util.HashMap;
import java.util.List;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
public class test {

	public static void main(String[] args) {
		int [] lottos = {0, 0, 0, 0, 0, 0};
		int [] win_nums= {38, 19, 20, 40, 15, 25};
		int [] arr = {6,6,5,4,3,2,1};
		int[] answer = new int[2];
		int cnt=0;
		int zeroCnt=0;
		for(int i=0; i<5; i++) {
			if(lottos[i]==0) {
				zeroCnt++;
				continue;
			}
			for(int j=0; j<5;j++) {
				
				if(lottos[i]==win_nums[j]) {
					cnt++;
				}
				
			}
		}
		answer[0]=arr[(cnt+zeroCnt)];
		answer[1]=arr[cnt];
		System.out.println(answer[0] +" "+answer[1]);
	}
}
/*
 * //�������� �ҷ��� List List testYrList = TestCommonService.selectTestYr(testVO);
 * 
 * //List<Map<String, Object>> ��� ����Ʈ �ȿ� �������� �ҷ��� List�� �־��ش�. List<Map<String,
 * Object>> listMap = testYrList;
 * 
 * //�׸��� 0��° �ο쿡�� year��� �÷��� ���� String���� �����´�. String strYear =
 * listMap.get(0).get("year").toString();
 */