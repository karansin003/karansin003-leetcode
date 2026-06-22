class Solution {
    public Node copyRandomList(Node head) {
        if (head == null) return null;
        // create new list with cross connection 
        Node curr = head;
        while(curr!= null)
        {
            Node copy = new Node(curr.val);
            copy.next = curr.next;
            curr.next = copy;
            curr = copy.next;
        }
        // connect reandom 
        curr = head;
        while(curr!= null)
        {
            if(curr.random != null)
            {   
                curr.next.random = curr.random.next;
            }
            curr = curr.next.next;
        }

        // connection 
        curr = head;
        Node newhead = head.next;
        while(curr != null)
        {
            Node t = curr.next;
            curr.next = t.next;
            if(t.next != null)
            {
                t.next = t.next.next;
            }
            curr = curr.next;
        }
        return newhead;
    }
}