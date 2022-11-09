package backjoon.homework;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


class Node{
	Node left ;
	Node right;
	int root;
	Node(int root){
		this. left = null ;
		this.right= null;
		this.root = root;
	
	}
}

public class num5639 {
	public static void main(String[] args) throws IOException {
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		String input;
		  Node root = new Node(Integer.parseInt(br.readLine()));
		  //
		  while (true) {
            input = br.readLine();
            if (input == null || input.equals(""))   break;
            Node node = root; // 50 30 null
            int num = Integer.parseInt(input); //24
            //50 30 24 5
            //root 50 l r null
			while(true) {
				//좌측
				if(node.root>num) {
					if(node.left==null) {
						node.left = new Node(num);
						//30의 객체 
						break;
					}else {
						node = node.left;
					}
				}
				else {
					if(node.right==null) {
						node.right = new Node(num);
						break;
					}else {
						node = node.right;
					}
				}
			}
		}
		 search(root);//50 
	}
	static void search(Node node) {
        if (node == null)
            return;
        
        search(node.left);
        search(node.right);
        System.out.println(node.root);
      
    }
	 
}

