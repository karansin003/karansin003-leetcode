class Solution {
    public int balancedStringSplit(String s) {
        int bal = 0,count = 0;
        for(char ch : s.toCharArray())
        {
            if('L' == ch)
            {
                bal++;
            }
            else 
            {
                bal--;
            }
            if(bal == 0)
            {
                count++;
            }
        }
        return count;
    }
}