//public class BackTracking {
           // Change Array
    /* 
    public static void changeArr(int arr[],int i, int val){
         // base
         if (i==arr.length) {
            printarr(arr);
            return;
         }
         //recursion
         arr[i]=val;
         changeArr(arr, i+1, val+1);
         arr[i]=arr[i]-2;
    }
    public static void printarr(int arr[]){
        for (int i = 0; i < arr.length; i++) {
            System.out.print(i+" ");
        }
        System.out.println();
    }

public static void main(String args []) {
    int arr[]=new int[5];
    changeArr(arr, 0,1);
    printarr(arr);
}
 */

          // Find subset
          /*
public static void Findsubset(String str,String ans, int i){
    // base case
    if (i==str.length()) {
      System.out.println(ans);
        return;
    }
         // yes choice
    Findsubset(str, ans+str.charAt(i), i+1);
         // no choice
         Findsubset(str, ans, i+1);
}
public static void main(String[] args) {
    String str="abc";
    Findsubset(str,"", 0);
} */
       //Find permutation
       /* 
       public static void Findpermutation(String str,String ans){
         // base case
        if (str.length()==0) {
            System.out.println(ans);
            return;
        }
        // recursion
        for (int i = 0; i <str.length(); i++) {
            char curr=str.charAt(i);
            //abcde=>ab+de= abde
            String newstr= str.substring(0, i)+str.substring(i+1);
            Findpermutation(newstr, ans+curr);
        }        
       }
       public static void main(String[] args) {
        String str="abc";
        Findpermutation(str,"");
       }*/
           
           // N Queens
           /*
           public static boolean issafe(char board[][],int row,int col){
               //vertical
               for(int i=row-1;i>=0;i--){
                if (board[i][col]=='Q') {
                    return false;
                }
               }
               // diagonal left up
               for(int i=row-1,j=col-1;i>= 0 && j>=0;i--,j--){
                if (board[i][j]=='Q') {
                    return false;
                }
               }
               // diagonal right up
               for(int i=row-1,j=col+1;i>=0 && j<board.length;i--,j++){
                if (board[i][j]=='Q') {
                    return false;
                }
               }
               return true;
           }
           public static void nQueens(char board[][],int row){
             // base case 
             if (row==board.length) {
                printboard(board);
                return;
             }     //column loop
             for(int j=0;j<board.length;j++){
                if(issafe(board,row,j)){
                board[row][j]='Q';
                nQueens(board, row+1); //function call
                board[row][j]='x';
                }
             }
           }
           public static void printboard(char board[][]){
            System.out.println("-------chess board---------");
            for(int i=0;i<board.length;i++){
                for(int j=0;j<board.length;j++){
                    System.out.print(board[i][j]+" ");
                }
                System.out.println();
            }
           }
           public static void main(String[] args) {
            int n=4;
            char board[][]=new char[n][n];
            //intialize
            for(int i=0;i<n;i++){
                for(int j=0;j<n;j++){
                    board [i][j]='x';
                }
            }
            nQueens(board ,0);
           } */
//}