//import java.util.ArrayList;

//public class ArrayListAdvanced {
                   //brute force  time complexicity -0(n^2)
    /*st<Integer> height
    public static int storewater(ArrayList<Integer> height){
        int maxwater =0;
        // brute force - o(n^2)
        for(int i=0;i<height.size();i++){
            for(int j=i+1;j<height.size();j++){
                int ht= Math.min(height.get(i),height.get(j));
                int width= j-i;
                int currwater=ht*width;
                maxwater=Math.max(maxwater, currwater);

            }
        }
        return maxwater;
    }
        */
                   //2 pointer Approach  time complexicity-0(n)
                   /*
                   public static int storewater(ArrayList<Integer> height){
                   int maxwater=0;
                   int lp=0;
                   int rp=height.size()-1;

                   while (lp<rp) {
                    // calculate water area
                    int ht=Math.min(height.get(lp),height.get(rp));
                    int width=rp-lp;
                    int currwater=ht*width;
                    maxwater=Math.max(maxwater,currwater);  

                    //update
                    if (height.get(lp)<height.get(rp)) {
                        lp++;
                    }
                    else{
                        rp--;
                    }
                   }
                   return maxwater;
                   }
    public static void main(String[] args) {
        ArrayList<Integer> height=new ArrayList<>();
        //1,8,6,2,5,4,8,3,7
        height.add(1);
        height.add(8);
        height.add(6);
        height.add(2);
        height.add(5);
        height.add(4);
        height.add(8);
        height.add(3);
        height.add(7);
        System.out.println(storewater(height));
    } */


                 // pair sum
                 /*
        
                 public static boolean pairsum1(ArrayList<Integer> list, int target){
                    int lp=0;
                    int rp=list.size()-1;

                    while (lp!=rp) {
                        // case 1
                        if (list.get(lp)+list.get(rp)==target) {
                            return true;
                        }
                          // case 2
                          if (list.get(lp)+list.get(rp)==target) {
                            lp++;
                    }
                      // case 3
                      else{
                        rp--;
                      }

                }
                return false;
                 }
         public static void main(String args[]) {
            ArrayList<Integer> list =new ArrayList<>();
            list.add(1);
            list.add(2);
            list.add(3);
            list.add(4);
            list.add(5);
            list.add(6);
            int target=5;
            System.out.println(pairsum1(list, target));
         }    
            */
            
            
                 // pair sum2 
                 
                 /*
                 public static boolean pairsum2(ArrayList<Integer> list, int target){
                 int bp=-1;
                 int n=list.size();
                 for(int i=0;i<list.size();i++){
                    if (list.get(i)>list.get(i+1)) {
                        bp=i;
                        break;
                    }                    
                 }
                 int lp=bp+1; //smallest
                 int rp=bp; // largest

                 while (lp!=rp) {
                    // case 1
                    if (list.get(lp)+list.get(rp)== target) {
                        return true;
                    }
                    // case 2) {                        
                    if (list.get(lp)+list.get(rp)<target) {
                        lp= (lp+1)%n;
                    }
                    // case 3
                    else{
                        rp=(n+rp-1)%n;
                    }
                 }
                 return false;
                }
                 public static void main(String[] args) {
                      ArrayList<Integer> list =new ArrayList<>();
                      //sorted and rotated
            list.add(11);
            list.add(15);
            list.add(6);
            list.add(8);
            list.add(9);
            list.add(10);
            int target=16;
            System.out.println(pairsum2(list, target));
                 }
            */
//}
