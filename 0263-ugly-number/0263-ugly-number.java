class Solution {
    public boolean isUgly(int n) {
        if(0 == n ) return false;
        while(0 == n%2)
        n = n/2;
        while(0 == n%3)
        n = n/3;
        while(0 == n%5)
        n = n/5;
        return 1 == n;
    }
}