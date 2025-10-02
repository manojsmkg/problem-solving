class Solution {

    public List<Integer> twoOutOfThree(int[] nums1, int[] nums2, int[] nums3) {


        Map<Integer,Integer> countMap = new HashMap<>();
        Set<Integer> tempSet = new HashSet<>();
        List<Integer> resultList = new ArrayList<>();
        Set<Integer> resultSet = new HashSet<>();
        for(int i:nums1)
        {
            int ct = countMap.getOrDefault(i,0);
            if(tempSet.contains(i)==false) ct++;
            countMap.put(i,ct);
            if(ct==2&&resultSet.contains(i)==false) {
                resultSet.add(i);
                resultList.add(i);
            }
            tempSet.add(i);
        }

        tempSet.clear();

                for(int i:nums2)
        {
            int ct = countMap.getOrDefault(i,0);
            if(tempSet.contains(i)==false) ct++;
            countMap.put(i,ct);
            if(ct==2&&resultSet.contains(i)==false) {
                resultSet.add(i);
                resultList.add(i);
            }
            tempSet.add(i);
        }

         tempSet.clear();

                for(int i:nums3)
        {
            int ct = countMap.getOrDefault(i,0);
            if(tempSet.contains(i)==false) ct++;
            countMap.put(i,ct);
            if(ct==2&&resultSet.contains(i)==false) {
                resultSet.add(i);
                resultList.add(i);
            }
            tempSet.add(i);
        }

        return resultList;
        
        
    }
}