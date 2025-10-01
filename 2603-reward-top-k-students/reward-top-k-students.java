class Node
{
    int studentId;
    int score;
    public Node(int studentId, int score)
    {
        this.studentId=studentId;
        this.score=score;
    }
    public int getScore()
    {
        return this.score;
    }

    public int getStudentId()
    {
        return this.studentId;
    }
}

class Solution {
    public List<Integer> topStudents(String[] positive_feedback, String[] negative_feedback, String[] report, int[] student_id, int k) 
    {
        List<String []> reportWords = new ArrayList<>();
        for(String curReport: report)
        {
            reportWords.add(curReport.split(" "));
        }

        Set<String> posWords = new HashSet<>();
        Set<String> negWords = new HashSet<>();

        for(String word: positive_feedback)
            posWords.add(word);

        for(String word: negative_feedback)
            negWords.add(word);

        PriorityQueue<Node> topKScores = new PriorityQueue<>(
        Comparator.comparingInt(Node::getScore).reversed()
        .thenComparingInt(Node::getStudentId)
        );                   
        Map<Integer,Integer> scoreMap = new HashMap<>();
        for(int i=0;i<reportWords.size();i++)
        {
            int sc = 0;
           for(String currWord : reportWords.get(i))
           {
                if(negWords.contains(currWord))
                {
                    sc--;
                    continue;
                }
                if(posWords.contains(currWord))
                {
                    sc=sc+3;
                    continue;
                }
           }
           topKScores.offer(new Node(student_id[i],sc));

        }

        List<Integer> result = new ArrayList<>();
        while(k-->0)
        {
            result.add(topKScores.poll().studentId);
        }
        return result;
        
    }
}