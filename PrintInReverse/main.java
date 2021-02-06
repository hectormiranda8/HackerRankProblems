import java.util.Stack;

class Main {
    public static void main (String[] args){
        System.out.println("Main");
        SinglyLinkedListNode head = new SinglyLinkedListNode();
        head.data = 3; head.next = new SinglyLinkedListNode();
        SinglyLinkedListNode node = head.next;
        node.data = 5; node.next = new SinglyLinkedListNode();
        node = node.next;
        node.data = 16; node.next = new SinglyLinkedListNode();
        node = node.next;
        node.data = 12; node.next = new SinglyLinkedListNode();
        node = node.next;
        node.data = 4; node.next = new SinglyLinkedListNode();
        node = node.next;
        node.data = 2; node.next = new SinglyLinkedListNode();
        node = node.next;
        node.data = 5; node.next = new SinglyLinkedListNode();
        node = node.next;
        node.data = 3; node.next = new SinglyLinkedListNode();
        node = node.next;
        node.data = 7; node.next = new SinglyLinkedListNode();
        node = node.next;
        node.data = 3; node.next = new SinglyLinkedListNode();
        node = node.next;
        node.data = 9; node.next = new SinglyLinkedListNode();
        node = node.next;
        node.data = 5; node.next = new SinglyLinkedListNode();
        node = node.next;
        node.data = 5; node.next = new SinglyLinkedListNode();
        node = node.next;
        node.data = 1; node.next = new SinglyLinkedListNode();
        node = node.next;
        node.data = 18; node.next = new SinglyLinkedListNode();
        node = node.next;
        node.data = 3; node.next = new SinglyLinkedListNode();
        node = node.next;
        node.data = 13; node.next = new SinglyLinkedListNode();

        reversePrint(head);
    }

    /*
     * For your reference:
     *
     * SinglyLinkedListNode {
     *     int data;
     *     SinglyLinkedListNode next;
     * }
     *
     */

    static void reversePrint(SinglyLinkedListNode head) {
        if (head == null)
            return;

        // head are the test case number
        int cases = head.data;

        // gathered cases, skip to next node
        head = head.next;

        // for loop for each test case
        for(int i = 0; i < cases; i++){
            // first node contains the number of elements
            assert head != null;
            int elements = head.data;

            // gathered element numbers, skip node
            head = head.next;

            // for the amount of elements, push them into a
            // stack and print each pop (making it reverse)
            Stack<Integer> stk = new Stack<>();
            for(int j = 0; j < elements; j++){
                assert head != null;
                stk.push(head.data);
                if(head.next == null)
                    break;
                head = head.next;
            }
            while(!stk.isEmpty()){
                System.out.println(stk.pop());
            }
        }
    }
}