package cote;

import java.util.HashMap;
import java.util.Map;

public class programerslottos {

	public static void main(String[] args) {
		
		String[] survey = {"AN", "CF", "MJ", "RT", "NA"};
		int[] choices = {5, 3, 2, 7, 5};
		char [] nameArr = {'R','T','C','F','J','M','A','N'};
		String answer="";
		String [] mbti = {"RT","CF","JM","AN"};
		Map<Character,Integer> map = new HashMap<>();
		for(int i=0; i<nameArr.length; i++) {
			map.put(nameArr[i], 0);
		}
		
		for(int i=0; i<survey.length; i++) {
			int pick = choices[i];
			//AN 5 
			if(pick>4) {
				map.put(survey[i].charAt(1), map.get(survey[i].charAt(1))+( (4-pick)*-1) );
			}else if(pick<4){
				map.put(survey[i].charAt(0), map.get(survey[i].charAt(0))+(4-pick) );
			}
		}
		
		for(int i=0; i<mbti.length; i++) {
			//RT
			int first = map.get(mbti[i].charAt(0));
			int second = map.get(mbti[i].charAt(1));
			if(first>second) {
				answer+=mbti[i].charAt(0);
			}else if(first<second) {
				answer+=mbti[i].charAt(1);
			}else {
				answer+=mbti[i].charAt(0);
			}
		}
		System.out.println(answer);
	}

} 






/*
public String solution(String[] survey, int[] choices) {
     		String [] index = {"RT","CF","JM","AN"};
        String answer="";
        	String [] result = new String[4];
		int [] calcResult = new int[4];
			for(int i=0; i<survey.length; i++) {
			int arrIndex = 0;
			String [] arr = survey[i].split("");
			int calc = choices[i] -4;
			//문자의 인덱스 구하기, 넣을 인덱스
			for(int j=0; j<index.length; j++) {
				if(index[j].contains(arr[0])==true) {
					arrIndex = j;
				}
			}
			if (result[arrIndex] == null) {
				if (calc > 0) {
					result[arrIndex] = arr[1];
					calcResult[arrIndex] = calc;
				} else if (calc < 0) {
					result[arrIndex] = arr[0];
					calcResult[arrIndex] = calc;
				} else {
					Arrays.sort(arr);
					result[arrIndex] = arr[0];
					calcResult[arrIndex] = calc;
				}
			} else {
				if (calc > 0) {
					if(result[arrIndex].equals(arr[1])) {
						calcResult[arrIndex] += calc;
					}
					else {
						if (calcResult[arrIndex] < calc) {
							result[arrIndex] = arr[1];
						}else if(calcResult[arrIndex] == calc) {
							Arrays.sort(arr);
							result[arrIndex] = arr[0];
						}
					}
				

				} else if (calc < 0) {
					calc *= -1;
					if(result[arrIndex].equals(arr[0])) {
						calcResult[arrIndex] += calc;
					}
					else {
						if (calcResult[arrIndex] < calc) {
							result[arrIndex] = arr[0];
						}else if(calcResult[arrIndex] == calc) {
							Arrays.sort(arr);
							result[arrIndex] = arr[0];
						}
					}
				
				}
			}
			
			
		}
		
		for(int i=0; i<result.length; i++) {
			if(result[i] == null) {
				String [] arr = index[i].split("");
				answer+=arr[0];
				continue;
			}
			answer+=result[i];
		}
        return answer;
    }
 */



