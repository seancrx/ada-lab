import java.io.*;
import java.util.Scanner;
import java.util.*;

class underground {
    static int N = 500;
    static double[][] edges = new double[N][N];
    static TreeMap<Integer, String> stationNames = new TreeMap<Integer, String>();

    static ArrayList<String> convert(ArrayList<Integer> m) {
        ArrayList<String> z = new ArrayList<String>();
        for (Integer i : m)
            z.add(stationNames.get(i));
        return z;
    }

    static HashSet<ArrayList<String>> convert(HashSet<ArrayList<Integer>> paths) {
        HashSet<ArrayList<String>> k = new HashSet<ArrayList<String>>();
        for (ArrayList<Integer> p : paths)
            k.add(convert(p));
        return k;
    }

    public static void main(String[] args) throws Exception {
        for (int i = 0; i < N; i++)
            for (int j = 0; j < N; j++)
                edges[i][j] = 0.0;
        Scanner s = new Scanner(new FileReader("edges.txt"));
        String z = s.nextLine();
        while (s.hasNext()) {
            z = s.nextLine();
            String[] results = z.split(",");
            edges[Integer.parseInt(results[0])][Integer.parseInt(results[1])] = 1.0;
            edges[Integer.parseInt(results[1])][Integer.parseInt(results[0])] = 1.0;
        }
        s = new Scanner(new FileReader("stations.txt"));
        z = s.nextLine();
        while (s.hasNext()) {
            z = s.nextLine();
            String[] results = z.split(",");
            stationNames.put(Integer.parseInt(results[0]), results[3]);
        }
        graph G = new graph(edges);
        int st = Integer.parseInt(args[0]);
        int fin = Integer.parseInt(args[1]);
        System.out.println("Shortest path from " + stationNames.get(st) + " to " + stationNames.get(fin) + " is "
                + convert(G.shortestPaths(st, fin)));
    }
}