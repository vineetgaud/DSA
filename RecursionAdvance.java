//public class RecursionAdvance {
            // tilling problem
    /*
    public static int tillingproblem(int n){
        //base caase
        if (n==0||n==1) {
            return 1;
        }
        // vertical problem
        int fnm1= tillingproblem(n-1);
        // horizontal problem
        int fnm2=tillingproblem(n-2);
        int totways=fnm1+fnm2;
        return totways;

    }
    public static void main(String[] args) {
        System.out.println(tillingproblem(3));
    }
        */
        //Remove Duplicate

        /*
        public static void RemoveDuplicate(String str,int idx,StringBuilder newstr,boolean map[]){
            if (idx==str.length()) {
                System.out.println(newstr);
                return;
            }
            //kaam
            char crrchar=str.charAt(idx);
            if (map[crrchar-'a']==true) {
                //duplicate
                RemoveDuplicate(str, idx+1, newstr, map);
            }
            else{
                map[crrchar-'a']=true;
                RemoveDuplicate(str, idx+1, newstr.append(crrchar), map);
            }

        }
        public static void main(String[] args) {
            String str="appnnacollege";
            RemoveDuplicate(str, 0, new StringBuilder(""),new boolean[26]);
        }
            */

            //Friend pairing problem
         /*
            public static int friendpair(int n){
                //base
                if (n==1||n==2) {
                    return n;
                }
                //single
                int fnm1=friendpair(n-1);
                //pairs
                int fnm2=friendpair(n-2);
                int pairways=(n-1)*fnm2;
               int totalways=fnm1*pairways;
               return totalways;
            }          
        public static void main(String[] args) {
          System.out.println(friendpair(3)); 
        }*/          
         
//}
