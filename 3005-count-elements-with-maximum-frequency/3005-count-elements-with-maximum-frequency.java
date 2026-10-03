class Solution {
    public int maxFrequencyElements(int[] nums) {
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int num : nums){
            map.put(num,map.getOrDefault(num,0) + 1);
        }
        int max = 0;
        for(int value : map.values()){
            max = Math.max(max,value);
        }
        int count = 0;
        for(int i : map.values()){
            if(i == max){
                count += i;
            }
        }
        return count;
    }
}