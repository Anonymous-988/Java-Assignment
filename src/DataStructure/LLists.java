package DataStructure;

public class LLists {

    private Node head;
    private Node tail;

    public void insertAtFirst(int val){
        Node node = new Node(val, head);
        head = node;
        node.size++;

        if(tail == null){
            tail = head;
        }
    }

    public void insertAtLast(int val){
        if(tail == null){
            insertAtFirst(val);
            return;
        }
        Node node = new Node(val);
        tail.next = node;
        tail=node;
        node.size++;
    }

    public void display(){
        Node temp = head;
        if(head == null){
            System.out.println("Empty List");
            return;
        }
        while(temp != null){
            System.out.print("["+temp.value+"] -> ");
            temp = temp.next;
        }
        System.out.println("END");
    }

    public void updateAtPos(int val, int pos) {
        if(pos >= head.size){
            System.out.println("Invalid index");
            return;
        }
//        if(pos == 1 ){
//            insertAtFirst(val);
//            return;
//        }
        Node node = new Node(val);
        Node curr = head;
        while(pos > 1 ){
            curr=curr.next;
            pos--;
        }
        node.next = curr.next.next;
        curr.next = node;
    }

    public void insertAtPos(int val, int pos) {
        if(pos >= head.size){
            System.out.println("Invalid index");
            return;
        }
        if(pos == 1 ){
            insertAtFirst(val);
            return;
        }
        Node node = new Node(val);
        Node curr = head;
        while(pos > 2 ){
            curr=curr.next;
            pos--;
        }
        node.next = curr.next;
        curr.next = node;
        node.size++;
    }


    private void findMidNode() {
        Node slow = head;
        Node fast = head;
        while(fast != null){
            fast = fast.next.next;
            slow = slow.next;
        }
        System.out.println("Mid Node is ["+slow.value+"]");
    }

    public int getSize(){
        return head.size;
    }

    public class Node{
        private int value;
        private Node next;
        public static int size;


        public Node(int val){
            this.value=val;
        }

        public Node(int value, Node next) {
            this.value = value;
            this.next = next;
        }
    }



    public static void main(String args[]){

        // Normie List operations
        LLists LL = new LLists();
        LL.display();

        LL.insertAtFirst(5);
        LL.insertAtFirst(4);
        LL.insertAtFirst(3);
        LL.insertAtFirst(2);
        LL.insertAtFirst(1);

        LL.display();
        System.out.println("Total size of List is "+LL.getSize());

        LL.insertAtLast(6);
        LL.insertAtLast(7);
        LL.insertAtLast(8);
        LL.insertAtLast(9);
        LL.insertAtLast(10);

        LL.display();
        System.out.println("Total size of List is "+LL.getSize());


        LL.insertAtPos(5,5);
        LL.display();
        System.out.println("Total size of List is "+LL.getSize());
        LL.insertAtPos(9,10);
        LL.display();
        System.out.println("Total size of List is "+LL.getSize());


        LL.updateAtPos(6,5);
        LL.display();
        System.out.println("Total size of List is "+LL.getSize());
        LL.updateAtPos(10,10);
        LL.display();
        System.out.println("Total size of List is "+LL.getSize());


        // Chad List operations
        LL.findMidNode();
    }


}
