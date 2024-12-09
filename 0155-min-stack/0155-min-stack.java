class MinStack {
    Stack<Integer> st;
    Stack<Integer> minStack;
    int mini;
    Map<Integer,Integer> ctMap;

    public MinStack() {
        st = new Stack<>();
        minStack = new Stack<>();
        ctMap = new HashMap<>();
        mini = Integer.MAX_VALUE;
    }
    
    public void push(int val) {
        st.push(val);
        if(val<mini) {
            mini = val;
            minStack.push(val);
        }
        if(ctMap.containsKey(val)) ctMap.put(val,ctMap.get(val)+1);
        else ctMap.put(val,1);
    }
    
    public void pop() {
        if(st.isEmpty() == true) return;
        int val = st.pop();
        ctMap.put(val,ctMap.get(val)-1);
        if(minStack.isEmpty() == false && minStack.peek() == val) 
        {
            if(ctMap.get(val)==0) minStack.pop();
            if(minStack.isEmpty() == false) mini = minStack.peek();
            else mini = Integer.MAX_VALUE;
        }
        
    }
    
    public int top() {
        if(st.isEmpty() == true) return 0;
        return st.peek();
    }
    
    public int getMin() {
       // if(minStack.isEmpty() == true) return 0;
        
        return mini;
    }
}

/**
 * Your MinStack object will be instantiated and called as such:
 * MinStack obj = new MinStack();
 * obj.push(val);
 * obj.pop();
 * int param_3 = obj.top();
 * int param_4 = obj.getMin();
 */