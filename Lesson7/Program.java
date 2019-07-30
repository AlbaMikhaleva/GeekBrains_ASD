package Lesson7;

import java.util.Random;

public class Program {
    public static void main(String[] args) {
        Graph graph = new Graph(10);
        /*graph.addEdge(0, 6);
        graph.addEdge(0, 1);
        graph.addEdge(0, 2);
        graph.addEdge(5, 3);
        graph.addEdge(5, 4);
        graph.addEdge(5, 0);
        graph.addEdge(4, 6);
        graph.addEdge(4, 3);

        graph.addEdge(7, 8);

        graph.addEdge(9, 10);
        graph.addEdge(9, 11);
        graph.addEdge(9, 12);
        graph.addEdge(11, 12);*/

        graph.addEdge(0, 1);
        graph.addEdge(1, 2);
        graph.addEdge(1, 3);
        graph.addEdge(0, 5);
        graph.addEdge(5, 6);
        graph.addEdge(6, 8);
        graph.addEdge(5, 8);
        graph.addEdge(0, 4);
        graph.addEdge(4, 9);

    //System.out.println(graph.adjList(5));

        /*DepthFirstPaths dfs = new DepthFirstPaths(graph, 0);
        System.out.println(dfs.hasPathTo(5));
        if (dfs.hasPathTo(5)) {
            System.out.println(dfs.pathTo(5));
        }
        System.out.println(dfs.hasPathTo(9));*/

    BreadthFirstSearch bfs = new BreadthFirstSearch(graph, 9);
        System.out.println(bfs.hasPathTo(0));
        if(bfs.hasPathTo(0))

    {
        System.out.println(bfs.pathTo(0));
        System.out.println(bfs.distTo(0));
    }
}
}
