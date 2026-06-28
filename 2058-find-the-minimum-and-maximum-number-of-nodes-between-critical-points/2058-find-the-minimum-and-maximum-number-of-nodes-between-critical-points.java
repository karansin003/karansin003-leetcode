class Solution {
    public int[] nodesBetweenCriticalPoints(ListNode head) {
       ArrayList<Integer> list = new ArrayList<>();
       ListNode prev  = head;
       ListNode curr = head.next;
       ListNode post = head.next.next;
       int index = 1;
       while( post != null)
       {
        if((prev.val < curr.val  && curr.val > post.val ) || (prev.val > curr.val && curr.val < post.val))
        {
            list.add(index);
        }
        prev = curr;
        curr = post;
        post = post.next;
        index++;
       }
       if (list.size() < 2) {
            return new int[]{-1, -1};
        }
       int minDistance = Integer.MAX_VALUE;

        for (int i = 1; i < list.size(); i++) {
            int distance = list.get(i) - list.get(i - 1);
            minDistance = Math.min(minDistance, distance);
        }

        int maxDistance =
            list.get(list.size() - 1) - list.get(0);

        return new int[]{minDistance, maxDistance};
    }
}