class Solution {
public:
    vector<vector<int>> insert(vector<vector<int>>& intervals, vector<int>& newInterval) {
        int n= intervals.size();
        int target= newInterval[0];
        int low=0, high=n-1;

        while(low<=high){

            int mid=(low+high)/2;
            if(intervals[mid][0]< target){
                low=mid+1;
            }
            else{
                high=mid-1;
            }
        }
        intervals.insert(intervals.begin()+low , newInterval);


        for(int i=1;i<intervals.size();i++){
            int prev= intervals[i-1][1];
            if(prev>=intervals[i][0]){
                if(prev<intervals[i][1]){
                    intervals[i-1][1]=intervals[i][1];
                }

                
                intervals.erase(intervals.begin()+i);
                i--;
            }
        }
        return intervals;
        
    }
};



