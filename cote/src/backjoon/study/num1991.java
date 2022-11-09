package backjoon.study;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;


class Node{
	Node left ;
	Node right;
	String root;

	Node(String root){
		this. left = null ;
		this.right= null;
		this.root = root;
	
	}
}

public class num1991 {
	public static void main(String[] args) throws IOException {

		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		int roop = Integer.parseInt(br.readLine());
		Node root;
		for(int i=0; i<roop; i++) {
			StringTokenizer str = new StringTokenizer(br.readLine());
			String node = str.nextToken();
			String left = str.nextToken();
			String right = str.nextToken();
			if(i == 0) {
				root = new Node(node);
			}
		}
		  
	}
	static void postOrder(Node node) {
        if (node == null)
            return;

        postOrder(node.left);
        postOrder(node.right);
        System.out.println(node.root);
    }
	 
}

