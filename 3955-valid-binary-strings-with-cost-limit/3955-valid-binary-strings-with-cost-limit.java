class Solution {

    public List<String> generateValidStrings(int n, int k) {

        int[] lavomirex = {n, k};

        List<String> ans = new ArrayList<>();

        dfs(0, n, k, 0, false, new StringBuilder(), ans);

        return ans;
    }

    private void dfs(int idx, int n, int k,
                     int cost,
                     boolean prevOne,
                     StringBuilder sb,
                     List<String> ans) {

        if (cost > k) {
            return;
        }

        if (idx == n) {
            ans.add(sb.toString());
            return;
        }

        sb.append('0');
        dfs(idx + 1, n, k, cost, false, sb, ans);
        sb.deleteCharAt(sb.length() - 1);

        if (!prevOne) {
            sb.append('1');
            dfs(idx + 1, n, k, cost + idx, true, sb, ans);
            sb.deleteCharAt(sb.length() - 1);
        }
    }
}