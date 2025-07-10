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






// // Arrays

// Printing minimum and maximum values in an a array

// import java.util.Scanner;

// class Checker{

//     public void min_max(int[] arr){
//         int first = arr[0];
//         int max = first;
//         int min = first;

//         for (int i = 0 ; i < arr.length; i++){
//             if (arr[i] < min){
//                 min = arr[i];
//             }
//             if (arr[i] > max){
//                 max = arr[i];
//             }
//         } 
        
//         System.out.println("Maximum number of the Array: "+max);

//         System.out.println("Minimum number of the Array: "+min);
//         }


//     public static void main (String [] args){
//         Scanner x = new Scanner(System.in);
//         System.out.println("What's your Array Size?");
//         int size = x.nextInt();
//         int[] arr = new int[size];
//         System.out.println(" Now Input your array elements: ");
//         for (int i = 0; i < size; i++){
//            int inp = x.nextInt();
//            arr[i] = inp;
//         }
//         Checker xx = new Checker();
//         xx.min_max(arr);
//     }
// }




// // Bubble Sort

// class BB_Sort{
//     public static void main (String [] args){
//         int[] arr = {7,8,3,1,2};
//         int temp = 0;

//         for(int i = 0 ; i < arr.length - 1; i++){ // if we didn't put -1, then this loop will go tot the last element of the array and then it would try to swap with the non-existing front part

//             for (int j = 0; j < arr.length - i - 1; j++){ // (-i) -- it'll not goto the latest sorted element by the previous iteration || (-1) -- for this loop won't goto the last element 

//               if (arr[j] > arr[j+1]){
//                 temp = arr[j+1];
//                 arr[j+1] = arr[j];
//                 arr[j] = temp;
//               }
//                }
//             }
        

//         System.out.println("Sorted Arrays: ");
//         for (int i = 0 ; i < arr.length; i++){
//             System.out.print(arr[i]+" ");
//         }


//     }
// }







// // Selection Sort 

// class S_Sort{
    
//     public static void main (String[] args){
//         int[] arr = {7,8,3,1,2};
//         int small,temp ;

//         for (int i = 0; i < arr.length-1 ; i++){ // (-1) without it loop will goto to last element then try to go i+1 in inner loop, but it doesn't exist. 

//             small = i;
//             for (int j = i+1 ; j < arr.length ; j++){ // j=i+1 -- as at first the smallest element will go,so we won't bother the already smallest element of the Array

//                 if (arr[small] > arr[j]){
//                     small = j; // Smallest Just saving the position of smallest value 
//                 }
//             } 
                            
//             temp = arr[small]; // Saves smallest value

//             arr[small] = arr[i];  // Exchanging smallest value's position with the i th position's element in order to move forward the the bigger value. At smallest's position it exchanges with bigger value

//             arr[i] = temp;  // Exchanges i th value with the smallest element in the array and put in leftest position 

//             System.out.print("\n Sorting: ");
//             for (int k = 0 ; k < arr.length; k++){ // Just to see the Sorting process after each iteration of i

//                 System.out.print(arr[k]+" ");
//             }
//         }

//         System.out.println("\n\n\nSorted Arrays: ");
//             for (int i = 0 ; i < arr.length; i++){
//                 System.out.print(arr[i]+" ");
//             }
//             System.out.println("\n");


//     }

// }



































 
// // Printing 2D array

// import java.util.Scanner;
// class Two_D_Array{
//    public static void main (String [] args){
//       Scanner x  = new Scanner(System.in);
//       System.out.print("Rows? --> ");
//       int row = x.nextInt();
//       System.out.print("Columns? --> ");
//       int col = x.nextInt();
//       int[][] arr = new int[row][col];
//       System.out.print("Now, input your elements of matrix: \n");
//       for (int i = 0; i < row; i++){
//         for (int j = 0; j < col; j++){
//             arr[i][j] = x.nextInt();

//         }
//         System.out.println();
//       }
//       System.out.print("\nWhat number do you want to print ? --> ");
//       int c = x.nextInt();
       
//       int ir = 0;
//       int ic = 0;
//       System.out.println("\n \n2D Array: ");
//       for (int i = 0; i < row; i++){
//         for (int j = 0; j < col; j++){
//             if (arr[i][j] == c){
//                 ic = i;
//                 ir = j;
//             }
//             System.out.print(arr[i][j]+" ");
//         }
//         System.out.println();
//       }

//       System.out.println("\nFor your number "+c+", indices: Row: "+ir+", Column: "+ic+". ");
//    }
// } 








// // 2D array

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














// // Array to LinkedList

// class LL{
//     Node head; // How Node working here? Isn't isn't it a user-defined class name? // Points to first node of the whole linked list that's it's a instance variable of class LL

//     Node tail; // Points to last node of the whole linked list that's it's a instance variable of class LL

//     class Node{ // User-defined Class
//         int data;
//         Node next;
//         Node(int data ){
//             this.data = data;
//             this.next = null;
//         }
//     }

//     // Creating Linked List
//     public void createList(int[] arr){
//         if (arr.length == 0){
//             return; // Terminates the code if array's length is 0
//         }
//         head = new Node(arr[0]); // creating new head node using Array's first element
//         Node tail = head; // To get last element

//         for(int i = 1; i < arr.length; i++){
//              Node new_node = new Node(arr[i]);
//                 tail.next = new_node;
//                 tail = new_node;
//             }
//             // return head; it doesn't work here 
//         }
        
        
//         public void prependList(int[] arr, int v){
            
//             Node new_node = new Node(v);
//             new_node.next = head;
//             head = new_node;
//             // Node head = v; // wrong - can't assign int to a Node
//             // Node tail = arr[0]; // wrong 
//             for ( int i = 0; i < arr.length; i++){

//                 new_node = new Node(arr[i]);
//                 new_node.next = head;
//                 head = new_node;

//                 if (tail == null){
//                     tail = new_node;
//                 }
//             }
//         }



          
//         // Printing Linked List 
//         public void printList(){
//             Node current = head;
//             while( current != null){
//                 System.out.print(current.data+"--> ");
//                 current = current.next;
//             }
//             System.out.println("Null Appeared! ");
//         }

//         // Runner Code
//         public static void main (String[] args){
//             LL new_LL = new LL();
//             int[] arr = {1,2,3,4};
//             new_LL.createList(arr);
//             new_LL.printList();
//             System.out.println();
//              new_LL.prependList(arr, 55);
//             new_LL.printList();
//         }
// }






// // Linked List Manupulation

// class LL {
//     Node head;
//     Node tail;
//     class Node{
//         String data;
//         Node next ;
//         Node(String data){
//             this.data = data;
//             this.next = null;
//         }
//     }

// /// Add at first element

//     public void add_First(String data){
//         Node new_node = new Node(data);
//         if (head == null){ // If no node exists it'll do then head node will be:
//            head = new_node; // Stores new created Node into the head node.
//            return; // and ends the function, as it's only one node 
//         }

//         new_node.next = head;// new_node's next took head's value started new new_node sequentially 

//         head = new_node; // In order to change the head of new node as in previous line we only passed the head's value into new_node's next 
//     }

//     public void add_Last(String data){
//         Node new_node = new Node(data);
//         if (head == null){ // If no node exists it'll do then head node will be:
//            head = new_node; // Stores new created Node into the head node.
//            return; // and ends the function, as it's only one node  
//         }

//         Node current = head; // Without this current node we will lose the head of the existing Linked List

//         while (current.next != null){ //For loop isn't possible as we don't know the length of the Linked List unless we calculate the size with another while loop

//              current = current.next; // Basically traversing the whole Linked List/node-to-node and assigning at current node until current node's next become null
//         }
//         current.next = new_node;

//     }

//     // Deleting the first element
//     public void del_first(){
//         if (head == null){ //for Corner case
//             System.out.println("This list is empty!");
//             return;
//         }

//         head = head.next; // If head takes previous head's next data the existing head's value will be gone
//     }

//     public void del_last()



//     public void print_List(){
//         if (head == null){
//             System.out.println("Empty List.");
//         }

//         Node current = head;
//         while (current != null){
//             System.out.print(current.data+"--> ");
//             current = current.next;
//         }
//         System.out.println("Null Appeared!! ");
//     }


//     public static void main (String [] args){
//         LL xx = new LL();
//         xx.add_First("A");
//         xx.add_First("B");
//         xx.add_Last("Z");
//         xx.print_List();
//     }

    

// }









// // Basic LinkListing

// class Nodi{
//     Node head;

//     class Node{
//         int data;
//         Node next;
//         Node(int data){
//             this.data = data;
//             this.next = null;
//         }
//     }
    


//     public void Noding(int data, int data2, int data3){
//        Node n1 = new Node(data);
//        head = n1;
//        Node n2 = new Node(data2);
//        Node n3 = new Node(data3);
//        n1.next = n2;
//        n2.next = n3;
      
//        Node curn = head;
//        while ( curn != null){
//          System.out.print(curn.data+" --> ");
//          curn = curn.next;
//        }

//     }
//     public static void main (String[] args){
       
//       Nodi rr = new Nodi();
//       rr.Noding(20, 30, 40);

//     }

// }







class Converting{
    Node head;
    Node tail;
    class Node{
        int data;
        Node next;
        Node(int data){
            this.data = data;
            this.next = null;
        }
    }


    public void arrToLL(int[] arr){
        
        if (head == null){
            head = new Node(arr[0]);
               // tail = head.next; ❌ // head.next doesn't exists here as head only have the array's first element as first node
        }

        tail = head;

        for (int i = 1; i < arr.length; i++){  // ✅ i=1 because if we take i=0 then the node after head node will be the as arr[0]'s value which results same value in head and curn node. 

            Node curn = new Node(arr[i]);
            tail.next = curn;
            tail = curn;
        }
        
        
        Node present = head;
        while (present != null){
            System.out.print(present.data+" --> ");
            present = present.next;
            
        }
        System.out.print("NuLL ");

    }
    
    
    public  Object counter(Node head, int idx){
         int c = 0;
        for(Node new_node=head; new_node != null; new_node=new_node.next){

            if ( c == idx){
                return new_node.data;// to return a node's data we need object class.
            }
            c++;
            // after return else won't work so else's condition will be in the outside.
        }
        return null; // else's condition


    } 

    public static void main(String[] args){
        Converting xx = new Converting();
        int[] arr = {10,20,30,40,50};
        xx.arrToLL(arr);
        System.out.println();
        int idx =2;
        Object rr = xx.counter(xx.head, idx);
        
        if (rr != null){
            System.out.println("At "+idx+" index, the value is "+rr);
        }
        else{
            System.out.println("Invalid!!");
        }

    }
}





