
//import java.util.*;
//public class StackCollectionsFramework {
    /*
    public static void pushAtBottom(Stack<Integer> s, int data){
        if ( s.isEmpty()) {
            s.push(data);
            return;
        }
        int top = s.pop();
        pushAtBottom(s, data);
        s.push(top);
    }        
        */

          // reverse String 

          /*
          public static String reverseString(String str){
            Stack <Character> s= new Stack<>();
            int idx=0;

            while (idx <str.length()) {
                s.push(str.charAt(idx));
                idx++;
            }
            StringBuilder result =new StringBuilder();
            while (!s.isEmpty()) {
                char curr =s.pop();
            result.append(curr);
            }
            return result.toString();
          }
            */

              // reverse a stack No extra space

              /*
               public static void pushAtBottom(Stack<Integer> s, int data){
        if ( s.isEmpty()) {
            s.push(data);
            return;
        }
        int top = s.pop();
        pushAtBottom(s, data);
        s.push(top);
    }  
        //reverse
        public static void reverseStack(Stack <Integer> s){
            if (s.isEmpty()) {
                return;
            }
            int top =s.pop();
            reverseStack(s);
            pushAtBottom(s, top);
        }      

          // print Stack
          public static void printStack(Stack<Integer> s){
            while (!s.isEmpty()) {
                System.out.println(s.pop());
            }                
          }*/

       
          // Stock Span Approach 

          /*
          public static void StockSpan(int stock[], int span []){
            Stack <Integer> s =new Stack<>();
            span[0]=1;
            s.push(0);

            for(int i=1; i<stock.length; i++){
              int currprice =stock[i];
              while (!s.isEmpty() && currprice>stock[s.peek()]) {
                s.pop();
              }
              if (s.isEmpty()) {
                span[i] =i+1;
              }
              else{
                int prevhigh =s.peek();
                span[i]=i-prevhigh;
              }
              s.push(i);
            }
          }
            */

          
              
        // Valid Paraentheses

        /*
        public static boolean isValid(String str){
          Stack<Character> s= new Stack<>();

          for(int i=0; i<str.length(); i++){
            char ch =str.charAt(i);

            if (ch =='(' || ch =='{' || ch =='[') {  //opening
              s.push(ch);
            }
            else{
              // closing
              if (s.isEmpty()) {
                return false;
              }
              if ( (s.peek()=='(' && ch ==')')
                 || (s.peek()=='{' && ch =='}')
                || (s.peek()=='[' && ch == ']') ){
                s.pop();
              }
              else{
                return false;
              }
            }
          }
          if (s.isEmpty()) {
            return true;
          }else{
            return false;
          }
        }*/


        // Duplicate parentheses

       
       /* public static boolean isDuplicate(String str){
          Stack<Character> s= new Stack<>();

          for(int i=0; i<str.length();i++){
            char ch =str.charAt(i);
            //closing
            if (ch==')') {
              int count =0;
              while (s.peek()!='(') {
                s.pop();
                count++;
              }
              if (count<1) {
                return true; //duplicate
              }else{
                s.pop(); // opening pair
              }
            }
            else{
               // opening , operator , operand
               s.push(ch);
            }           
          }
          return false;
        }
          */


            // Max Area in Histogram

            /*public static void maxArea(int arr []){
              int maxArea=0;
              int nsr[]= new int[arr.length];
              int nsl[]= new int[arr.length];

              //Next smaller Right
               Stack<Integer> s= new Stack<>();

               for(int i=arr.length-1;i>=0; i--){
                while (!s.isEmpty() && arr[s.peek()]>= arr[i]) {
                  s.pop();
                }
                if (s.isEmpty()) {
                  nsr[i]=arr.length;
                }else{
                  nsr[i] =s.peek();
                }
                s.push(i);
               }
              // Next Smaller Left

               s= new Stack<>();

               for(int i=0;i<arr.length; i++){
                while (!s.isEmpty() && arr[s.peek()]>= arr[i]) {
                  s.pop();
                }
                if (s.isEmpty()) {
                  nsl[i]= -1;
                }else{
                  nsl[i] =s.peek();
                }
                s.push(i);
               }
              // Current Area : width =j-i-1 =nsr[i]-nsl[i]-1

              for(int i=0; i<arr.length; i++){
                int height =arr[i];
                int width =nsr[i]- nsl[i]-1;
                int currArea = height*width;
                maxArea =Math.max(maxArea, currArea);
              }
              System.out.println("max in histogram ="+ maxArea);
            }*/


 //   public static void main(String args []) {
      
 
 /*
        Stack <Integer> s= new Stack <> ();
        s.push(1);
        s.push(2);
        s.push(3);    
           // System.out.println(s.peek());
            //s.pop()
         pushAtBottom(s, 4);
        while (!s.isEmpty()) {
            System.out.println(s.pop());
        }*/
        
       /* String str ="abcd";
        String result =reverseString(str);
        System.out.println(result);*/

         /* Stack <Integer> s= new Stack <> ();
        s.push(1);
        s.push(2);
        s.push(3); 
        
        reverseStack(s);
        printStack(s);
    */

    /*
     int stock[]={100, 80, 60, 70, 60, 85, 100};
     int span[] =new int[stock.length];
     StockSpan(stock, span);
     for(int i=0; i<span.length; i++){
      System.out.println(span[i]+" ");
     }
      */

        //Next Greater Element

        /*
      int arr [] ={6, 8, 0, 1, 3};
      Stack<Integer> s =new Stack<>();
      int nxtGreater[]=new int[arr.length];

      for(int i=arr.length-1; i>=0; i--){
        //1 while
        while (!s.isEmpty() && arr[s.peek()]<= arr[i]) {
          s.pop();
        }

        //2 if-else
        if (s.isEmpty()) {
          nxtGreater[i] =-1;
        }
        else{
          nxtGreater[i] =arr[s.peek()];
        }
        // push in s
        s.push(i);
      }
      for(int i=0;i<nxtGreater.length; i++){
        System.out.print(nxtGreater[i]+" ");
      }
      System.out.println();
      
      // next greater right
      //next greater left
      //next smaller right
      //next smaller left

      */

  //  valid parentheses
/*
  String str ="({})[]";
  System.out.println(isValid(str)) ;*/


  // Duplicate parentheses
  
  /*String str = "((a+b))";
  String str2= "(a-b)";
  System.out.println(isDuplicate(str)); */

/*
  // Max Area in Histogram

  int arr[] = {2, 1, 5, 6, 2, 3};  // height in histogram
  maxArea(arr);
    }
}

*/