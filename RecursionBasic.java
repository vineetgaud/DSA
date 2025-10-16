//public class RecursionBasic {
       // sorted array 
       /* 
    public static boolean isSorted(int arr[],int i){
      if (i==arr.length-1) {
        return true; // base cases
      }
        if (arr[i]>arr[i+1]) { //check true
            return  false;
        }
        return isSorted(arr, i+1); // function call
    }
    public static void main(String[] args) {
        int arr[]={1,2,3,4,5};
         System.out.println(isSorted(arr, 0));
    }
         */

             //first occurence of element in array
             /* 
        public static int firstOccur(int arr[],int key,int i){
            if (i==arr.length) {
                return -1;
            }
            if (arr[i]==key) {
                return i;
            }
           return firstOccur(arr,key,i+1);
        }
        public static void main(String[] args) {
            int arr[]={8,3,6,9,5,10,2,5,3};
            System.out.println(firstOccur(arr, 5, 0));
        }
            */

            // x^n
           /* 
            public static int power(int x,int n){
            if (n==0) {
                return 1;
            }
            return x* power(x, n-1);
            }
            public static void main(String[] args) {
                System.out.println(power(2, 10));
            }
                */

                // log2n=l time comlexcity
            
                /* 
                 public static int optimizepower(int x,int n){
            if (n==0) {
                return 1;
            }
            int halfpower= optimizepower(x, n/2);
            int halfpowersq=halfpower*halfpower;
            // n is odd
            
            if (n%2!=0) {
                halfpowersq=x*halfpowersq;
            }
            return halfpowersq;
            }
            public static void main(String[] args) {
               int x=2;
               int n=10;
               System.out.println(optimizepower(x, n));
            }
              */ 

//}
