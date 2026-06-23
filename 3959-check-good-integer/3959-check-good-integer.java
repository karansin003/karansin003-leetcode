class Solution {
    public boolean checkGoodInteger(int n) {
        int digitsum = 0;
        int productsum = 0;
        while(n != 0)
        {
            int rem = n % 10;
            digitsum += rem;
            productsum += rem*rem;
            n/=10;
        }
        
        int res = productsum - digitsum;
        if(res >= 50)
            return true;
        else 
            return false;
    }
    
}