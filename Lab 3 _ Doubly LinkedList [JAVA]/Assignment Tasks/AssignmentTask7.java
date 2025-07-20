public class AssignmentTask7 {

    //SUBMIT ONLY THIS METHOD
    public static void rangeMove(DNode dh, int start, int end) {
        

        if (dh == null || dh.next == dh){
            return;
        }
        DNode curn = dh.next;
        DNode next = curn.next;
        
        while (curn != dh){
            next = curn.next;

            if ((int)curn.elem >= start && (int)curn.elem <= end){
                curn.prev.next = curn.next;
                curn.next.prev = curn.prev;

                DNode last = dh.prev;
                last.next = curn;
                curn.prev = last;
                curn.next = dh;
                dh.prev = curn;
            }
            curn = next;

        }


    }

    //DO NOT SUBMIT THE DRIVER CODE BELOW
    //SUBMITTING IT WILL INCREASE YOUR PLAG % FOR NO REASON
    public static void main(String[] args) {
        Object[] values = {5, 3, 7, 1, 9, 6, 2, 4};
        DNode dh = LinkedListHelpers.createDummyHeadedDoublyLL(values, true);

        System.out.println("Given Linked List:");
        LinkedListHelpers.printDummyHeadedDoublyCircularLL(dh);

        System.out.println("\nExpected Output:");
        Object[] expected = {3, 1, 9, 2, 4, 5, 7, 6};
        DNode expectedHead = LinkedListHelpers.createDummyHeadedDoublyLL(expected, true);
        LinkedListHelpers.printDummyHeadedDoublyCircularLL(expectedHead);
        
        //Running the Range Move with [5,7] range 
        rangeMove(dh, 5, 7);
        //Printing after Range Move
        System.out.println("\nYour Output:");
        LinkedListHelpers.printDummyHeadedDoublyCircularLL(dh);
    }
}
