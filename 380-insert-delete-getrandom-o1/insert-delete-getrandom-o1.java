class RandomizedSet {
    List<Integer> nums;
    Set<Integer> numSet;
    
    int size;

    public RandomizedSet() {
        size = 0;
        nums = new ArrayList<>();
        numSet = new HashSet<>();
    }
    
    public boolean insert(int val) {
        if(numSet.contains(val))
            return false;
        numSet.add(val);
        nums.add(val);
        size++;        
        return true;
    }
    
    public boolean remove(int val) {
        if(!numSet.contains(val))
            return false;
        numSet.remove(val);
        Object o = (Object) val;
        nums.remove(o);

        size--;
        return true;  
    }
    
    public int getRandom() {
        Random rand = new Random();
        return nums.get(rand.nextInt(nums.size()));
    }
}

/**
 * Your RandomizedSet object will be instantiated and called as such:
 * RandomizedSet obj = new RandomizedSet();
 * boolean param_1 = obj.insert(val);
 * boolean param_2 = obj.remove(val);
 * int param_3 = obj.getRandom();
 */