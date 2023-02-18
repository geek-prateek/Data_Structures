package Graph;

import java.util.Scanner;

public class Graphs {
    //Adjacency matrix representation of graphs
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt(); //no. of nodes
        int m = sc.nextInt(); //no. of edges

        int[][] graph = new int[n][n];

        for(int i=0; i<m; i++){
            int u = sc.nextInt();
            int v = sc.nextInt();

            graph[u][v] =1;
            graph[v][u] =1;

        }

    }
}
