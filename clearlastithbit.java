public class clearlastithbit {
    public static int clearlastith(int n, int i) {
        int bitmask= (~0)<<i;
    return n&bitmask;    }
    public static int clearbitinRange (int n,int i, int j) {
        int a=((~0)<<(j+1));
        int b=(1<<i)-1;
        int bitmask =a|b;
        return n&bitmask;
    }
    public static boolean ispoweroftwo(int n) {
        return (n&(n-1))==0;
    }
    public static int countsetbit(int n){
        int count=0;
        while (n>0) {
            if ((n&1)!=0) {
                count++;
            }
           n= n>>1;
        }
        return count;
    }
    public static void main(String[] args) {
         System.out.println(countsetbit(15));
    }
}
