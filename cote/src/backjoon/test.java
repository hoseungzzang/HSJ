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
 * //쿼리에서 불러온 List List testYrList = TestCommonService.selectTestYr(testVO);
 * 
 * //List<Map<String, Object>> 라는 리스트 안에 쿼리에서 불러온 List를 넣어준다. List<Map<String,
 * Object>> listMap = testYrList;
 * 
 * //그리고 0번째 로우에서 year라는 컬럼의 값을 String으로 가져온다. String strYear =
 * listMap.get(0).get("year").toString();
 */