class Solution {
    public double average(int[] salary) {
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        int total = 0;
        for (int i : salary) {
            total += i;
            max = Math.max(max, i);
            min = Math.min(min, i);
        }

        return (double) (total - min - max) / (salary.length - 2);
    }
}