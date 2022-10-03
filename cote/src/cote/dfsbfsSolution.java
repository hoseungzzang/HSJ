package cote;

public class dfsbfsSolution {
	static int answer =0;
	static boolean [] check;
	 public static void DFS(int start, int[][] arr) {
		   

			if(check[start]) return;
			check[start]= true;
			for(int i=0; i<arr[start].length; i++) {
				if( arr[start][i]==1 && !check[i]) {
					DFS(i,arr);
				}
				
			}
		
		
	}

	public static void main(String[] args) {
		int n= 3;
		int[][] computers= {{1, 1, 0}, {1, 1, 1}, {0, 1, 1}};
		 check = new boolean[n];
			for(int i=0; i<n; i++) {
				if(!check[i]) {
					answer++;
					DFS(i,computers);
				}
			  
			}
	}

}
