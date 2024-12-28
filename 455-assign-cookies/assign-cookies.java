class Solution {
    public int findContentChildren(int[] g, int[] s) 
    {
        Arrays.sort(g);
        Arrays.sort(s);

        int childs = g.length;
        int cookies = s.length;
        int counter = 0;
        int i=0,j=0;
        while(i<childs && j<cookies)
        {
            if(s[j]>=g[i])
            {
                counter++;
                j++;
                i++;
            }
            else if(s[j]>g[i])
            {
                i++;
            }
            else j++;
        }
        return counter;
        
    }
}