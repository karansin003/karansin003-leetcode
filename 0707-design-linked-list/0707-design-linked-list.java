class MyLinkedList {
    class listnode {
        int val;
        listnode next;

        listnode(int val) {
            this.val = val;
            this.next = null;
        }
    }

    private listnode head;
    private listnode tail;
    private int size;

    public MyLinkedList() {
        head = null;
        tail = null;
        size = 0;
    }

    public int get(int index) {
        if(index < 0 || index >= size) return -1;
        listnode temp = head;
        for(int i = 0;i < index;i++ )
        {
            temp = temp.next;
        }
        return temp.val;
    }

    public void addAtHead(int val) {
        listnode temp = new listnode(val);
        if (head == null) {
            head = temp;
            tail = temp;
        } else {
            temp.next = head;
            head = temp;
        }
        size++;
    }

    public void addAtTail(int val) {
        listnode temp = new listnode(val);
        if (head == null) {
            addAtHead(val);
        } else {
            tail.next = temp;
            tail = temp;
            size++;
        }
    }

    public void addAtIndex(int index, int val) {
        
        if(index < 0 || index > size ) {
            return;
        }
        if(index == 0)
        {
            addAtHead(val);
            return;
        }
        if(index == size )
        {
            addAtTail(val);
            return;
        }
        listnode n = new listnode(val);
        listnode temp = head;
        for(int i =0 ;i < index-1;i++)
        {
            temp = temp.next;
        }
        n.next = temp.next;
        temp.next =n;
        size++;
    }

    public void deleteAtIndex(int index) {
        if (index < 0 || index >= size)
            return;
       
        if (index == 0) {
            head = head.next;
            if (head == null)
                tail = null;
            size--;
            return;
        }
            listnode temp = head;
            for (int i = 0; i < index - 1; i++) {
                temp = temp.next;
            }
            if (temp.next == tail) {
                tail = temp;
            }
            temp.next = temp.next.next;
            size--;
        }
    }


/**
 * Your MyLinkedList object will be instantiated and called as such:
 * MyLinkedList obj = new MyLinkedList();
 * int param_1 = obj.get(index);
 * obj.addAtHead(val);
 * obj.addAtTail(val);
 * obj.addAtIndex(index,val);
 * obj.deleteAtIndex(index);
 */