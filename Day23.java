import java.util.*;
import java.io.*;
class Node{
    Node left,right;
    int data;
    Node(int data){
        this.data=data;
        left=right=null;
    }
}
class Solution{

static void levelOrder(Node root){
      //Write your code here
      Queue<Node> q = new LinkedList<>() ; 
      q.add(root) ;
      
      while(!q.isEmpty()){
          int s = q.size() ; 
          for(int i=0; i<s; i++){
              Node curr = q.peek() ;
              q.remove() ;  
              System.out.print(curr.data + " ");
              if(curr.left != null){
                  q.add(curr.left) ; 
              }
              if(curr.right != null){
                  q.add(curr.right) ; 
              }
          }
      } 
    }

public static Node insert(Node root,int data){
        if(root==null){
            return new Node(data);
        }
        else{
            Node cur;
            if(data<=root.data){
                cur=insert(root.left,data);
                root.left=cur;
            }
            else{
                cur=insert(root.right,data);
                root.right=cur;
            }
            return root;
        }
    }
    public static void main(String args[]){
            Scanner sc=new Scanner(System.in);
            int T=sc.nextInt();
            Node root=null;
            while(T-->0){
                int data=sc.nextInt();
                root=insert(root,data);
            }
            levelOrder(root);
        }	
}