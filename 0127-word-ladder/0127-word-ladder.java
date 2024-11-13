class Node{
    String word;
    int ct;
    public Node(String word,int ct)
    {
        this.word = word;
        this.ct = ct;
    }
}

/*
StringBuilder str = new StringBuilder("Test string");
str.setCharAt(1, 'X');
str.toString();
*/

class Solution {
    
    public void getNextWord(String beginWord,Set<String> wordSet)
    {
        
    }
    public int ladderLength(String beginWord, String endWord, List<String> wordList) 
    {
        Set<String> wordSet = new HashSet<>();
        for(String word : wordList)
        {
            wordSet.add(word);
        }
        Queue<Node> q = new LinkedList<>();
        for(int i=0;i<beginWord.length();i++)
        {
            for(char j='a';j<='z';j++)
            {
                StringBuilder str = new StringBuilder(beginWord);
                str.setCharAt(i,j);
                if(wordSet.contains(str.toString()))
                {
                   //  System.out.println(str.toString()+ " "+ 2);
                    if(str.toString().equals(endWord)) return 2;
                    wordSet.remove(str.toString());
                    q.add(new Node(str.toString(),2));
                }
            }
        }
        while(q.isEmpty() == false)
        {
            String word = q.peek().word;
            int ct = q.peek().ct;
            q.remove();
           
            for(int i=0;i<word.length();i++)
            {
            for(char j='a';j<='z';j++)
            {
                StringBuilder str = new StringBuilder(word);
                str.setCharAt(i,j);
                if(wordSet.contains(str.toString()))
                {
                 //   System.out.println(str.toString()+ " "+ (ct+1));
                    if(str.toString().equals(endWord)) return ct+1;
                    wordSet.remove(str.toString());
                    q.add(new Node(str.toString(),ct+1));
                }
            }
           }
           
        }
        return 0;     
    }
}