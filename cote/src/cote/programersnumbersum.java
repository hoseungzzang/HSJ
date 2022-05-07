package cote;

public class programersnumbersum {

	public static void main(String[] args) {
		int [] numbers = {5,8,4,0,6,7,9};
		int sum=0;
		
		for(int i=0; i<10; i++) {
			int cnt=0;
			for(int j=0; j<numbers.length; j++) {
				if(i==numbers[j]) {
					cnt=1;
				}
			}
			if(cnt==0) {
				sum = sum+=i;
			}
			
		}
		System.out.println(sum);
	}

}
