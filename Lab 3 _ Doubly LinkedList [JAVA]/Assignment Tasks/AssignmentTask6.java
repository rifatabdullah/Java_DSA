public class AssignmentTask6 {

    //SUBMIT ONLY THIS METHOD
    public static void pairJoin(DNode dh1, DNode dh2) {
        

       
        if (dh1 == null || dh1.next == dh1){
            return;
        } 
       DNode n1 = dh1.next;
       DNode n2 = dh2.next;
       
       n1.prev = dh1;
       n2.prev = dh2;

       DNode next1 = n1.next;
       DNode next2 = n2.next;
       
       while ( n1 != null && n2 != null){

        next1 = n1.next;
        next2 = n2.next;

        n1.next = n2;
        n2.prev  = n1;
        
        if (next1 != null){
            n2.next = next1;
            next1.prev = n2;
        }
        else{
            n2.next = dh1;
            dh1.prev = n2;
        }


        n1 = next1;
        n2 = next2;
       }

    }

    //DO NOT SUBMIT THE DRIVER CODE BELOW
    //SUBMITTING IT WILL INCREASE YOUR PLAG % FOR NO REASON
    public static void main(String[] args) {
        Object[] list1 = {"A", "B", "C", "D"};
        Object[] list2 = {"E", "F", "G", "H"};

        DNode dh1 = LinkedListHelpers.createDummyHeadedDoublyLL(list1, false);
        DNode dh2 = LinkedListHelpers.createDummyHeadedDoublyLL(list2, false);

        System.out.println("Given Linked List 1:");
        LinkedListHelpers.printDummyHeadedDoublyLL(dh1);

        System.out.println("Given Linked List 2:");
        LinkedListHelpers.printDummyHeadedDoublyLL(dh2);

        System.out.println("\nExpected Output:");
        Object[] expected = {"A", "E", "B", "F", "C", "G", "D", "H"};
        DNode expectedHead = LinkedListHelpers.createDummyHeadedDoublyLL(expected, true);
        LinkedListHelpers.printDummyHeadedDoublyCircularLL(expectedHead);

        //Running the Pair Join
        pairJoin(dh1, dh2);
        //Printing after Pair Join
        System.out.println("\nYour Output:");
        LinkedListHelpers.printDummyHeadedDoublyCircularLL(dh1);
    }
}
