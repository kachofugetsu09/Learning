package CONSTRUCTOR;

class ListNode {
    int val;
    ListNode next;

    public ListNode(int val) {
        this.val = val;
        this.next = null;
    }
    public ListNode(int val, ListNode nextNode) {
        this.val = val;
        this.next = nextNode;
    }

}


    class LinkList {
        private ListNode head;
        private int size;



        public LinkList() {
            this.head = new ListNode(0, null);

            this.size=0;
        }
        public int getSize(){
            return size;

        }
        public void addFirst(int val){
            ListNode newNode=new ListNode(val);
            newNode.next=head.next;
            head.next=newNode;
            size++;

        }
        public void addLast(int val){
            ListNode newNode=new ListNode(val);
            ListNode cur=head;
            while(cur.next!=null){
                cur=cur.next;
            }
            cur.next=newNode;
            size++;
        }
        public int getval(int index) {
            if (index < 0 || index >= size) {
                throw new IndexOutOfBoundsException("Index out of bounds");
            }

            int count = 0;
            ListNode cur = head.next;
            while (cur != null && count < index) {
                cur = cur.next;
                count++;
            }

            if (cur == null) {
                throw new IndexOutOfBoundsException("Index out of bounds");
            }

            return cur.val;
        }
        public void deleteindex(int index){
            if (index < 0 || index >= size) {
                throw new IndexOutOfBoundsException("Index out of bounds");
            }

            ListNode current = head;
            int count = 0;

            while (current.next != null && count < index) {
                current = current.next;
                count++;
            }

            if (current.next == null) {
                throw new IndexOutOfBoundsException("Index out of bounds");
            }
            current.next=current.next.next;
            size--;

        }

    }


