/*
import java.util.*;
public class BinaryTreeBasic {
    static class Node{
        int data;
        Node left;
        Node right;

        Node(int data){
            this.data=data;
            this.left=null;
            this.right=null;
        }
    }
    static class BinaryTree{
        static int idx =-1;
        public static Node buildTree(int nodes[]){
            idx++;
            if (nodes[idx]==-1) {
                return null;
            }

            Node newNode =new Node(nodes[idx]);
            newNode.left =buildTree(nodes);
            newNode.right =buildTree(nodes);
            return newNode;
        }

        // Tree Traversal 
        //a.preOrder
        public static void preOrder(Node root){
            if (root ==null) {
                return;
            }
            System.out.print(root.data+" ");
            preOrder(root.left);
            preOrder(root.right);
        }

        // b. InOrder
         public static void InOrder(Node root){
            if (root ==null) {
                return;
            }
            InOrder(root.left);
             System.out.print(root.data+" ");
            InOrder(root.right);
        }

        // c. PostOrder
         public static void postOrder(Node root){
            if (root ==null) {
                return;
            }
            postOrder(root.left);
             System.out.print(root.data+" ");
            postOrder(root.right);
        }


          // Level Order Traversal
    public static void levelOrder(Node root){
    if (root == null) {
        return;
    }

    Queue<Node> q =new LinkedList<>();
    q.add(root);
    q.add(null);

    while (!q.isEmpty()) {
        Node currNode= q.remove();
        if (currNode==null) {
            System.out.println();
            if (q.isEmpty()) {
                break;
            }else{
                q.add(null);
            }
        }else{
            System.out.print(currNode.data+" ");
            if (currNode.left!=null) {
                q.add(currNode.left);
            }
            if (currNode.right!=null) {
                q.add(currNode.right);
            }
        }
    }
    }
    }
      
    // TRee height

    public static int height(Node root){
        if (root==null) {
            return 0;
        }
         int lh =height(root.left);
         int rh =height(root.right);
         return Math.max(lh, rh)+1;
    }


    // Count of Nodes

     public static int Count(Node root){
        if (root==null) {
            return 0;
        }
         int lh =Count(root.left);
         int rh =Count(root.right);
         return lh+rh+1;
    }


      // Sum of Nodes

       public static int Sum(Node root){
        if (root==null) {
            return 0;
        }
         int lhsum =Sum(root.left);
         int rhsum =Sum(root.right);
         return lhsum+rhsum+root.data;
    }


    // Diameter of tree  O(n^2)

     public static int Diameter2(Node root){
        if (root==null) {
            return 0;
        }
         int leftdiam =Diameter2(root.left);
         int leftHt= height(root.left);
         int rightdiam =Diameter2(root.right);
         int rightHt = height(root.right);
         
         int selfdiam = leftHt+rightHt+1;

         return Math.max(selfdiam,Math.max(leftdiam, rightdiam));
    }


      // Diameter Approach 2

      static class Info{
        int diam;
        int ht;
       public Info(int diam ,int ht){
        this.diam=diam;
        this.ht=ht;
        }
      }

      public static Info Diameter(Node root){
        if (root==null) {
            return new Info(0, 0);
        }
        Info leftInfo =Diameter(root.left);
        Info rightInfo =Diameter(root.right);

        int diam = Math.max(Math.max(leftInfo.diam,rightInfo.diam), leftInfo.ht+rightInfo.ht+1);
        int ht = Math.max(leftInfo.ht,rightInfo.ht)+1;

        return new Info(diam, ht);
      }

      */


       
    //public static void main(String[] args) {


      /*  int nodes[]= {1,2,4,-1,-1,5,-1,-1,3,-1,6,-1,-1};
        BinaryTree tree=new BinaryTree();
        Node root =tree.buildTree(nodes);
     //   tree.preOrder(root);
       // tree.postOrder(root);
        //tree.InOrder(root);
          tree.levelOrder(root);*/


         /* 
          Node root =new Node(1);
          root.left =new Node(2);
          root.right =new Node(3);
          root.left.left =new Node(4);
          root.left.right =new Node(5);
          root.right.left =new Node(6);
          root.right.right =new Node(7);

          */
          //System.out.print(height(root));
        //  System.out.print(Count(root));
          //System.out.print(Sum(root));
          //System.out.println(Diameter(root).diam);
   // }
//}

