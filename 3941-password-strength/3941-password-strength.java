class Solution {
    public int passwordStrength(String password) {
        HashSet<Character> set = new HashSet<>();
        for(char ch : password.toCharArray())
            {
                set.add(ch);
            }
        int ans = 0;
        for (char ch :set){
        if(ch >= 'a' && ch <= 'z' )
        {
            ans+=1;
        }
        else if(ch >= 'A' && ch <= 'Z')
        {
            ans+=2;
        }
        else if(ch >= '0' && ch <= '9')
        {
            ans+=3;
        }
        else
        {
            ans += 5;
        }
        }
        return ans;
    }
}