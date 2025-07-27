// LabTask2: Word Decoder
public class LabTask2 {
    
    // No need to submit this task
    public static Node wordDecoder( Node head ){

        int c = 0;
        Node curn = head;
        while (curn != null) {
            c++;
            curn = curn.next;
        }

        int x = 13 % c;
        Node cr = head;
        Node h1 = new Node(null);
        Node h2 = h1;
        int ii = 0;
        while (cr != null){
            if ( ii % x == 0 ){
                h2.next = new Node(cr.elem);
                h2 = h2.next;
            }
            cr = cr.next;
            ii++;
        }
        head = h2;

        Node prev = null;
        Node cn = h1.next.next;

        while ( cn != null){
            Node next = cn.next;

            cn.next = prev;

            prev = cn;
            cn = next;

        }
        head.next = null;
        head = prev;
        Node dh = new Node(null);
        dh.next = head;
        


        return dh;
        
        //You're suppose to create a new Dummy headed Singly Linked List in this method
        //Dummy head is basically a head Node where the elem is null
        // Node dHead = new Node(null, null); here the dHead is a Dummy Head

        //TO DO

        //remove the following line when you're ready to return the new head
        
    }

    //NOTE: if you find any issue with the driver code please inform AIB
    //DO NOT TOUCH THE DRIVER CODE BELOW
    public static void main(String[] args){
        System.out.println("==============Test Case 1=============");
        Node head = LinkedList.createList(new Character[]{'B', 'M', 'D', 'T', 'N', 'O', 'A', 'P', 'S', 'C'});
        System.out.print("Encoded Word: ");
        LinkedList.printLL(head);
        System.out.println("\nExpected output: null -> C -> A -> T");
        Node result = wordDecoder(head);
        System.out.println( "Your output: ");
        LinkedList.printLL(result); //This should print null -> C -> A -> T
        System.out.println();
        System.out.println("==============Test Case 2=============");
        head = LinkedList.createList(new Character[]{'Z', 'O', 'T', 'N', 'X'});
        System.out.print("Encoded Word: ");
        LinkedList.printLL(head);
        System.out.println("\nExpected output: null -> N");
        result = wordDecoder(head);
        System.out.println( "Your output: ");
        LinkedList.printLL(result); //This should print null -> N
        System.out.println();
    }
}
