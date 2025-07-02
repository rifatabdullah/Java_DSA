// Parent & Child Class
// class Dog extends Animal { // PArent class extends to Child Class
//     Dog(String name) {
//         super(name); // Call parent constructor
//     }
// }

/*
 * 
Term	   ||         What it Means	              ||        In Your Case
Animal()	--        Default constructor (no args)     	   ❌ Not defined
Animal(String name) --	Parameterized constructor	   ||      ✅ Defined
Child class    -- 	Class that extends another class  ||   ❌Not defined yet
class Dog extends Animal	--  Defines Dog as a subclass of Animal  ||	✅ That would be a child class
 */















// 

// class Animal{
//     String name; // Instance Variable inside a Class and which belongs the very object of this Class 
//     // With 'static' keyword we can write class Variable
//     Animal(String name){ // Same name as Upper class means Constructor 
//         this.name  = name ; // Class Attribute (this.name)
//         System.out.println("\nPrinting from the depth of the Constructor: "+this.name+"\n");
//     }


//     public static void main(String [] args){

//         Animal dog = new Animal("HAxx");
//     }
// }









// import java.lang.Math;
// class Practice1 {    
//     public static void main (String [] args) {
//         // 2D array -- an array of arrays
//         int[][] a = new int[3][4];

//     for ( int i = 0 ; i < a.length; i++){
//         for (int j = 0 ; j < a[i].length;j++){
//             a[i][j] = (int)(Math.random()*10); // random() -- gives (double) fractional values less than 1. So we have to multiply it with 10 or 100 to get desired digit. Also, we have to convert into int in order to prevent type mismatch with the declared Array type. 
//         }
//     }



//     for (int i = 0; i< a.length; i++){

//         for (int j = 0; j < a[i].length;j++){ // Until Row Length
//             System.out.print(a[i][j]+" ");
//         }
//         System.out.println();
//     }
//     // Or,
//     // System.out.println("\nNew Style of Printing Array \n");
//     // for (int n[]: a){ // Take array of a via n[] 
//     //     for (int m: n ){ // Then form n array, take individual element and print 
//     //         System.out.print(m+" ");
//     //     }
//     //     System.out.println();
//     }


// }


// class Node{
//     int data;
//     Node next;

//     Node(int data){
//         this.data = data;
//         this.next = null;
//     }
// }




//// Linked List and Node 

// class LL{
//     Node head;
//     class Node{
//         String data ;
//         Node next;
//         Node(String data){
//             this.data = data;
//             this.next = null;
//         }

//     }

//     // Add a value first 

//     public void addFirst( String data){
//         Node New_node = new Node(data);
//         if (head == null){
//             head = New_node;
//             return;
//         }
//         else{
//             New_node.next = head;
//             head =  New_node;
//         }
//     }

//     public static void main(String [] args){
//         LL new_list = new LL();
//     }
// }


// Array to LinkedList

class LL{
    Node head; // how Node working here? Isn't isn't it a user-defined class name?
    Node tail;
    class Node{ // User defined Class
        int data;
        Node next;
        Node(int data ){
            this.data = data;
            this.next = null;
        }
    }

    public void createList(int[] arr){
        if (arr.length == 0){
            return; // Terminates the code if array's length is 0
        }
        Node head = new Node(arr[0]); // creating new head node using Array's first element
        Node tail = head; // To get last element

        for(int i = 1; i < arr.length; i++){
             Node new_node = new Node(arr[i]);
                tail.next = new_node;
                tail = new_node;
            }
            // return head; it doesn't work here 
        }
        public void printList(Node head){
            Node current = head;
            while( current != null){
                System.out.print(current.data+"--> ");
                current = current.next;
            }
            System.out.println("Null Appeared! ");
        }


        public static void main (String[] args){
            LL new_LL = new LL();
            int[] arr = {1,2,3,4};

            new_LL.createList(arr);
            new_LL.printList();
        }
}