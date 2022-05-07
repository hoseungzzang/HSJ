package cote;

public class programerslottos {

	public static void main(String[] args) {
		int [] lottos = {0, 0, 0, 0, 0, 0};
		int [] win_nums= {38, 19, 20, 40, 15, 25};
		int [] arr = {6,6,5,4,3,2,1};
		int[] answer = new int[2];
		int cnt=0;
		int zeroCnt=0;
		for(int i=0; i<6; i++) {
			if(lottos[i]==0) {
				zeroCnt++;
				continue;
			}
			for(int j=0; j<6;j++) {
				
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
