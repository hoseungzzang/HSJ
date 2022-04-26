package cote;

import java.util.Arrays;

public class cote {

	public static void main(String[] args) {
		String [] id_list= {"muzi", "frodo", "apeach", "neo"};
		String [] report = {"ryan con", "ryan con", "ryan con", "ryan con"};
		int k=3;
		Solution(id_list,report,k);
	}
	
	public static void Solution(String[] id_list, String[] report, int k) {
		 int[] cnt2 = new int[id_list.length];
			String[] resultArr = Arrays.stream(report).distinct().toArray(String[]::new);
			int cnt=0;
			int[] answer = new int[id_list.length];
			
			for (int i = 0; i < id_list.length; i++) { //4
				String[]array2 = new String[resultArr.length];
				for (int j = 0; j < resultArr.length; j++) {
					String[] array = resultArr[j].split(" "); // 1은 신고자 2는 대상
					
					if (array[1].equals(id_list[i])) {
						cnt2[i] += 1;
						array2[cnt]=array[0];
						cnt++;
					}

				}
				if(cnt2[i]>=k) {
					for(int c=0; c<cnt; c++) {
						answer[Arrays.asList(id_list).indexOf(array2[c])]+=1;
					
					}
				}
				cnt=0;
			}
	  
	}

}
