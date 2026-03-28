
// import java.util.*;
// public class HeapsPriorityQueue {

   /* static class student implements Comparable<student> { // overiding
  String name;
  int rank;

  public student(String name , int rank){
    this.name=name;
    this.rank=rank;
  }

  @Override
  public int compareTo(student s2){
    return this.rank-s2.rank;
  }
    }
    public static void main(String[] args) {
        // arrays
        PriorityQueue<student> pq = new PriorityQueue<>();

        pq.add(new student("A", 4));
        pq.add(new student("B",5));
        pq.add(new student("C", 2));
        pq.add(new student("D", 12));
        while (!pq.isEmpty()) {
            System.out.println(pq.peek().name+"->"+pq.peek().rank);
            pq.remove();
        }
    }*/



      // Nearby Cars

    
    /*  static class point implements Comparable<point> {
        int x;
        int y;
        int distsq;
        int idx;
        public point(int x, int y, int distsq, int idx){
           this.x =x;
           this.y =y;
           this.distsq=distsq;
           this.idx=idx;
        }

        @Override
        public int compareTo(point p2){
          return this.distsq - p2.distsq;  // asscending
        }
      }

      public static void main(String[] args) {
        int pts[][] = {{3,3}, {5, -1}, {-2, 4}};
        int k =2;

        PriorityQueue<point> pq =new PriorityQueue<>();
        for(int i=0; i<pts.length; i++){
          int distsq = pts[i][0]*pts[i][0] + pts[i][1]*pts[i][1];
          pq.add(new point(pts[i][0],pts[i][1], distsq, i));
        }
         // Nearest cars
         for(int i=0; i<k; i++){
          System.out.println("c"+ pq.remove().idx);
        }
      }*/



       // Connect N ropes


/*       public static void main(String[] args) {
  int ropes []= {2,3,3,4,6};
  PriorityQueue<Integer> pq =new PriorityQueue<>();
  for(int i =0; i<ropes.length; i++){
    pq.add(ropes[i]);
  }
  int cost =0;
  while (pq.size()>1) {
    int min = pq.remove();
    int min2 = pq.remove();

    cost += min+min2;
    pq.add(min+min2);
  }
  System.out.println(cost);
}*/



 // Weakers Soldier

 /*
 static class row implements Comparable<row> {
  int Soldier;
  int idx;

  public row(int Soldier, int idx){
    this.Soldier =Soldier;
    this.idx =idx;
  }

  @Override
  public int compareTo(row r2){
    if (this.Soldier == r2.Soldier) {
      return this.idx - r2.idx;
    }
    else{
      return this.Soldier -r2.Soldier;
    }
  }
 }

 public static void main(String[] args) {
  int army [][]= {{1 ,0 , 0, 0,},
                   {1, 1, 1, 1},
                  {1, 0, 0, 0},
                  {1, 0, 0, 0}};
  int k =2;
  
  PriorityQueue<row> pq = new PriorityQueue<>();
  for(int i =0; i<army.length; i++){
    int count =0;
    for(int j =0; j<army[0].length; j++){
      count += army[i][j] ==1 ? 1 :0;
    }
    pq.add(new row(count, i));
  }
  for(int i =0; i<k ; i++){
    System.out.println("R" + pq.remove().idx);
  }
 }
}
*/