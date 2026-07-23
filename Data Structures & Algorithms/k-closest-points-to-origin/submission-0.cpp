class cmp{
    public:
        bool operator()(pair<int,pair<int,int>>a,pair<int,pair<int,int
        >>b){
            return a.first>b.first;
        }
};


class Solution {
public:
    vector<vector<int>> kClosest(vector<vector<int>>& points, int k) {
        priority_queue<pair<int,pair<int,int>>, vector<pair<int,pair<int,int>>>, cmp>pq;

        for(auto coord:points){
            int x=coord[0];
            int y=coord[1];
            int dist=x*x+y*y;
            pq.push({dist,{x,y}});
            
        }
        vector<vector<int>>ans;
        while(k-- && !pq.empty()){
            auto x= pq.top();
            pq.pop();
            vector<int>temp;
            temp.push_back(x.second.first);
            temp.push_back(x.second.second);
            ans.push_back(temp);
        }

        return ans;
    }
};
