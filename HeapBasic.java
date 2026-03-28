/*
import java.util.*;

public class HeapBasic {

    static class Heap{
        ArrayList<Integer> arr =new ArrayList<>();

        public void add(int data){
            //add at last
            arr.add(data);

            int x =arr.size()-1; // x is child index
            int par = (x-1)/2; // par idx
            while (arr.get(x)< arr.get(par)) {
                //swap
                int temp =arr.get(x);
                arr.set(x,arr.get(par));
                arr.set(par,temp);

                x= par;
                par=(x-1)/2;
            }
        }
     // peek
        public int peek(){
            return arr.get(0);
        }

       // Heapify
       private void Heapify(int i){
        int left =2*i+1;
        int right= 2*i+2;
        int minIdx =i;

        if (left<arr.size()&& arr.get(minIdx)>arr.get(left)) {
            minIdx = left;
        }
        if (right<arr.size()&& arr.get(minIdx)>arr.get(right)){
            minIdx =right;
        }
        if (minIdx!=i) {
            // Swap
            int temp =arr.get(i);
            arr.set(i,arr.get(minIdx));
            arr.set(minIdx,temp);

            Heapify(minIdx);
        }
       }

        // Delete Node
        public int remove(){
            int data = arr.get(0);
            // step 1 - swap first & last
            int temp = arr.get(0);
            arr.set(0,arr.get(arr.size()-1));
            arr.set(arr.size()-1,temp);

            // step 2 - delete last

            arr.remove(arr.size()-1);
            // step 3 - heapify
            Heapify(0);
            return data;
        }

         // Is Empty
         public boolean isEmpty(){
            return arr.size() == 0;
         }
        }

          // Heap Sort
          public static void HeapSort(int arr[]){
            // step 1 - build maxheap
            int n = arr.length;
            for(int i=n/2; i>=0; i--){
                heapify(arr, i, n);
            }

             //step 2 - push largest at end
             for(int i=n-1; i>=0; i--){
                // swap (largest first with last)
                int temp = arr[0];
                arr[0] = arr[i];
                arr[i] = temp;

                heapify(arr, 0, i);
             }
          }
         public static void heapify(int arr[], int i, int size){
              int left =2*i+1;
              int right= 2*i+2;
              int maxIdx =i;

        if (left<size&& arr[left]>arr[maxIdx]) {
            maxIdx = left;
        }
        if (right<size&& arr[right]>arr[maxIdx]){
            maxIdx =right;
        }
        if (maxIdx!=i) {
            // Swap
            int temp =arr[i];
            arr[i] = arr[maxIdx];
            arr[maxIdx] = temp;

            heapify(arr ,maxIdx, size);
        }
         } 
    
    public static void main(String[] args) {
        /*
     Heap h =new Heap();
     h.add(3);
     h.add(4);  
     h.add(1);
     h.add(5); 

     while (!h.isEmpty()) {
        System.out.println(h.peek());
        h.remove();
     }*/

     /*
     int arr[] ={1,2,4,5,3};
     HeapSort(arr);
     // print
     for(int i =0; i<arr.length; i++){
        System.out.println(arr[i]+ " ");
     }
     System.out.println();
    }
}
*/