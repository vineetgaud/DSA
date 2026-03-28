
/*import java.util.*;
public class Graph {
    
    static class Edge {
        int src;
        int dest;
        int wt;

        public Edge(int s, int d, int w){
            this.src = s;
            this.dest= d;
            this.wt = w;
        }
    }
*/

/*    public static void main(String[] args) {
        int v =5;
        ArrayList<Edge> [] graph = new ArrayList[v];
        for(int i=0; i<v; i++){
            graph[i] = new ArrayList<>();
        }    
        //0 vertex
        graph[0].add(new Edge(0, 1, 5));
        // 1 vertex
        graph[1].add(new Edge(1, 0, 5));
        graph[1].add(new Edge(1, 2, 1));
        graph[0].add(new Edge(1, 3, 3));
        // 2 vetrx
        graph[2].add(new Edge(2, 1, 1));
         graph[2].add(new Edge(2, 3, 1));
          graph[2].add(new Edge(2, 4, 4));
          // 3 vertex
           graph[3].add(new Edge(3, 1, 3));
            graph[3].add(new Edge(3, 2, 1));
            // 4 vertex
             graph[4].add(new Edge(4, 2, 2));

             // 2's neighbors
             for(int i=0; i<graph[2].size(); i++){
                Edge e = graph[2].get(i);
                System.out.println(e.dest);
             }*/


            // BFS

           
           /* static void createGraph(ArrayList<Edge> graph[]){
                for(int i=0; i<graph.length; i++){
                    graph[i] = new ArrayList<>();
                }


            graph[0].add(new Edge(0, 1, 1)); 
            graph[0].add(new Edge(0, 2, 1));

            graph[1].add(new Edge(1, 0, 1));
            graph[1].add(new Edge(1, 3, 1));
             
            graph[2].add(new Edge(2, 0, 1));
            graph[2].add(new Edge(2, 4, 1));

            graph[3].add(new Edge(3, 1, 1));
            graph[3].add(new Edge(3, 4, 1));
            graph[3].add(new Edge(3, 5, 1));

            graph[4].add(new Edge(4, 2, 1));
            graph[4].add(new Edge(4, 3, 1));
            graph[4].add(new Edge(4, 5, 1));

             graph[5].add(new Edge(5, 3, 1));
             graph[5].add(new Edge(5, 4, 1));
             graph[5].add(new Edge(5, 6, 1));

             graph[6].add(new Edge(6, 5, 1));

            }*/
    
            
           /* public static void bfs(ArrayList<Edge> [] graph){
                 boolean vis[] = new boolean[graph.length];
                 for(int i=0; i<graph.length; i++){
                    if (! vis[i]) {
                        bfsutil(graph, vis);
                    }
                 }
            }
            
            public static void bfsutil(ArrayList<Edge> [] graph , boolean vis[]){
                Queue<Integer> q = new LinkedList<>();
                q.add(0);

                while (!q.isEmpty()) {
                    int curr = q.remove();

                    if (!vis[curr]) {
                        System.out.print(curr+"");
                        vis[curr] = true;
                        for(int i=0; i<graph[curr].size(); i++){
                            Edge e = graph[curr].get(i);
                            q.add(e.dest);
                        }
                    }
                }
             }

            
            public static void dfs(ArrayList<Edge> [] grph){
                boolean vis[] = new boolean[grph.length];
                for(int i=0; i<grph.length; i++){
                    dfsutil(grph, i, vis);
                }
            }
            
             public static void dfsutil(ArrayList<Edge> [] grph, int curr, boolean vis[]){
                // visit
                System.out.print(curr+" ");
                vis[curr] = true;

                for(int i=0; i<grph[curr].size(); i++){
                    Edge e = grph[curr].get(i);
                    if (!vis[e.dest]) {
                        dfsutil(grph, curr, vis);
                    }
                }
             }*/


               // detect Cycle
              /* static void createGraph(ArrayList<Edge> graph[]){
                for(int i=0; i<graph.length; i++){
                    graph[i] = new ArrayList<>();
                }
            graph[0].add(new Edge(0, 1,1 )); 
            graph[0].add(new Edge(0, 2,1));
            graph[0].add(new Edge(0,3,1));

            graph[1].add(new Edge(1,0 ,1 ));
            graph[1].add(new Edge(1, 2, 1));
             
            graph[2].add(new Edge(2, 0, 1));
            graph[2].add(new Edge(2, 1, 1));

            graph[3].add(new Edge(3, 0, 1));
            graph[3].add(new Edge(3, 4, 1));

            graph[4].add(new Edge(4, 3, 1));
            
        }*/



        /*public static boolean detectCycleutil(ArrayList<Edge> []graph, boolean vis[], int curr, int par){
            vis[curr] = true;
            for(int i=0; i<graph[curr].size(); i++){
                Edge e = graph[curr].get(i);

                // case 3
                if (!vis[e.dest]) {
                    if (detectCycleutil(graph, vis, e.dest, curr)) {
                        return true;
                    }
                }
                // case 1
                else if (vis[e.dest] && e.dest != par) {
                    return true;
                }
                // case 2 -> do nothing -> continue
                
            }
            return false;
        }

         public static boolean detectCycle(ArrayList<Edge> []graph){
            boolean vis [] = new boolean[graph.length];
            for(int i=0; i<graph.length; i++){
                if (!vis[i]) {
                    if (detectCycleutil(graph, vis, i, -1)) {
                        return true;
                    } // cycle exist in  one of the part
                }
            }
            return false;
         }*/


         
           // Bipartite Graph
         
               /*static void createGraph(ArrayList<Edge> graph[]){
                for(int i=0; i<graph.length; i++){
                    graph[i] = new ArrayList<>();
                }
            graph[0].add(new Edge(0, 1,1 )); 
            graph[0].add(new Edge(0, 2,1));
           

            graph[1].add(new Edge(1,0 ,1 ));
            graph[1].add(new Edge(1, 3, 1));
             
            graph[2].add(new Edge(2, 0, 1));
            graph[2].add(new Edge(2, 4, 1));

            graph[3].add(new Edge(3, 1, 1));
            graph[3].add(new Edge(3, 4, 1));
           
            graph[4].add(new Edge(4, 2, 1));
            graph[4].add(new Edge(4, 3, 1));
            
        }*/

       /* public static boolean isBipartite(ArrayList<Edge> [] graph){
            int col [] = new int[graph.length];
            for(int i=0; i<col.length; i++){
                col[i] = -1;
            }

            Queue<Integer> q = new LinkedList<>();
            for(int i=0; i<graph.length; i++){
                if (col[i] == -1) {
                    q.add(i);
                    col[i] = 0;
                    while (!q.isEmpty()) {
                        int curr = q.remove();
                        for(int j=0; j<graph[curr].size(); j++){
                            Edge e = graph[curr].get(j);
                            if (col[e.dest] == -1) {
                                int nextcol = col[curr] == 0 ? 1 :0;
                                col[e.dest] = nextcol;
                                q.add(e.dest);
                            }
                            else if (col[e.dest] == col[curr]) {
                                return false;
                        
                            }
                        }
                    }
                }
            }
            return true;
        }*/



           //Cycle Detection directed graph
           /*  static void createGraph(ArrayList<Edge> graph[]){
                for(int i=0; i<graph.length; i++){
                    graph[i] = new ArrayList<>();
                }
            graph[0].add(new Edge(0, 2, 1 )); 
            graph[1].add(new Edge(1, 0, 1));
            graph[2].add(new Edge(2 ,3 ,1 ));
            graph[3].add(new Edge(3, 0, 1));
             }*/



             /* public static boolean detectCycledir(ArrayList<Edge> []graph){
            boolean vis [] = new boolean[graph.length];
             boolean stack [] = new boolean[graph.length];
             for(int i=0; i<graph.length; i++){
                if (!vis[i]) {
                   if (iscycleUtildir(graph, i, vis, stack)) {
                    return true;
                   } 
                }
             }
             return false;
        }

        public static boolean iscycleUtildir(ArrayList<Edge> [] graph, int curr, boolean vis[], boolean stack[]){
              vis [curr] = true;
              stack[curr] = true;

             for(int i=0; i<graph.length; i++){
                Edge e = graph[curr].get(i);
                if (stack[e.dest]) {   // cycle
                    return true;
                }
                if (!vis[e.dest] && iscycleUtildir(graph, e.dest, vis, stack)) {
                    return true;
                }
             }
             stack[curr] = false;
             return false;
        }*/



        
        // Topological Sorting
         /*static void createGraph(ArrayList<Edge> graph[]){
                for(int i=0; i<graph.length; i++){
                    graph[i] = new ArrayList<>();
                }
            graph[2].add(new Edge(2, 3, 1));
            graph[3].add(new Edge(3, 1, 1));

            graph[4].add(new Edge(4, 0, 1));
            graph[4].add(new Edge(4, 1, 1));
           
            graph[5].add(new Edge(5, 0, 1));
            graph[5].add(new Edge(5, 2, 1));
         }*/

       /* public static void topSortutil(ArrayList<Edge> [] graph, int curr, boolean vis[], Stack<Integer> s){
            vis[curr] = true;

            for(int i=0; i<graph[curr].size(); i++){
                Edge e = graph[curr].get(i);
                if (!vis[e.dest]) {
                    topSortutil(graph, e.dest, vis, s);
                }
            }
            s.push(curr);
        }


          public static void topSort(ArrayList<Edge> [] graph){
            boolean vis [] = new boolean[graph.length];
            Stack<Integer> s =new Stack<>();

            for(int i=0; i<graph.length; i++){
                if (!vis[i]) {
                    topSortutil(graph, i, vis, s);
                }
            }
            while (!s.isEmpty()) {
                System.out.println(s.pop());
            }
          }*/




          // all Path  from Source To together ( directed graph)

        /*  public static void printallpath(ArrayList<Edge> graph[], int src, int dest, String path){
            if (src == dest) {
                System.out.println(path+dest);
                return;
            }

            for(int i=0; i<graph[src].size(); i++){
                Edge e = graph[src].get(i);
                printallpath(graph, e.dest, dest, path+src);
            }
          }*/




          // Dijkstra's Algorithm

           /*static void createGraph(ArrayList<Edge> graph[]){
                for(int i=0; i<graph.length; i++){
                    graph[i] = new ArrayList<>();
                }
            graph[0].add(new Edge(0, 1, 2));
            graph[0].add(new Edge(0, 2, 4));
           
            graph[1].add(new Edge(1, 3, 7));
            graph[1].add(new Edge(1, 2, 1));

            graph[2].add(new Edge(2, 4, 3));
            graph[3].add(new Edge(3, 5, 1));
           
            graph[4].add(new Edge(4, 3, 2));
            graph[4].add(new Edge(4, 5, 5));
         }*/


        /* static class pair implements Comparable <pair>{
            int n;
            int path;
            public pair(int n, int path){
                this.n = n;
                this.path=path;
            }
            @Override
            public int compareTo(pair p2){
                return this.path-p2.path;
            }
         }
         public static void Dijkstra(ArrayList<Edge> graph[], int src){
            int dest[] = new int[graph.length];
            for(int i=0; i<graph.length; i++){
                if (i!=src) {
                    dest[i] = Integer.MAX_VALUE;
                }
            }

            boolean vis [] = new boolean[graph.length];
            PriorityQueue<pair> pq = new PriorityQueue<>();

            pq.add(new pair(src, 0));
            // loop
            while (!pq.isEmpty()) {
                pair curr = pq.remove();
                if (!vis[curr.n]) {
                    vis[curr.n] = true;
                    // neighbhour
                    for(int i=0; i<graph[curr.n].size(); i++){
                        Edge e = graph[curr.n].get(i);
                        int u = e.src;
                        int v = e.dest;
                        int wt = e.wt;
                        if (dest[u]+wt<dest[v]) { // update distance of src to v
                            dest [v] = dest[u]+wt;
                            pq.add(new pair(v, dest[v]));
                        }
                    }
                }
            }
            for(int i =0; i<dest.length; i++){
                System.out.println(dest[i]+" ");
            }
            System.out.println();
         }




         // Bellman Ford Algorithm
          /* static void createGraph(ArrayList<Edge> graph[]){
                for(int i=0; i<graph.length; i++){
                    graph[i] = new ArrayList<>();
                }
            graph[0].add(new Edge(0, 1, 2));
            graph[0].add(new Edge(0, 2, 4));
           
            graph[1].add(new Edge(1, 2, -4));
            graph[2].add(new Edge(2, 3, 2));
            graph[3].add(new Edge(3, 4, 4));
            graph[4].add(new Edge(4, 1, -1));
            }*/


          /*   public static void Bellman(ArrayList<Edge> graph[], int src){
            int dest[] = new int[graph.length];
            for(int i=0; i<graph.length; i++){
                if (i!=src) {
                    dest[i] = Integer.MAX_VALUE;
                }
            }
            int V = graph.length;
            // algo
            for(int i=0; i<V-1; i++){
                for(int j=0; j<graph.length; j++){
                    for(int k=0; k<graph[j].size(); k++){
                        Edge e= graph[j].get(k);
                        // u v wt
                        int u =e.src;
                        int v =e.dest;
                        int wt = e.wt;

                        // relaxation
                        if (dest[u]!= Integer.MAX_VALUE && dest[u]+wt< dest[v]) {
                            dest[v] = dest[u]+wt;
                        }
                    }
                }
            }

            for(int i=0; i<dest.length; i++){
                System.out.println(dest[i]+ " ");
            }
            System.out.println();
        }






        // Prime's Algorithm
        static void createGraph(ArrayList<Edge> graph[]){
                for(int i=0; i<graph.length; i++){
                    graph[i] = new ArrayList<>();
                }
            graph[0].add(new Edge(0, 1, 10));
            graph[0].add(new Edge(0, 2, 15));
            graph[0].add(new Edge(0, 3, 30));
           
            graph[1].add(new Edge(1, 0, 10));
            graph[1].add(new Edge(1, 3, 40));

            graph[2].add(new Edge(2, 0, 15));
            graph[2].add(new Edge(2, 3, 50));
           
            graph[3].add(new Edge(3, 1, 40));
            graph[3].add(new Edge(3, 2, 50));
           
        }

        

          static class pairA implements Comparable <pairA>{
            int v;
            int cost;
            public pairA(int v, int c){
                this.v = v;
                this.cost=c;
            }
            @Override
            public int compareTo(pairA p2){
                return this.cost-p2.cost;
            }
        }



        public static void prims(ArrayList<Edge> graph[]){
            boolean vis[] = new boolean[graph.length];
            PriorityQueue<pairA> pq = new PriorityQueue<>();

            pq.add(new pairA(0, 0));
            int finalcost = 0;
            while (!pq.isEmpty()) {
                pairA curr = pq.remove();
                if (!vis[curr.v]) {
                    vis[curr.v] = true;
                    finalcost += curr.cost;

                    for(int i=0; i<graph[curr.v].size(); i++){
                        Edge e = graph[curr.v].get(i);
                        pq.add(new pairA(e.dest, e.wt));
                    }
                }
            }
            System.out.println("final cost of mst ="+ finalcost);
        }
             public static void main(String[] args) {
                int v = 4;
                ArrayList<Edge> graph [] = new ArrayList[v];
                createGraph(graph);
               // bfs(graph);
                //dfs(graph);
               // System.out.println(detectCycle(graph));
              // System.out.println(isBipartite(graph));
              //topSort(graph);

              // all path print
            //   int src =5; int dest =1;
            //   printallpath(graph, src, dest, " ");

            // dijkstra algorthm
            // int src =0;
            // Dijkstra(graph, src);

            // bellman
           // Bellman(graph, 0);

           //Prime's Algorithm
           prims(graph);
             }
    }
*/