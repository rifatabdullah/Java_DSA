// LabTask1: Assemble Conga Line
public class LabTask1 {
	
    // No need to submit this task
    public static Boolean assembleCongaLine(Node head){
        
        Node curn = head;
        Node next = head.next;
        boolean flag = true;
        while (curn != null && next != null) {
            if ((Integer) curn.elem > (Integer) next.elem ){
                return false;
            }
            curn = curn.next;
            next = next.next;
        }

        return true;
    }

    //NOTE: if you find any issue with the driver code please inform AIB
    //DO NOT TOUCH THE DRIVER CODE BELOW
    public static void main(String[] args){

        System.out.println("==============Test Case 1=============");
        Node congaLine = LinkedList.createList(new Integer[]{10,15,34,41,56,72});
        System.out.print("Original Conga Line: ");
        LinkedList.printLL(congaLine);
        System.out.println("Expected output: true");
        System.out.println( "Your output: "+assembleCongaLine(congaLine) ); //This should print True
        System.out.println();
        System.out.println("==============Test Case 2=============");
        congaLine = LinkedList.createList(new Integer[]{10,15,44,41,56,72});
        System.out.print("Original Conga Line: ");
        LinkedList.printLL(congaLine);
        System.out.println("Expected output: false");
        System.out.println( "Your output: "+assembleCongaLine(congaLine) ); //This should print False
        System.out.println();
    }
}
