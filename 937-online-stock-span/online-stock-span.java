class Node
{
    int price;
    int index;
    Node(int price,int index)
    {
        this.price = price;
        this.index = index;
    }
}

class StockSpanner {
    Stack<Node> st;
    int index ;

    public StockSpanner() {
        st = new Stack<Node>();
        index = 0;
    }
    
    public int next(int price) {
        if(st.isEmpty() == true) 
        {
            st.push(new Node(price,index));
            index++;
            return 1;
        } 

        while(st.isEmpty() == false && price>=st.peek().price) st.pop();

        int span = index+1;
        if(st.isEmpty() == false ) 
        {
            span = index - st.peek().index;
        }

        st.push(new Node(price,index));
        index++;
        return span;
    }
}

/**
 * Your StockSpanner object will be instantiated and called as such:
 * StockSpanner obj = new StockSpanner();
 * int param_1 = obj.next(price);
 */