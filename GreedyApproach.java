//import java.util.*;
//public class GreedyApproach {
  
    /*
    public static void main(String[] args) {
        int start[]={1, 3, 0, 5, 8, 5};
        int end[]= {2, 4, 6, 7, 9, 9};
        
        
        //end time basis sorted
        int maxAct=0;
        ArrayList <Integer> ans= new ArrayList<>();
        //last activ
        maxAct =1;
        ans.add(0);
        int Lastend=end[0];
        for(int i=1; i<end.length; i++){
            if (start[i]>=Lastend) {
                // activity select
                maxAct++;
                ans.add(i);
                Lastend =end[i];  */


                // Sorting Approach

               
               /* int activities[][]= new int[start.length][3];
                for(int i=0; i<start.length; i++){
                    activities[i][0]=i;
                    activities[i][1]=start[i];
                    activities[i][2]=end[i];
                }
                  // lambda function -> short form
                  Arrays.sort(activities,Comparator.comparingDouble(o -> o[2]));
                  //end time basis sorted
        int maxAct=0;
        ArrayList <Integer> ans= new ArrayList<>();
        //last activ
        maxAct =1;
        ans.add(activities[0][0]);
        int Lastend=activities[0][2];
        for(int i=1; i<end.length; i++){
            if (start[i]>=Lastend) {
                // activity select
                maxAct++;
                ans.add(activities[i][0]);
                Lastend =activities[0][2];  

            }
        }
        System.out.println("max activities ="+maxAct);
        for(int i=0;i<ans.size(); i++){
            System.out.println("A"+ans.get(i)+" ");
        }
        System.out.println();
    }
*/


     // Fractional knapsack

     /*
public static void main(String[] args) {
    int val []= {60, 100, 120};
    int weight[]= {10, 20, 30};
    int w=50;

    double ratio [][]= new double[val.length][2];
    for(int i=0; i<val.length; i++){
        ratio[i][0] =i;
        ratio[i][1] =val[i]/(double)weight[i];
    }

     // desending order
     Arrays.sort(ratio,Comparator.comparingDouble(o -> o[1]));
     int capacity =w;
     int finalVal =0;
     for(int i=ratio.length-1; i>=0; i--){
        int idx =(int)ratio [i][0];
        if (capacity>=weight[idx]) { // include full item
            finalVal+= val[idx];
            capacity-=weight[idx];
        }
        else{
            // include fractional item
            finalVal += (ratio[i][1]*capacity);
            capacity =0;
            break; 
        }
     }
     System.out.println("final value ="+ finalVal);
}*/

       // Min Absolute Diffrence pair

/*public static void main(String[] args) {
    int A[] ={1, 2, 3};
    int B[] ={2, 1, 3};

    Arrays.sort(A);
    Arrays.sort(B);

    int mindiff =0;
    for(int i=0; i<A.length;i++){
        mindiff += Math.abs(A[i]-B[i]);
    }
    System.out.println("min abs diffrent of pair ="+mindiff);
}*/



            // Max length chain of pair 
           
           /* public static void main(String[] args){            
            int pairs [][] ={ {5, 24}, {39,60}, {5, 28}, {27, 40}, {50 ,90}};

            Arrays.sort(pairs,Comparator.comparingDouble(o -> o[1]));

            int chainlen =1;
            int chainEnd =pairs[0][1]; // last selected pair end // chain end

            for(int i=1; i<pairs.length; i++){
                if (pairs[i][0]> chainEnd) {
                    chainlen++;
                    chainEnd =pairs[i][1];
                }
            }

            System.out.println("max lenght of chain ="+ chainlen);
}   */



    //   Indians Coins  
    

/*public static void main(String[] args) {
    Integer coins []={1, 2, 5, 10, 20, 50, 100, 500, 2000};

    Arrays.sort(coins, Comparator.reverseOrder());

    int  countcoins =0;
    int amount =590;

    ArrayList <Integer> ans =new ArrayList<>();
    for(int i=0; i<coins.length; i++){
        if (coins[i]<=amount) {
            while (coins[i]<= amount) {
                countcoins++;
                ans.add(coins[i]);
                amount -=coins[i];
            }
        }
    }
    System.out.println("total min coin used ="+ countcoins);
    for(int i=0; i<ans.size();i++){
        System.out.println(ans.get(i));
    }
}
*/




     //   job Sequencing  problem
     
    
     /*
    static class job{
        int deadline;
        int profit;
        int id;

        public job(int i, int d, int p){
            id=i;
            deadline =d;
            profit=p;
        }
    }
    public static void main(String[] args) {
        int jobInfo [][]={{4, 20},{1, 10},{1, 40},{1, 30}};

        ArrayList <job> jobs =new ArrayList<>();

        for(int i=0 ; i<jobInfo.length; i++){
            jobs.add(new job(i, jobInfo[i][0], jobInfo[i][1]));
        }
        Collections.sort(jobs,(obj1 , obj2)->obj2.profit-obj1.profit );

        ArrayList<Integer> seq =new ArrayList<>();
        int time =0;
        for (int i=0; i<jobs.size(); i++){
            job curr =jobs.get(i);
            if (curr.deadline> time ) {
                seq.add(curr.id);
                time ++;
            }
        }
        // print seq
        System.out.println("max jobs ="+seq.size());
        for(int i=0; i<seq.size(); i++){
            System.out.println(seq.get(i));
        }
        System.out.println();
    }*/




    // Chocola  Problem  Code


    /*public static void main(String[] args) {
        int n =4 , m=6;
        Integer costVer[] ={2, 1, 3, 1, 4};
        Integer costHor[] ={4, 1, 2};

    Arrays.sort(costVer, Collections.reverseOrder()); 
     Arrays.sort(costHor, Collections.reverseOrder());    

     int h =0, v=0;
     int hp =1, vp =1;
     int cost =0;

     while (h<costHor.length && v<costVer.length) {
        // verical cost <horizontal cost
        if (costVer[v]<costHor[h])  {         // horizontal cut
            cost += (costHor[h] * vp);
            hp++;
            h++;
        }
        else{  // vertical cut
        cost += (costVer[v] *hp);
        vp++;
        v++;
        }
     }
     while (h< costHor.length) {
         cost += (costHor[h] * vp);
            hp++;
            h++;
     }
     while (v <costVer.length) {
         cost += (costVer[v] *hp);
        vp++;
        v++;
     }
     System.out.println("min cut of cost =" + cost);
    }
}*/