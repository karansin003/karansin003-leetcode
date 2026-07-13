class Solution {
    private int addNumber(int num) {
        int sum = 0;
        while (num != 0) {
            sum += num % 10;
            num /= 10;
        }
        return sum;
    }

    public int getLucky(String s, int k) {

        int sum = 0;

       
        for (char ch : s.toCharArray()) {
            int val = ch - 'a' + 1;
            sum += addNumber(val);
        }

        
        while (--k > 0) {
            sum = addNumber(sum);
        }

        return sum;
    }
}