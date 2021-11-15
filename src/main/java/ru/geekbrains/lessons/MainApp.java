package ru.geekbrains.lessons;

public class MainApp {
    public static void main(String[] args) {
        Graph graph = new Graph(10);
        graph.addEdge(0, 1);
        graph.addEdge(0, 4);
        graph.addEdge(1, 4);

        graph.addEdge(0, 2);
        graph.addEdge(1, 5);
        graph.addEdge(5, 2);

        graph.addEdge(5, 6);
        graph.addEdge(5, 9);
        graph.addEdge(6, 9);

        graph.addEdge(5, 8);
        graph.addEdge(8, 9);

        graph.addEdge(6, 7);
        graph.addEdge(9, 7);
        graph.addEdge(6, 3);
        graph.addEdge(3, 7);
        System.out.println("      2               3");
        System.out.println("    /    \\           /|");
        System.out.println("  /        \\        / |");
        System.out.println(0 + " --- " + 1 + " --- " + 5 + " --- " + 6 + "   |" );
        System.out.println(" \\   /     /  \\  /  \\ |");
        System.out.println("   4      8 --- 9 --- 7");
        System.out.println();

        int source = 4;
        int dist = 3;
        BreadthFirstPaths bfp = new BreadthFirstPaths(graph, source);
        if (bfp.hasPathTo(dist)) {
            System.out.println("Кратчайший путь из " + source + " в " + dist + " :"+ bfp.pathTo(dist));
        }
    }
}
