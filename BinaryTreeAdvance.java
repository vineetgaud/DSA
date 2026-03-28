
/*
import java.util.*;
public class BinaryTreeAdvance {

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


                // Subtree of Another tree
    public static boolean isIdentical(Node node, Node Subroot){
        if (node==null && Subroot==null) {
            return true;
        }else if (node==null || Subroot ==null || node.data!=Subroot.data) {
            return false;
        }
        if (!isIdentical(node.left, Subroot.left)) {
            return false;
        }
        if (!isIdentical(node.right, Subroot.right)) {
            return false;
        }
        return true;

    }

    public static boolean isSubtree(Node root, Node Subroot){
        if (root==null) {
            return false;
        }
        if (root.data==Subroot.data) {
            if (isIdentical(root, Subroot)) {
                return true;
            }
        }
        return isSubtree(root.left, Subroot) || isSubtree(root.right, Subroot);
    }


         // top View


         static class Info {
         Node node;
         int hd;
         public Info(Node node, int hd){
            this.node =node;
            this.hd =hd;
         }
         }

         public static void topView(Node root){
         // Level Order
         Queue<Info> q= new LinkedList<>();
         HashMap<Integer, Node> map =new HashMap<>();

         int min=0, max=0;
         q.add(new Info(root,0));
         q.add(null);

         while (!q.isEmpty()) {
            Info curr =q.remove();
            if (curr==null) {
                if (q.isEmpty()) {
                    break;
                }else{
                    q.add(null);
                }
            }else{
            if (!map.containsKey(curr.hd)) {  // first time my hd is occurring
                map.put(curr.hd,curr.node);
            }
            
            if (curr.node.left != null) {
                q.add(new Info(curr.node.left, curr.hd-1));
                min =Math.min(min,curr.hd-1);
            }
            if (curr.node.right!=null) {
                q.add(new Info(curr.node.right, curr.hd+1));
                max =Math.max(max,curr.hd+1);
            }
        }
                              
         }

         // print
         for(int i =min; i<= max; i++){
            System.out.print(map.get(i).data+" ");
         }
         System.out.println();
         }


         // last common ancestor


         public static boolean getpath(Node root , int n, ArrayList<Node> path){
            if (root == null) {
                return false;
            }

            path.add(root);

            if (root.data ==n) {
                return true;
            }

            boolean foundLeft =getpath(root.left, n, path);
            boolean foundRight = getpath(root.right, n, path);

            if (foundLeft ||foundRight) {
                return true;
            }
            path.remove(path.size()-1);
            return false;
         }
    
         public static Node lca(Node root, int n1, int n2){
            ArrayList<Node> path1 =new ArrayList<>();
            ArrayList<Node> path2 =new ArrayList<>();
            getpath(root, n1,path1);
            getpath(root, n2,path2);

            // last common ancestor
            
            int i=0;
            for(; i<path1.size() && i<path2.size(); i++){
                if (path1.get(i) != path2.get(i)) {
                    break;
                }
            }
            Node lca =path1.get(i-1);
            return lca;
         }



         // last common ancestor Approach 2

         public static Node lca2(Node root, int n1, int n2){

            if (root==null ||root.data ==n1 || root.data==n2) {
                return root;
            }

            Node leftlca = lca2(root.left, n1, n2);
            Node rightlca= lca2(root.right, n1, n2);

            // leftLca =val ,rightLca =null
           if (rightlca ==null) {
            return leftlca;
           }
           if (leftlca==null) {
            return rightlca;
           }


           return root;
         }
         

          // Min Distance between nodes


          public static int lcaDist(Node root, int n){
            if (root ==null) {
               return -1; 
            }

            if (root.data ==n) {
                return 0;
            }

            int leftDist =lcaDist(root.left, n);
            int rightDist=lcaDist(root.right, n);

            if (leftDist ==-1 && rightDist ==-1) {
                return -1;
            }else if (leftDist==-1) {
                return rightDist+1;
            }else {
                return leftDist+1;
            }
          }
          public static int minDist(Node root, int n1, int n2){
            Node lca =lca2(root, n1, n2);
            int dist1= lcaDist(lca , n1);
            int dist2 =lcaDist(lca, n2);

            return dist1+dist2;
          }

          
          // inOrder
    public static void inOrder(Node root){
        if (root==null) {
            return;
        }
        inOrder(root.left);
        System.out.print(root.data+" ");
        inOrder(root.right);
    }
// preOrder
    public static void preOrder(Node root){
        if (root==null) {
            return;
        }
        System.out.print(root.data+" ");
        preOrder(root.left);
        preOrder(root.right);
    }


            // Sorted Array to Balanced BST


            
            public static Node CreateBST(int arr[] , int st, int end){
                if (st > end) {
                    return null;
                }
                int mid = (st + end)/2;
                Node root =new Node(arr[mid]);
                root.left =CreateBST(arr, st, mid-1);
                root.right=CreateBST(arr, mid+1, end);
                return root;
            }



            // Convert BST to Balanced BST

            // inOrder
    public static void getinOrder(Node root, ArrayList<Integer> inOrder){
        if (root==null) {
            return;
        }
         getinOrder(root.left, inOrder);
         inOrder.add(root.data);
        getinOrder(root.right, inOrder);
    }
             // CreateBST
             public static Node CreateBST2(ArrayList<Integer> inOrder, int st, int end){
                if (st > end) {
                    return null;
                }

                int mid = (st + end)/2;
                Node root = new Node(inOrder.get(mid));
                root.left =CreateBST2(inOrder, st, mid-1);
                root.right=CreateBST2(inOrder, mid+1, end);
                return root;
             }


            public static Node BalancedBST(Node root){
                 // inOrder - Sorted
                ArrayList<Integer> inOrder = new ArrayList<>();
                getinOrder(root, inOrder);

                //Sorted inOrder -> balanced BST
                root = CreateBST2(inOrder, 0, inOrder.size()-1);
                return root;
            }
    public static void main(String[] args) {
        /*
        //tree
          Node root =new Node(1);
          root.left =new Node(2);
          root.right =new Node(3);
          root.left.left =new Node(4);
          root.left.right =new Node(5);
          root.right.left =new Node(6);
          root.right.right =new Node(7);

          /*
          // Subtree
            Node Subroot =new Node(2);
          Subroot.left =new Node(4);
          Subroot.right =new Node(5);
          System.out.println(isSubtree(root, Subroot));*/

          // top View 
         // topView(root);
         // last common ancestor
        // int n1=4, n2=6;
        //System.out.print(lca(root, n1, n2).data);

        // min distance
       // System.out.print(minDist(root, n1, n2));


        // Sorted array to Balanced BST
        // int arr []={3,5,6,8,10,11,12};
        // Node root =CreateBST(arr, 0, arr.length-1);
        // preOrder(root);
        

        // COnvert BST to BAlanced BST
        /*
        Node root = new Node(8);
        root.left =new Node(6);
        root.left.left = new Node(5);
        root.left.left.left =new Node(3);

        root.right = new Node(10);
        root.right.right = new Node(11);
        root.right.right.right =new Node(12);
        
        root = BalancedBST(root);
        preOrder(root);
    }
}
*/