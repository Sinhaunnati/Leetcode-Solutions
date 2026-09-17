class Solution {

    private boolean dfs(int node, int col, int[] color,
                        ArrayList<ArrayList<Integer>> adj) {

        color[node] = col;

        for (int it : adj.get(node)) {

            if (color[it] == -1) {
                if (dfs(it, 1 - col, color, adj) == false) {
                    return false;
                }
            }
            else if (color[it] == col) {
                return false;
            }
        }

        return true;
    }

    public boolean isBipartite(int[][] graph) {

        int n = graph.length;

        int[] color = new int[n];

        Arrays.fill(color, -1);

        ArrayList<ArrayList<Integer>> adj = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            adj.add(new ArrayList<>());

            for (int node : graph[i]) {
                adj.get(i).add(node);
            }
        }

        for (int i = 0; i < n; i++) {

            if (color[i] == -1) {

                if (dfs(i, 0, color, adj) == false) {
                    return false;
                }
            }
        }

        return true;
    }
}