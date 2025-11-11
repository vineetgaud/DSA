// public class DividenConquer {
  /* 
    //print array
    public static void printarr(int arr[]){
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }
            //merge sort
    public static void mergesort(int arr[],int si, int ei) {
        if (si>=ei) {
            return;
        }
        //kaam
        int mid= si+(ei-si)/2;
        mergesort(arr, si, mid);//left part
        mergesort(arr, mid+1, ei);//right part
          merge(arr, si, ei, mid);
    }
    public static void merge(int arr[],int si, int ei, int mid){
        //left(0,3)=4 right(4,6)=3->6-0+1=7
     int temp[]=new int[ei-si+1];
     int i=si; //iterator for left part
     int j=mid+1; //iterator for right part
     int k=0; // iterator for temp part
     while (i<=mid&&j<=ei) {
        if (arr[i]<arr[j]) {
            temp[k]=arr[i];
            i++;
        }
        else{
            temp[k]=arr[j];
            j++;
        }
        k++;
     }
     //left part
      while (i<=mid) {
        temp[k]=arr[i++];
      }
      // right part
      while (j<=ei) {
        temp[k]=arr[j];
      }
      //copy temp to orginal arr
      for(k=0,i=si; k<temp.length; k++,i++){
        arr[i]=temp[k];
      }
    }

    public static void main(String[] args) {
        int arr[]={6,3,9,5,2,8};
        mergesort(arr,0, arr.length-1);
        printarr(arr);
    }
*/

      //quick sort
       
      //print array      
   /* public static void printarr(int arr[]){
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }
    public static void quicksort(int arr[],int si, int ei){
      if (si>=ei) {
        return;
      }
      //last element
      int pIdx=partition(arr, si, ei);
      quicksort(arr, si, pIdx-1); //left
      quicksort(arr, pIdx+1, ei); //right
    }
    public static int partition(int arr[],int si,int ei){
      int pivot=arr[ei];//to make space for els smaller than pivot
      int i=si-1;
      for(int j=si;j<ei;j++){
        if (arr[j]<=pivot) {
        i++;
        //swap
        int temp=arr[j];
        arr[j]=arr[i];
        arr[i]=temp;
        }
      }
       i++;
        int temp=pivot;
        arr[ei]=arr[i];
        arr[i]=temp;
        return i;
    }
    public static void main(String[] args) {
      int arr[]={6,3,9,8,2,5};
      quicksort(arr, 0, arr.length-1);
      printarr(arr);
    } */
           
              //Search sorted
              /*
   public static int search(int arr[],int tar,int si, int ei){
    if (si>ei) {
      return -1;
    }
    //kaam
    int mid =si+(ei-si)/2;
    //case found
    if (arr[mid]==tar) {
      return mid;
    }

    //mid on L1
    if (arr[si]<=arr[mid]) {
      // case a left
      if (arr[si]<=tar&&tar<=arr[mid]) {
        return search(arr, tar, si, mid);
      }
      else{
        //case b right
        return search(arr, tar, mid+1, ei);
      }
    }
    // mid right
    else{
      // case c right
      if (arr[mid]<=tar&&tar<=arr[ei]) {
        return search(arr, tar, mid+1, ei);
      }
      else{
        //case d left
        return search(arr, tar, si,mid-1);
      }
    }
   }
   public static void main(String[] args) {
    int arr[]={4,5,6,7,0,1,2};
    int target=0;
    int tarIdx=search(arr, target,0,arr.length-1);
    System.out.println(tarIdx);
   }
   */
//}
