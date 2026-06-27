class Solution {
    private boolean isSorted(ArrayList<Integer> list)
    {
        for(int i = 1;i < list.size(); i++)
        {
            if(list.get(i-1) > list.get(i))
            {
                return false;
            }
        }
        return true;
    }
    public int minimumPairRemoval(int[] nums) {
        ArrayList<Integer> list = new ArrayList<>();
        for(int num : nums)
        {
            list.add(num);
        }
        int operation = 0;
        while(!isSorted(list))
        {
            int minsum = Integer.MAX_VALUE;
            int index = 0;
            for(int i = 0 ; i < list.size() - 1;i++)
            {
                int sum = list.get(i) + list.get(i+1);
                if(sum < minsum)
                {
                    minsum = sum;
                    index = i;
                }
            }

            list.set(index,minsum);
            list.remove(index + 1);
            operation++;
        }
        return operation;
    }
}