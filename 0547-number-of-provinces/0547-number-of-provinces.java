import java.util.*;

class Solution {

    public int findCircleNum(int[][] isConnected) {

        int n = isConnected.length;

        ArrayList<ArrayList<Integer>> adj = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            adj.add(new ArrayList<>());
            for (int j = 0; j < n; j++) {
                adj.get(i).add(isConnected[i][j]);
            }
        }

        return numProvince(adj, n);
    }

    private static void dfs(int node,
                            ArrayList<ArrayList<Integer>> adjLs,
                            int[] vis) {

        vis[node] = 1;

        for (Integer it : adjLs.get(node)) {
            if (vis[it] == 0) {
                dfs(it, adjLs, vis);
            }
        }
    }

    static int numProvince(ArrayList<ArrayList<Integer>> adj, int v) {

        ArrayList<ArrayList<Integer>> adjLs = new ArrayList<>();

        for (int i = 0; i < v; i++) {
            adjLs.add(new ArrayList<>());
        }

        for (int i = 0; i < v; i++) {
            for (int j = 0; j < v; j++) {
                if (adj.get(i).get(j) == 1 && i != j) {
                    adjLs.get(i).add(j);
                }
            }
        }

        int[] vis = new int[v];
        int count = 0;

        for (int i = 0; i < v; i++) {
            if (vis[i] == 0) {
                count++;
                dfs(i, adjLs, vis);
            }
        }

        return count;
    }
}