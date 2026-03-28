/*
import java.util.*;
public class HashingAdvance {
   static class HashMap<k, v> {  // generic
   
    private class Node{
        k key;
        v value;
        public Node(k key, v value){
            this.key = key;
            this.value = value;
        }
    }
    private int N;
    private int n;

    private LinkedList<Node> buckets []; //N = bucket length
    @SuppressWarnings("Unchecked")
    public HashMap(){
    this.N=4;
    this.buckets = new LinkedList[4];
    for(int i=0; i<4; i++){
        this.buckets[i] = new LinkedList<>();
    }
    }

    private int hashFunction(k key){
        int hc = key.hashCode();
        return Math.abs(hc) % N;
    }

    private int SearchInLL(k key, int bi){
        LinkedList<Node> ll = buckets[bi];
        int di =0;
        for(int i=0; i<ll.size(); i++){
            Node node = ll.get(i);
            if (node.key == key) {
                return di;
            }
            di++;
        }
        return -1;
    }

    @SuppressWarnings("Unchecked")
    private void rehash(){
        LinkedList<Node> oldBuck[] = buckets;
        buckets = new LinkedList[N*2];
        N= 2*N;
        for(int i=0; i<buckets.length; i++){
            buckets[i] = new LinkedList<>();
        }

          //node -> add in bucket
          for(int i=0; i<buckets.length; i++){
            LinkedList <Node>  ll = oldBuck[i];
            for(int j=0; j<ll.size(); j++){
                Node node = ll.remove();
                put(node.key , node.value);
            }
          }
    }

        // put
    public void put(k key , v value){
        int bi = hashFunction(key);
        int di = SearchInLL(key, bi);

        if (di!= -1) {
            Node node = buckets[bi].get(di);
            node.value =value;
        }
        else{
            buckets[bi].add(new Node(key, value));
            n++;
        }
        double lambda = (double) n / N;
        if (lambda > 2.0) {
            rehash();
        }
    }

    // containskey
    public boolean containsKey(k key){
         int bi = hashFunction(key);
        int di = SearchInLL(key, bi);

        if (di!= -1) { // valid
          return true;
        }else{
            return false;
        }
    }

     // get
     public v get (k key){
         int bi = hashFunction(key);
        int di = SearchInLL(key, bi);

        if (di!= -1) {
            Node node = buckets[bi].get(di);
            return node.value;
        }else{
            return null;
        }
     }

      //remove
      public v remove(k key){
         int bi = hashFunction(key);
        int di = SearchInLL(key, bi);

        if (di!= -1) {
            Node node = buckets[bi].remove(di);
            n--;
            return node.value ;
        }else{
           return null;
        }
      }

      // set
      public ArrayList<k> keyset(){
       ArrayList <k> keys = new ArrayList<>();
      for(int i=0; i<buckets.length; i++){
        LinkedList <Node> ll = buckets[i];
        for (Node node : ll) {
            keys.add(node.key);
        }
      }
      return keys;
    }
   

     // isEmpty
     public boolean isEmpty(){
        return n ==0;
     }
   } 



   public static void main(String[] args) {
    HashMap<String, Integer> hm = new HashMap<>();

    hm.put("India", 100);
    hm.put("china", 150);
    hm.put("Us", 50);
    hm.put("nepal", 5);

    ArrayList<String> keys = hm.keyset();
    for(String key: keys){
        System.out.println(key);
    }
    System.out.println(hm.get("china"));
    System.out.println(hm.remove("India"));
   }
}
*/