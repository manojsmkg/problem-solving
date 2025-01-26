class Solution {
    public int canCompleteCircuit(int[] gas, int[] cost) 
    {
        int n=gas.length;
        int totalEffectiveGas = 0;
        int effectiveGas[] = new int[n];
        int s = 0;
        for(int i=0;i<n;i++)
        {
            totalEffectiveGas += gas[i]-cost[i];
            effectiveGas[i] = (gas[i]-cost[i]);
        }
        if(totalEffectiveGas<0) return -1;
        int prefixSum = 0; 
        int ans = 0;
        for(int i=0;i<n;i++)
        {
            prefixSum+=effectiveGas[i];
            System.out.print(prefixSum+ " ");
            if(prefixSum<0 ) {prefixSum=0;ans = i+1;}
        }
        return ans;
    }
}