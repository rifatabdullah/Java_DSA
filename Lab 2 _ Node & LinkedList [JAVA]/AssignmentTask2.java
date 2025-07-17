// AssignmentTask2: Sum of Nodes
public class AssignmentTask2 {
    
    // MUST SUBMIT this method
    public static int sumDist(Node head, Integer[] distArr) {

        Integer total = 0;

        for (int i = 0; i < distArr.length; i++){
            int idx = distArr[i];
            int count = 0;
            Node curn = head; // This ensures curn is again head after each iteration of for loop
            
            while (curn != null){
                if ( count == idx ){
                    total += (Integer) curn.elem;
                }
                if (idx != count ){
                    total += 0;
                } 
                count++;
                curn = curn.next;
            }
        }
        return total;
        // To Do
       // Remove this line.
    }

    public static void main(String[] args) {
        System.out.println("=========Test Case 1=============");
        Node head1 = LinkedList.createList(new Integer[]{10, 16, -5, 9, 3, 4});
        Integer[] dist = new Integer[] {2, 0, 5, 2, 8};
	System.out.print("Given LinkedList: ");
	LinkedList.printLL(head1);
	System.out.print("Distance Array: ");
	Arr.print(dist);
        System.out.println("\nExpected Output: 4");
	int returnedValue = sumDist(head1, dist);
	System.out.println("Your Output: "+returnedValue); // This should print: Sum of Nodes: 4
    }
}
