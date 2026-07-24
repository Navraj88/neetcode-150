class Solution {
public:
    bool dfs(int node,vector<vector<int>>& adj,vector<bool>& visited, int parent){
        visited[node]=true;

        for(int neighbour: adj[node]){
            if(neighbour==parent) continue;
            if(visited[neighbour]) return false;
            if(!dfs(neighbour,adj,visited,node)) return false;
        }
        return true;
    }
    bool validTree(int n, vector<vector<int>>& edges) {
        vector<bool>visited(n,false);
        vector<vector<int>>adj(n);

        for(auto& edge:edges){
            adj[edge[0]].push_back(edge[1]);
            adj[edge[1]].push_back(edge[0]);
        }

        if(!dfs(0,adj,visited,-1)) return false;

        for(bool v:visited){
            if(!v) return false;
        }

        return edges.size()==n-1;
    }
};
