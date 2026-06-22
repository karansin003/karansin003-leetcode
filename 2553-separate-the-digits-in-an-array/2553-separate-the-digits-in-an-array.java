class Solution {
    public int[] separateDigits(int[] nums) {
        ArrayList<Integer> list = new ArrayList<>();
        for(int num : nums)
        {
            String s = String.valueOf(num);
            for(int i = 0;i<s.length();i++)
            {
                list.add(s.charAt(i)-'0');
            }
        }
        int arr[] = new int[list.size()];
        for(int i = 0; i < list.size();i++)
        {
            arr[i] = list.get(i);
        }
        return arr;
    }
}