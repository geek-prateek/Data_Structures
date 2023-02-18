package Graph;

import java.util.*;
import java.util.LinkedList;

public class BFS {

//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        int n = sc.nextInt();
//        int m = sc.nextInt();
//
//        List<List<Integer>> graph = new ArrayList<>();
//
//        for (int i = 0; i < n; i++) {
//            graph.add(new ArrayList<>());
//
//        }
//
//        for (int i = 0; i < m; i++) {
//            int u = sc.nextInt();
//            int v = sc.nextInt();
//
//        }
//        bfs(graph,0);
//    }
    public static void bfs(List<List<Integer>> graph, int src){
        Queue<Integer> q = new LinkedList<>();
        boolean[] vis = new boolean[graph.size()];

        q.add(src);
        vis[src] = true;

        while (q.size()>0){
            int rem = q.remove();

            //processing the removed element
            System.out.println(rem);

            //all the nbrs
            List<Integer> nbrs = graph.get(rem);
            for(int nbr:nbrs){
                if(vis[nbr]==false){
                    q.add(nbr);
                    vis[nbr] = true;
                }
            }
        }
    }
}
