class Solution {
    public int totalWaviness(int num1, int num2) {
        int ans = 0;
        for(int i  = num1 ; i <= num2;i++)
        {
            String s = String.valueOf(i);
            int count = 0;
            for(int j = 1 ; j < s.length()-1;j++)
            {
                int x = s.charAt(j-1) - '0';
                int y = s.charAt(j) - '0';
                int z = s.charAt(j+1) -'0';
                if((x < y && y > z) || (x > y && y < z))
                {
                    count++;
                }
            }
                ans += count;
        }
        return ans;
    }
}