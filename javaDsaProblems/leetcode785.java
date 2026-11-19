package javaDsaProblems;
import java.util.*;

public class leetcode785 {
    
}

class Solution {

    public boolean dfs(int node, int[] coloured, int col, int[][] adj) {
        coloured[node] = col;
        for (int nbr : adj[node]) {
            if (coloured[nbr] == -1) {
                // 1 - col se flip karo se (0 ka 1, 1 ka 0)
                if (!dfs(nbr, coloured, 1 - col, adj)) {
                    return false;
                }
            } 
            else if (coloured[node] == coloured[nbr]) {
                return false;
            }
        }
        return true;
    }

    public boolean isBipartite(int[][] graph) {
        
        int n = graph.length;
        int[][] adj = graph;

        int[] coloured = new int[n];
        for (int i = 0; i < n; i++) {
            coloured[i] = -1;
        }

        for (int i = 0; i < n; i++) {
            if (coloured[i] == -1) {
                if (!dfs(i, coloured, 0, adj)) {
                    return false;
                }
            }
        }

        return true;
    }

}
