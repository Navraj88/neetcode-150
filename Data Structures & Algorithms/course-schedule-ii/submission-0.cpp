class Solution {
public:
    vector<int> findOrder(int n, vector<vector<int>>& prerequisites) {
        vector<vector<int>>adj(n);
        vector<int>indegree(n,0);

        for(auto& pre: prerequisites){
            adj[pre[1]].push_back(pre[0]);
            indegree[pre[0]]++;
        }

        queue<int>q;
        for(int i=0;i<n;i++){
            if(indegree[i]==0){
                q.push(i);
            }
        }

        vector<int>ans;
        int cnt=0;

        while(!q.empty()){
            int curr= q.front();
            q.pop();
            cnt++;
            ans.push_back(curr);
            for(int x: adj[curr]){
                indegree[x]--;
                if(indegree[x]==0){
                    q.push(x);
                }
            }
        }

        if(cnt==n) return ans;
        ans.clear();
        return ans;



       

    }
};
