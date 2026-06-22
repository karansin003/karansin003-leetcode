class Solution {
    public int thirdMax(int[] nums) {
       HashSet<Integer> set = new HashSet<>();
       for(int num : nums)
       {
        set.add(num);
       }
       if(set.size() < 3 )
       {
        int max = Integer.MIN_VALUE;
        for(int num : set)
        {
            max = Math.max(num,max);
        }
        return max;
       }

       int first = Integer.MIN_VALUE;
       int second = Integer.MIN_VALUE;
       int third = Integer.MIN_VALUE;
       for(int num : set)
       {
        if(num > first)
        {
            third = second;
            second = first;
            first = num;
        }
        else if( num > second)
        {
            third = second;
            second = num;
        }
        else if( num > third)
        {
            third = num;
        }
       }
       return third;
    }
}