class Solution {

    public void combinationSumUtil(List<List<Integer>> result,int k, int n, List<Integer> currList,int currNum)
    {
        if( n == 0 && currList.size() == k) {result.add(new ArrayList<>(currList));return;}
        else if(currList.size() == k) return;

        if(currNum==10) return;

        if(n<0) return;

        currList.add(currNum);
        combinationSumUtil(result,k,n-currNum,currList,currNum+1);
        currList.remove(currList.size()-1);
        combinationSumUtil(result,k,n,currList,currNum+1);
    }


    public List<List<Integer>> combinationSum3(int k, int n) 
    {
        List<List<Integer>> result = new ArrayList<>();
        combinationSumUtil(result,k,n,new ArrayList<>(),1);
        return result;        
    }
}