class Solution {
    public String reverseWords(String s) 
    {
        String[] splitWords = s.trim().split(" ");
        String newString= "";
        
        for(int i=splitWords.length-1;i>=0;i--)
        {
            if(i!=splitWords.length-1) newString = newString + " ";
            if(splitWords[i].equals(" ")) continue;
            
            newString = newString+splitWords[i];
            newString = newString.trim();
        }
        return newString;
    }
}