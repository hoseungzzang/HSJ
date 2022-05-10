package cote;

public class programmerskeypad {

public static void main(String[] args) {
		
		int[] numbers = {1, 3, 4, 5, 8, 2, 1, 4, 5, 9, 5};//LRLLLRLLL
		String hand = "right";
		String result = "";
	
		int rightNum=12;
		int leftNum=10;
		
		for(int i=0; i<numbers.length;i++) {
			if(numbers[i]==1 || numbers[i]==4 || numbers[i]==7) {
				result = result+"L";
				leftNum = numbers[i];
			}
			else if(numbers[i]==3 || numbers[i]==6 || numbers[i]==9) {
				result = result+"R";
				rightNum = numbers[i];
			}
			else {
			if(numbers[i]==0) numbers[i]=11;
			int clacLeftNum=Math.abs((numbers[i] - leftNum)/3) + Math.abs((numbers[i] - leftNum)%3);
			int clacRightNum=Math.abs((numbers[i] - rightNum)/3) + Math.abs((numbers[i] - rightNum)%3);
				if(clacLeftNum==clacRightNum) {
					if(hand.equals("right")) {
						System.out.println(hand.equals("right"));
						result = result+"R";
						rightNum = numbers[i];
					}
					else {
						result = result+"L";
						leftNum = numbers[i];
					}
				}
				else if(clacRightNum>clacLeftNum) {
					result = result+"L";
					leftNum = numbers[i];
				}
				else {
					result = result+"R";
					rightNum = numbers[i];
				}
				
				
			}
		}
		System.out.println(result);
	}

}
