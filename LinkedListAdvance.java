/*

public class LinkedListAdvance {
     public static class Node {
    int data;
    Node next;

    public Node(int data){
        this.data=data;
        this.next= null;
    }
}
    public static Node head;
    public static Node tail;
    public static int size;

      // print LinkedList
       public void print(){
            if (head==null) {
                System.out.println("ll is empty");
                return;
            }
            Node temp= head;
            while (temp!=null) {
                System.out.print(temp.data+"->");
                temp =temp.next;
            }
            System.out.println("null");
        }   

                // add first
                 public void addFirst(int data){
        // step 1 =create new node
        Node newNode= new Node(data);
        size++;
        if (head==null) {
            head=tail=newNode;
            return;
        }
        // step 2
        newNode.next=head;  // link

        // step 3 
        head=newNode;
    }

          //  palindrome

          // slow fast approach
          public Node findNode(Node head){
          Node slow =head;
          Node fast =head;

          while (fast!=null && fast.next!=null) {
            slow =slow.next;
            fast=fast.next.next;
          }
          return slow;  // slow is my mid
          }

          // check palindrome
          public boolean checkPalindrome(){
            if (head==null || head.next==null) {
                return true;
            }
            // step 1- find mid
            Node midNode= findNode(head);

              // step 2 reverse 2nd half
              Node prev= null;
              Node curr =midNode;
              Node next;

              while (curr!=null) {
                next=curr.next;
                curr.next =prev;
                prev= curr;
                curr=next;
              }
              Node right =prev;  //right half head
              Node left =head;
               
               // step 3 check lefthalf & righthalf
               while (right!=null) {
                if (left.data!=right.data) {
                    return false;
                }
                    left =left.next;
                    right= right.next;
                              
               }
               return true;
          }

            // Cycle in LL

            public static boolean isCycle(){
              Node slow =head;
              Node fast =head;

              while (fast!=null && fast.next!=null) {
                slow =slow.next;
                fast =fast.next.next;

                if (slow==fast) {
                  return true;
                }
              }
              return false;
            }

            // remove Cycle in a LL

            public static void removeCycle(){
              // detect cycle
              Node slow = head;
              Node fast = head;
              boolean Cycle =false;

              while (fast!=null && fast.next!=null) {
                slow =slow.next;
                fast =fast.next.next;
                if (fast==slow) {
                  Cycle =true;
                  break;
                }
              }
              if (Cycle == false) {
                return;
              }
                
              // find meeting point
              slow =head;
              Node prev =null; //last Node
             while (slow!=fast) {
              prev=fast;
              slow=slow.next;
              fast=fast.next;
             }
              //remove cycle -> last.next = null
              prev.next=null;
            }

            // Merge Sort LinkedList

            public Node getmid(Node head){
              Node slow=head;
              Node fast=head.next;

              while (fast!=null&&fast.next!=null) {
                slow=slow.next;
                fast=fast.next.next;                
              }
              return slow; // mid
            }
             
              // Merge 

              public Node merge(Node head1, Node head2){
                Node mergeLL=new Node(-1);
                Node temp =mergeLL;

                while (head1!=null && head2!=null) {
                  if (head1.data<=head2.data) {
                    temp.next=head1;
                    head1=head1.next;
                    temp=temp.next;
                  }
                  else{
                    temp.next=head2;
                    head2=head2.next;
                    temp=temp.next;
                  }
                }
                while (head1!=null) {
                   temp.next=head1;
                    head1=head1.next;
                    temp=temp.next;
                }
                while (head2!=null) {
                   temp.next=head2;
                    head2=head2.next;
                    temp=temp.next;
                }
                return mergeLL.next;
              }

               // Merge Sort
               public Node mergeSort(Node head){
                if (head==null || head.next==null) {
                  return head;
                }
                // find mid
                Node mid = getmid(head);
                // left & right ms
                Node righthead=mid.next;
                mid.next=null;
                Node newleft = mergeSort(head);
                Node newright = mergeSort(righthead);

                // merge 
                return merge(newleft,newright);
               }   

                
                 // Zig Zag LinkedList

      public void zigZag(){
        // find mid

        Node slow=head;
        Node fast= head.next;

        while (fast!=null && fast.next!=null) {
          slow=slow.next;
          fast=fast.next.next;

        }
        Node mid =slow;  // mid

         // reverse 2nd half

         Node curr =mid.next;
         mid.next=null;
         Node prev =null;
         Node next;

         while (curr!=null) {
          next= curr.next;
          curr.next=prev;
          prev = curr;
          curr= next;
         }

         Node left =head;
         Node right =prev;
         Node nextL, nextR;

         // alt merge zigzag merge

         while (left!=null && right!=null) {
          nextL=left.next;
          left.next=right;
          nextR =right.next;
          right.next=nextL;

          //update
          left =nextL;
          right=nextR;
         }
      }
    public static void main(String[] args) {
    LinkedListAdvance ll = new LinkedListAdvance();
      // ll.addFirst(1);
      // ll.addFirst(2);
      // ll.addFirst(2);
      // ll.addFirst(1);
     // ll.print();
     // System.out.println(ll.checkPalindrome());
     /*
     head= new Node(1);
     Node temp =new Node(2);
     head.next =temp;
     head.next.next =new Node(3);
     head.next.next.next=temp;
      System.out.println(isCycle());
     removeCycle();
     System.out.println(isCycle());
     */

     /*
    ll.addFirst(5);
    ll.addFirst(4);
    ll.addFirst(3);
    ll.addFirst(2);
    ll.addFirst(1);
    ll.print();
    ll.head =ll.mergeSort(ll.head);
    ll.print();

    }
    */
    /*
     ll.addFirst(5);
    ll.addFirst(4);
    ll.addFirst(3);
    ll.addFirst(2);
    ll.addFirst(1);
    ll.print();
    ll.zigZag();
    ll.print();
}
}
*/