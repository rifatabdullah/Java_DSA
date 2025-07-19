// AssignmentTask3: Alternate Merge
public class AssignmentTask3 {
    
    // MUST SUBMIT this method
    public static Node alternateMerge( Node head1, Node head2 ){
        Node curn1 = head1;
        Node curn2 = head2;
        Node next1 = curn1.next;
        Node next2 = curn2.next;

        while ( curn1 != null && curn2 != null ){
            next1 = curn1.next;
            next2 = curn2.next;

            curn1.next = curn2;
            curn2.next = next1;

            // update 
            curn1 = next1;
            curn2 = next2;
        }
        
        


        //You’re NOT ALLOWED to create a new singly linked list for this task

        //TO DO

        //remove the following line when returning the Head of the modified LinkedList
        return head1;
    }

    //NOTE: if you find any issue with the driver code please inform AIB
    //DO NOT TOUCH THE DRIVER CODE BELOW
    public static void main(String[] args){
        System.out.println("==============Test Case 1=============");
        Node head1 = LinkedList.createList(new Integer[]{1,2,6,8,11});
        Node head2 = LinkedList.createList(new Integer[]{5,7,3,9,4});
        System.out.print("Linked List 1: ");
        LinkedList.printLL(head1);
        System.out.print("Linked List 1: ");
        LinkedList.printLL(head2);
        Node result = alternateMerge(head1, head2);
        System.out.println("\nExpected output: 1 -> 5 -> 2 -> 7 -> 6 -> 3 -> 8 -> 9 -> 11 -> 4");
        System.out.print( "Your output: ");
        LinkedList.printLL(result); //This should print 1 -> 5 -> 2 -> 7 -> 6 -> 3 -> 8 -> 9 -> 11 -> 4
        System.out.println();
        
        System.out.println("\n==============Test Case 2=============");
        head1 = LinkedList.createList(new Integer[]{5,3,2,-4});
        head2 = LinkedList.createList(new Integer[]{-4,-6,1});
        System.out.print("Linked List 1: ");
        LinkedList.printLL(head1);
        System.out.print("Linked List 1: ");
        LinkedList.printLL(head2);
        result = alternateMerge(head1, head2);
        System.out.println("\nExpected output: 5 -> -4 -> 3 -> -6 -> 2 -> 1 -> -4");
        System.out.print( "Your output: ");
        LinkedList.printLL(result); //This should print 5 -> -4 -> 3 -> -6 -> 2 -> 1 -> -4
        System.out.println();

        System.out.println("\n==============Test Case 3=============");
        head1 = LinkedList.createList(new Integer[]{4,2,-2,-4});
        head2 = LinkedList.createList(new Integer[]{8,6,5,-3});
        System.out.print("Linked List 1: ");
        LinkedList.printLL(head1);
        System.out.print("Linked List 1: ");
        LinkedList.printLL(head2);
        result = alternateMerge(head1, head2);
        System.out.println("\nExpected output: 4 -> 8 -> 2 -> 6 -> -2 -> 5 -> -4 -> -3");
        System.out.print( "Your output: ");
        LinkedList.printLL(result); //This should print 4 -> 8 -> 2 -> 6 -> -2 -> 5 -> -4 -> -3
        System.out.println();
    }
}






























