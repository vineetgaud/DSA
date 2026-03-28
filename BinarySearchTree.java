/*
import java.util.ArrayList;

public class BinarySearchTree {
    static class Node {
        int data;
        Node left;
        Node right;

        Node(int data){
            this.data =data;
        }
    }

    public static Node insert(Node root, int val){
       if (root==null) {
        return root=new Node(val);
       }

       if (root.data > val) {
        // left subtree
        root.left = insert(root.left, val);
       }else{
        // right subtree
        root.right = insert(root.right, val);
       }
       return root;
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

      // Search 

      public static boolean Search(Node root, int key){
        if (root == null) {
            return false;
        }
        if (root.data ==key) {
            return true;
        }
        if (root.data >key) {
            return Search(root.left, key);
        }
        else{
            return Search(root.right, key);
        }
      }

        // Node delete 

      public static Node delete(Node root, int val){
        if (root.data < val) {
            root.right = delete(root.right, val);
        }
        else if (root.data > val) {
            root.left = delete(root.left, val);
        }
        else {
             // case 1 - leaf node
             if (root.left == null && root.right ==null) {
                return null;
             }

             // case 2 - single child
             if (root.left == null) {
                return root.right;
             }
             else if (root.right == null) {
                return root.left;
             }

             // case 3 - both children
             Node IS = findInorderSuccessor(root.right);
             root.data = IS.data;
             root.right = delete(root.right, IS.data);
        }

        return root;
      }

      public static Node findInorderSuccessor(Node root){
        while (root.left != null) {
            root = root.left;
        }
        return root;
      }



         // Print in Range 

         public static void printRange(Node root, int k1, int k2){
            if (root==null) {
                return;
            }
            if (root.data >= k1 && root.data <=k2) {
                printRange(root.left, k1, k2);
                System.out.print(root.data+" ");
                printRange(root.right, k1, k2);
            }
            else if (root.data <k1) {
                printRange(root.left, k1, k2);
            }
            else{
                printRange(root.right, k1, k2);
            }
         }


           // print path

           public static void printPath(ArrayList<Integer> path){
            for(int i=0; i<path.size(); i++){
                System.out.print(path.get(i)+"->");
            }
            System.out.println("Null");
           }
           public static void printRoot2Leaf(Node root, ArrayList<Integer> path){
            if (root == null) {
                return;
            }
            path.add(root.data);
            if (root.left==null && root.right ==null) {
                printPath(path);
            }

            printRoot2Leaf(root.left, path);
           printRoot2Leaf(root.right, path);
           path.remove(path.size()-1);
           }


            // VAlid BST

            public static boolean isValidBST(Node root, Node min ,Node max){
                if (root == null) {
                    return true;
                }
                else if (min!= null && root.data<=min.data) {
                    return false;
                }
                return isValidBST(root.left, min, root)
                    && isValidBST(root.right, root, max);
            }


             //  Mirror os BST

             public static Node createMirror(Node root){
                if (root == null) {
                    return null;
                }
                Node leftMirror = createMirror(root.left);
                Node rightMirror= createMirror(root.right);

                root.left =rightMirror;
                root.right =leftMirror;
                return root;
             }
             public static void preOrder(Node root){
                if (root == null) {
                    return;
                }
                System.out.print(root.data+" ");
                preOrder(root.left);
                preOrder(root.right);
             }

         */


    //public static void main(String[] args) {
       
       /* int values[] = {8, 5, 3, 1, 4, 6, 10, 11, 14};
        Node root = null;

        for(int i=0; i<values.length;i++){
            root = insert(root, values[i]);
           
        }

       inOrder(root);
        System.out.println();*/

        //delete Node
    //  root =delete(root, 1);
    //  System.out.println();

    //  inOrder(root);

     // print Range
    // printRange(root,5, 12);

    //printRoot2leaf
   // printRoot2Leaf(root, new ArrayList<>());

  // Valid BST
// if (isValidBST(root,null,null)) System.out.println("is valid");
// else System.out.println("not valid");


// Mirror of BST
/*
Node root = new Node(8);
root.left = new Node(5);
root.right =new Node(10);
root.left.left = new Node(3);
root.left.right =new Node(6);
root.right.right =new Node(11);

root = createMirror(root);
preOrder(root);

    }
    }*/