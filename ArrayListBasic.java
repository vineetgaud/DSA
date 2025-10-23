//  import java.util.ArrayList;
// import java.util.Collections;
//import java.util.*;
//public class ArrayListBasic {
    /*
    public static void swap(ArrayList<Integer> list, int idx1,int idx2){
        int temp = list.get(idx1);
        list.set(idx1,list.get(idx2));
        list.set(idx2,temp);
    }
    public static void main(String[] args) {
        ArrayList<Integer> list= new ArrayList<>();
        list.add(2);
        list.add(5);
        list.add(9);
        list.add(6);
        list.add(8);
        int idx1=1, idx2 =3;
        System.out.println(list);
         swap(list, idx1, idx2);
         System.out.println(list);
         */

           // max element
        /*
         int max=Integer.MIN_VALUE;
         for (int i = 0; i <list.size(); i++) {
            if (max<list.get(i)) {
                max=list.get(i);
            }
         }
         System.out.println("max is ="+max);
 } */    
       //Sorting
/*   public static void main(String[] args) {
        ArrayList<Integer> list= new ArrayList<>();
        list.add(2);
        list.add(5);
        list.add(9);
        list.add(6);
        list.add(8);
        System.out.println(list);
        Collections.sort(list);
        System.out.println(list);
        //descending
        Collections.sort(list,Collections.reverseOrder());  //comparator -fnx logic
        System.out.println(list );
   } */
    /* 
    public static void main(String[] args) {
        ArrayList<ArrayList<Integer>> mainlist= new ArrayList<>();
        ArrayList<Integer> list=new ArrayList<>();
        list.add(2); list.add(3);
        mainlist.add(list);

        ArrayList<Integer> list2=new ArrayList<>();
        list2.add(4);list2.add(5);
        mainlist.add(list2);
         
        for(int i=0; i<mainlist.size();i++){
            ArrayList<Integer> currlist=mainlist.get(i);
            for(int j=0;j<mainlist.size();j++){
                System.out.print(currlist.get(j)+" ");
            }
           System.out.println();
        }
         System.out.println(mainlist);
    }*/
               // multidimensional ArrayList
               /*
    public static void main(String args[]) {
        ArrayList<ArrayList<Integer>> mainList=new ArrayList<>();
        ArrayList<Integer> list1=new ArrayList<>();
        ArrayList<Integer> list2=new ArrayList<>();
        ArrayList<Integer> list3=new ArrayList<>();
      
        for(int i= 1;i<=5;i++){
            list1.add(i*1);
            list2.add(i*2);
            list3.add(i*3);
            
        }
          mainList.add(list1) ;
            mainList.add(list2);
            mainList.add(list3);
            System.out.println(mainList);
            // nested loops
            for(int i=0;i<mainList.size();i++){
                ArrayList<Integer> currlist=mainList.get(i);
                for(int j=0;j<currlist.size();j++){
                    System.out.print(currlist.get(j)+" ");
                }
                System.out.println();
            }
    }*/
//}

