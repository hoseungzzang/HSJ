package cote;

public class dfsbfsSolution {
	static int [] answer ;
	static boolean [] check;
	static int result = 0;
	static boolean flag;
	 public static void DFS(long k,int cnt) {
		 if(cnt == k) {
			 result ++;
			 if(result==k) flag = true;
			 return;
		 }
		 
		 for(int i=0; i<check.length; i++) {
			 if(flag) break;
			 if(!check[i]) {
				 check[i] = true;
				 answer[cnt] = i+1;
				 DFS(k,cnt+1);
				 check[i] = false;
			 }
		 }
		 
	 }

	public static void main(String[] args) {
		int n= 3;
		long k = 5;
		check = new boolean[n];
		answer = new int [n];
		DFS(k,0);
		System.out.println(answer[0]+" "+answer[1]+" "+answer[2]);
	}

}


/*
 class Solution {
    static boolean [] check;
	static int [] answer;
	static int count=0;
	static boolean flag = false;
    public int[] solution(int n, long k) {
       
        	check = new boolean[n];
			answer = new int [n];
			DFS(0,0,n,k);
        return answer;
    }
    
    
    public static void DFS(int start, int cnt, int n, long k) {
			
			if(count==k|| cnt==n) return;
			if(cnt==n-1) {
				count++;
			}
			
			for(int i=0; i<n; i++) {
				if(!check[i]) {
					answer[cnt] = i+1;
					check[i]= true;
					DFS(i,cnt+1,n,k);
					check[i] = false;
					if(count==k) break;
				
				}
				
				
			}
		
	
			
			
	
		
	}
}*/
