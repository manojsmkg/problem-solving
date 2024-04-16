class Solution {
public:
    vector<vector<int>> merge(vector<vector<int>>& intervals) {
        int n = intervals.size();
        for(int i=0;i<n-1;i++)
        {
            bool swapped=false;
            for(int j=0;j<n-i-1;j++)
            if(intervals[j][0]>intervals[j+1][0])
            {
                swap(intervals[j],intervals[j+1]);
                swapped = true;
            }
            if(swapped == false)
                break;
        }
        
        
        for(int i=0;i<n;i++)
            cout<<intervals[i][0]<<" "<<intervals[i][1]<<endl;
        
        vector<vector<int>> resIntervals;
        resIntervals.push_back(intervals[0]);
        
        for(int i=1;i<n;i++)
        {
            if(intervals[i][0]>resIntervals.back()[1])
            {
                resIntervals.push_back(intervals[i]);
            }
            else resIntervals.back()[1] = max(resIntervals.back()[1],intervals[i][1]);
        }
       
        return resIntervals;
        
    }
};