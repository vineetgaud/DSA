 //import java.util.*;
//public class Hashing {



  // valid Anagram 

 /*public static boolean isAnagram(String s, String t){
    HashMap<Character, Integer> map = new HashMap<>();
    for(int i=0; i<s.length(); i++){
      char ch = s.charAt(i);
      map.put(ch, map.getOrDefault(ch, 0) +1);
    }

    for(int i=0; i<t.length(); i++){
      char ch =t.charAt(i);
      if (map.get(ch)!= null) {
        if (map.get(ch) == 1) {
          map.remove(ch);
        }else{
          map.put(ch, map.get(ch)-1);
        }
      }else{
        return false;
      }
    }
    return map.isEmpty();
  }*/



   
       // Find Itinery from Ticket

     /*  public static String getStart(HashMap<String, String> ticket){
        HashMap<String, String> revMap = new HashMap<>();
        
        for ( String key : ticket.keySet()) {
          revMap.put(ticket.get(key), key);
        }

        for(String key : ticket.keySet()){
          if (!revMap.containsKey(key)) {
            return key;
          }
        }
        return null;
       }*/




//  public static void main(String[] args) {
        
        /*
           // Create
           HashMap<String, Integer> hm = new HashMap<>();
           // Insert  O(1)
           hm.put("india", 100);
           hm.put("china", 150);
           hm.put("Us", 50);
           System.out.println(hm);

           // Get - O(1)
           int population = hm.get("india"); 
           System.out.println(population);

           // Containskey - O(1)
           System.out.println(hm.containsKey("india"));
           System.out.println(hm.containsKey("russia"));

           // remove -O(1)
           System.out.println(hm.remove("china"));
           System.out.println(hm);

           // size
           System.out.println(hm.size());

           // isEmpty
           System.out.println(hm.isEmpty());

           // clear
             hm.clear();*/


             // Iteration
            /* HashMap<String, Integer> hm = new HashMap<>();
              hm.put("india", 100);
              hm.put("china", 150);
              hm.put("Us", 50);
              hm.put("russia", 6);
              hm.put("nepal", 5);
              
              //iterate
              Set<String> keys =hm.keySet();
              System.out.println(keys);
              for (String k : keys) {
                System.out.println("key ="+k+ ", value ="+ hm.get(k));
              }*/



 /*             
 // LinkedHashMap
 LinkedHashMap<String, Integer> lhm = new LinkedHashMap<>();
 lhm.put("india", 100);
 lhm.put("china", 150);
 lhm.put("US", 50);
System.out.println(lhm);

 // hashmap
  HashMap<String, Integer> hm = new HashMap<>();
 hm.put("india", 100);
 hm.put("china", 150);
 hm.put("US", 50);
 System.out.println(hm);*/




/*
 // Tree Map
  TreeMap<String, Integer> tm = new TreeMap<>();
 tm.put("India", 100);
 tm.put("China", 150);
 tm.put("US", 50);
 tm.put("Indonesia", 5);
System.out.println(tm);
*/



   // Majority Element
   /*
   int arr[] = {1, 3, 2, 5, 1, 3, 1, 5, 1};
   HashMap<Integer, Integer> map = new HashMap<>();
   for(int i=0; i<arr.length; i++){
    if (map.containsKey(arr[i])) {
      map.put(arr[i], map.get(arr[i])+1);
    }else{
      map.put(arr[i], 1);
    }
   }
   Set<Integer> keySet = map.keySet();
   for (Integer key : keySet) {
    if (map.get(key)> arr.length/3) {
      System.out.println(key);
    }
   }*/




    // Valid Anagram

    /*String s = "race";
    String t = "care";
    System.out.println(isAnagram(s, t));*/






    // HashSet
    // operatoin

  /*  HashSet <Integer> set = new HashSet<>();
     set.add(1);
      set.add(2);
      set.add(4);
      set.add(2);
      set.add(1);
        System.out.println(set);
        set.remove(4);
        System.out.println(set);
        if (set.contains(2)) {
          System.out.println("set contains 2");
        }
        System.out.println(set.size());*/



          // Iteration on Hashset
      /*  HashSet <String> cities = new HashSet<>();
        cities.add("Delhi");
        cities.add("Mumbai");
        cities.add("Noida");
        cities.add("Bengaluru");

        // Iterator it = cities.iterator();
        // while (it.hasNext()) {
        //   System.out.println(it.next());
        // }

          //  OR Adavance Loop
          for (String city : cities) {
            System.out.println(city);
          }*/





          //Linked  HashSet
      /*  LinkedHashSet <String> lhs = new LinkedHashSet<>();
        lhs.add("Delhi");
        lhs.add("Mumbai");
        lhs.add("Noida");
        lhs.add("Bengaluru");
        System.out.println(lhs);
        lhs.remove("Delhi");
        System.out.println(lhs);*/





        // Tree Set
       /* TreeSet <String> ts = new TreeSet<>();
        ts.add("Delhi");
        ts.add("Mumbai");
        ts.add("Noida");
        ts.add("Bengaluru");
        System.out.println(ts);
        ts.remove("Delhi");
        System.out.println(ts);*/




        // Count Distinct Element
       /* int num [] = {4, 3, 2, 5, 6, 7, 3, 4, 2, 1};
        HashSet<Integer> set = new HashSet<>();
        for(int i=0; i<num.length; i++){
          set.add(num[i]);

        }
        System.out.println("ans =" + set.size());*/





        // union & Intersection of 2 arrays
       /* int arr1[] = {7, 3, 9};
        int arr2 []= {6, 3, 9, 2, 9, 4};
          HashSet<Integer> set = new HashSet<>();
          //Union
          for(int i=0; i<arr1.length; i++){
            set.add(arr1[i]);
          }
          for(int i=0; i< arr2.length; i++){
            set.add(arr2[i]);
          }
          System.out.println("Union ="+ set.size());

          // intersection
          set.clear();
           for(int i=0; i<arr1.length; i++){
            set.add(arr1[i]);
          }
          int Count =0;
          for(int i=0; i<arr2.length; i++){
           if ( set.contains(arr2[i])){
            Count++;
            set.remove(arr2[i]);
           }
          }
          System.out.println("intersection ="+Count);*/





          // Find Itinery from Ticket
        /*  HashMap<String, String> tickets = new HashMap<>();
          tickets.put("chennai", "Bengaluru");
          tickets.put("Mumbai", "Delhi");
          tickets.put("Goa", "chennai");
          tickets.put("Delhi", "Goa");

          String start = getStart(tickets);
          System.out.print(start);
          for (String key : tickets.keySet()) {
            System.out.print("->"+ tickets.get(start));
            start = tickets.get(start);
          }
          System.out.println();*/
    //  }
    //}
  