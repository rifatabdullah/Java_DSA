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



// class insertion{
//     Node head;
//     Node tail;
//     class Node{
//         int data;
//         Node next;
//         Node(int data ){
//             this.data = data;
//             this.next = null;
//         }



//         public void insertion()
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
        }

        tail = head;

        for (int i = 1; i < arr.length; i++){  // ✅ Earlier, we took head = arr[0], so if we took i = 0 then, 0th value will be again create a new node which will result to print the very first node two times.

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
            else{
                c++;
            }
            // after return, else won't work so else's condition will be in the outside.
        }
        return null; // else's condition

    }

    public void Insertion(Node head, int elem, int idx){

        int c = 0;
        Node curn = head;
        Node new_node = new Node(elem);
        if ( curn == null){
            head = new_node;
            return;
        }
        while(curn != null){
            if( c == idx - 1){
                Node save_node1 = curn;
                Node save_node2 = curn.next;
                save_node1.next = new_node;
                new_node.next = save_node2;
            }
            c++;
            curn = curn.next;
        }
        Node present = head;
         while (present != null){
            System.out.print(present.data+" --> ");
            present = present.next;
            
        }
        System.out.print("NuLL ");
    }


    public void delete(Node head,int elem){
        Node curn = head;
        int c = 0;
        int new_c = 0;
        while (curn != null){
            if (curn.data != elem){
                  Node s2 = curn.next;
                  curn = s2;
            }
            curn = curn.next;
        }
        Node present = head;
         while (present != null){
            System.out.print(present.data+" --> ");
            present = present.next;
            
        }
        System.out.print("NuLL ");

    }
    
public void nodeAt(int idx){

        Node curn = head;
        if ( curn == null ){
          return;
        }

        int c = 0;

        while (curn != null){
            if ( c == idx ){
                System.out.println("Desired value for index: "+idx+" is "+curn.data+"\n");
            }
            c++;
            curn = curn.next;
        }
        

        printLL(head);
    }

    // Get a Specific Node 

    public Node get_Node(int idx){

      int c = 0;
      Node curn = head;

      while (curn != null){
        if (c == idx){
            return curn;
        }
        c++;
        curn = curn.next;
      }
      return null; // Kind of else condition of while loop 

    }

    public void del_idx(Node head, int idx){// With get_Node()

        Node curn = head;
        int c= 0;
        Node prev = null;
        if (idx == 0 & head != null){
            head = head.next;
            return;
        }
        while (curn != null){
            if (c == idx){
                prev = get_Node(idx - 1); // If idx 0, then it'll show Null Error as it'll go out of bound
                prev.next = curn.next;

            }
            c++;
            curn =curn.next;
        }
        printLL(head);
    }

    public void del_new(int idx){ // without get_Node()
        if (idx == 0 & head != null){
            head = head.next;
            return;
        }

        Node curn = head;
        int c = 0;

        while (curn != null){
            if (c == idx-1){
                Node s1 = curn;
                Node del = curn.next;
                s1.next = del.next;
            }
            c++;
            curn = curn.next;
        }

        printLL(head);

    }

    public void delete_val(Node head, int value){ // By prev only
        Node curn = head;
        Node prev = null;

        while (curn != null){
            if ( curn.data == value ){
               prev.next = curn.next;
               
            }
            prev = curn;
            curn = curn.next;
        }

        printLL(head);
       //ff 

    }




    public void insertion(Node head, int element, int idx){
        Node curn = head;
        int c = 0;
        Node new_node = new Node(element);

        while (curn != null){

            if (c == idx-1){
                Node save1 = curn;
                Node save2 = curn.next;
                save1.next = new_node;
                new_node.next = save2;
            }
            c++;
            curn = curn.next;
        }
        printLL(head);
    }

    public void insertion_new(Node head,int elm, int idx){
        Node curn = head;
        int c = 0;
        Node new_node = new Node(elm);
        Node prev = null;

        while (curn != null){
            if (c == idx){
                prev.next = new_node;
                new_node.next = curn;
            }
            c++;
            prev = curn;
            curn = curn.next;
        }
        printLL(head);
    }


    // Reversing a list in place
    public void reverseLL(Node head){
        if (head == null || head.next == null){
            return;
        }

        Node prev = head;
        Node curn = head.next;
        Node next = curn.next;
        while(curn != null){
            next = curn.next; // next stores the Linked List afterwards curn node. that's how the afterward linked list don't get lost

            curn.next = prev; // Mainly connecting curn with prev and reversing
            
            //Updating
            prev = curn;
            curn = next;
        }
        head.next = null; // Cut off initial head's connection
        
        //🔰 How null becomes curn node after while loop?
        // Ans: When curn becomes null the loop exits, so curn is null.

        this.head = prev; // At last curn will be null so prev will be the first node and head. Prev became new head

        printLL(this.head);

        head = prev; // At last curn will be null so prev will be the first node and head. Prev became new head

        printLL(head);



    }
     



    public void Rev(Node head){

        if (head == null || head.next == null){
            return;
        }

        Node curn = head.next;
        Node prev = head;
        Node next = curn.next;

        while(curn != null){
            next = curn.next;
            curn.next = prev;

            //
            prev = curn;
            curn = next;
        }
        head.next = null;
        // head.next = null;
        head = prev;

        printLL(head);
    }
     

    public Node rotateRight(int k){

        if (head == null && k == 0 ){
            return head;
        }

        int c = 1;
        Node curn = head;
        while (curn.next != null){
            c++;
            curn = curn.next;
        }
        curn.next = head;

        k = k % c;
        int len = c - k;
        if (k == 0){
            return head;
        }
        

        Node cn = head;
        while ( len > 1 ){
            cn = cn.next;
            len--;
        }
        Node new_Head = cn.next;
        cn.next = null;
        return new_Head;

    }



    public void printLL(Node head){
        Node curn = head;

        while (curn != null){
            System.out.print(curn.data+" --> ");
            curn = curn.next;
        }
        System.out.print(" NuLL");
    }

    public static void main(String[] args){
        Converting xx = new Converting();
        int[] arr = {10,20,30,40,50};
        System.out.println("\nArray to Linked List Function --");
        xx.arrToLL(arr);
        System.out.println();
        int idx =2;
        Object rr = xx.counter(xx.head, idx);
        System.out.println("\nIndexing Linked List element Function --");
        if (rr != null){
            System.out.println("At "+idx+" index, the value is "+rr);
        }
        else{
            System.out.println("Invalid!!");
        }
        System.out.println("\nNodeAt Function --");
        xx.nodeAt( 2);
        System.out.println("\nInsertion --");
        xx.insertion(xx.head, 99, 2);
        System.out.println("\nInsertion_New --");
        xx.insertion_new(xx.head, 101, 2);
        System.out.println("\nDelete_Value -- ");
        xx.delete_val(xx.head, 99);

        System.out.println("\nDel_Index -- ");
        xx.del_idx(xx.head, 2);

        System.out.println("\ndel_new -- ");
        xx.del_new( 2);

        System.out.println("\nRev -- ");
        xx.reverseLL( xx.head);
        
        System.out.println("\nReving -- ");
        xx.Rev( xx.head);

        System.out.println("\nRotating -- ");
        xx.rotateRight(2);



    }
}





class doublyLL{
    Node head;
    Node last;

    class Node{
        int data;
        Node prev;
        Node next;

        Node(int data){
            this.data = data;
            this.prev = null;
            this.next = null;

        }
    }
    

    public void Basic_DoubLY(int val1, int val2, int val3){
       
        Node n1 = new Node(val1);
        Node n2 = new Node(val2);
        Node n3 = new Node(val3);
        head = n1;

        n1.next = n2;
        n2.prev = n1;
        n2.next = n3;
        n3.prev = n2;
        last = n3;

        System.out.println("Basic Doubly Linked List -->");
        printDLL(head);

    }

    public void insert_End(int val){
        Node new_node = new Node(val);

        if (head == null){
            head = new_node;
            last = new_node;
            return;
        }

        last.next = new_node;
        new_node.prev = last;
        last = new_node;

        printDLL(head);
    }
    

    public void insert_First(int val){
        Node new_node = new Node(val);
        if ( head == null){
            head = new_node;
            last = new_node;
            return;
        }

        new_node.next = head;
        head.prev = new_node;
        head = new_node;

        printDLL(head);
        System.out.println("Back 'N Forth:");
        printF(head);


    }

   
    public void printDLL(Node head){

        if (head == null){
            System.out.println("Null");
            return;
        }

        Node curn = head;
        while (curn != null){
            System.out.print(curn.data+"--> ");
            curn = curn.next;
        }
        System.out.print("NuLL");
 
    }




    public void printF(Node head){
        if (head == null){
            return;
        }

        Node curn = head;
        System.out.print("Printing Doubly LL in Forward Direction: ");
       
        while (curn != null){
            System.out.print(curn.data+" -->");
            curn = curn.next;
        }
        System.out.print(" NuLL");
        System.out.println();

        Node curn2 = last;
        System.out.print("Printing Doubly LL in Backward Direction: ");
       
        while (curn2 != null){
            System.out.print(curn2.data+" -->");
            curn2 = curn2.prev;
        }
        System.out.print(" NuLL");
        System.out.println();
    }

  




    public static void main(String [] args){
        doublyLL xx = new doublyLL();
        xx.Basic_DoubLY(10, 20, 30);
        
        System.out.println("\nInsert at First: \n");
        xx.insert_First(200);


    }
}



//// Always use hashT[index] - for adding or updating values. But while traversing hashtable have to use "Node curn" as it doesn't change the actual value of Hash Table..



class Hash{
    Node[] hashT;
    Hash(int size){
        this.hashT = new Node [size];
    }

    class Node{
        String key;
        String val;
        Node next;
        Node(String key,String val){
          this.key = key;
          this.val = val;
          this.next = null;
        }
    }
     

    public int hash_Func(String key){
        int total = 0;
      for (int i = 0; i < key.length(); i ++){
           
            char c = key.charAt(i);
            total += (int) c;
        }
      return total % hashT.length;
    }

    public void insertion(String key, String val){

        int idx = hash_Func(key);
        Node new_node = new Node(key, val);
        if (hashT[idx] == null){
            hashT[idx] = new_node;
            return;
        }
        else{
            new_node.next = hashT[idx];
            hashT[idx] = new_node;
        }
    }

    public void search(String key){
        int idx = hash_Func(key);
        Node curn = hashT[idx];

        while( curn != null){
            if ( curn.key.equals(key)){
                System.out.println("Desired Value: "+curn.val);
                return;
            }
            curn = curn.next;
        }
    }

    public void P_hash(){

        for (int i = 0; i < hashT.length; i++){
            System.out.println("Index: "+i);
            Node curn = hashT[i];
            while ( curn != null){
                System.out.print("["+hashT[i].key+", "+hashT[i].val+"]"+" -->");
                curn = curn.next;
            }
            System.out.println();
        }

    }

    public static void main(String[] args) {
        Hash xx = new Hash(5);
        xx.insertion("Python", "1");
        xx.insertion("Java", "2");
        xx.insertion("JavaScript", "3");
        // xx.insertion("ThonPy", "3");

        xx.P_hash();
        System.out.println();
        xx.search("Java");
    }
}


///// Recursion


class recursion{

    // Printing in reverse order 
    public static void printR(int n){
        if (n==0){
            return;
        }
        System.out.println(n);
        printR(n-1);
    }

    //printing in forward order
    public static void printF(int m, int range){
        if(m > range){
            return;
        }
        System.out.println(m);
        printF(m+1, range);
    }

    //Printing N th numbers sum

    public static void Nsum(int s, int e, int t) {

        if (s > e){
            System.out.println(t);
            return;
        }
        t += s;
        Nsum(s+1, e, t);
        System.out.println(s);// while returning this line will keep printing
    }

    public static void main (String[] args){
        System.out.println("Forward Order: ");
        int m = 1;
        int range = 5;
        printF(m, range);

        System.out.println("-------------------");
        
        System.out.println("Reverse Order: ");
        int n = 5;
        printR(n);

        System.out.println();
        System.out.println("Printing Total: \nf");
        int s = 1;
        int e = 5;
        int t = 0;
        Nsum(s, e, t);

    }
}



//// Binary Tree


class BT{
    public class Node{
        String elem;
        Node left;
        Node right;
        Node(String elem){
            this.elem = elem;
            this.left = null;
            this.right = null;
        }
    }

    public void pre(Node root){

        if (root == null){
            return;
        }

        System.out.print(root.elem+" ");
        pre(root.left);
        pre(root.right);
    }

    public void in_order(Node root){
        if (root == null){
            return;
        }
        
        in_order(root.left);
        System.out.print(root.elem+" ");
        in_order(root.right);
    }

    public void post_order(Node root){
        if (root == null){
            return;
        }

        post_order(root.left);
        post_order(root.right);
        System.out.print(root.elem+" ");
    }

    // IsIdentical

 

    public static void main(String [] args){
        Node root = new Node("A");
        Node n1 = new Node("B");
        Node n2 = new Node("C");
        Node n3 = new Node("D");
        Node n4 = new Node("E");
        Node n5 = new Node("F");
        Node n6 = new Node("G");
        
        root.left = n1;
        root.right = n2;

        n1.left = n3;
        n1.right = n4;
        
        n2.left = n5;
        n2.right = n6;

        BT xx = new BT();
        System.out.println("\nPre_Order Printing: ");
        xx.pre(root);
        System.out.println("\nIn_Order Printing: ");
        xx.in_order(root);
        System.out.println("\nPost_Order Printing: ");
        xx.post_order(root);


    }
}



class Identical{
    public static class Node{
        int data;
        Node left;
        Node right;
        Node(int data){
            this.data = data;
            this.left = null;
            this.right = null;
        }
    }


    public  boolean isIdentical(Node root1, Node root2 ){

        if (root1 == null && root2 == null){
            return true;
        }

        if (root1 == null && root2 != null){
            return false;
        }
        
        if (root1 != null && root2 == null){
            return false;
        }

        
        // if (root1.data == root2.data ){
        //     return true;
        // }
        
        if (root1.data != root2.data){
            return false;
        }

        return isIdentical(root1.left, root2.left) && isIdentical(root1.right, root2.right);
    }


    public static void main (String [] args){
        Node root1 = new Node(10);
        root1.left = new Node(7);
        root1.left.left = new Node(4);
        root1.right = new Node(15);
        root1.right.right = new Node(20);

        Node root2 = new Node(10);
        root2.left = new Node(7);
        root2.left.left = new Node(4);
        root2.right = new Node(15);
        root2.right.right = new Node(20);

        Identical xx = new Identical();
        System.out.println("Two Binary Comparsion: "+xx.isIdentical(root1, root2)); 

    }

         
}




/// BT creation with the help of Recursion


class BT_R{
    public class Node{
        String data;
        Node left;
        Node right;
        Node(String data){
            this.data = data;
            this.left = null;
            this.right = null;
        }
    }


    public Node buildT(String[] arr, int i){

        if (i >= arr.length || arr[i] == null){
            return null;
        }

        Node root = new Node(arr[i]);

        root.left = buildT(arr, 2*i);
        root.right = buildT(arr, 2*i+1);
        return root;

    }

    public void in_order(Node root){
        if(root == null){
            return;
        }

        in_order(root.left);
        System.out.print(root.data+" ");
        in_order(root.right);
    }

    public int height(Node root){
        if (root == null){
            return 0;
        }

        return Math.max(height(root.left), height(root.right))+1;
    }

    public static void main (String[] args){
        String[] arr = {null,"A","B","C","D","F","G"};
        BT_R x = new BT_R();
        Node root = x.buildT(arr, 1);
        System.out.println("In Order Traversal: ");
        x.in_order(root);

        System.out.println("\nHeight of the Binary Tree(Node-based) but (Edge based will be 1 less): "+x.height(root));
    }
} 




class Maxheap{
    int[] heap;
    int count;
    int capacity;
    Maxheap(int capacity){
        this.capacity = capacity;
        heap = new int [capacity+1];// As starts from index 1
        count = 0;
    }

    public void insert (int data){
        if (count>= capacity){
            System.out.println("Heap is Full!");
            return;
        }

        count++;
        heap[count] = data;
        int i = count;
        
        //swim()
        while (i > 1 && heap[i] > heap[i/2]){ // Checks Parents value with Child's value
            int temp = heap[i];
            heap[i] = heap[i/2];
            heap[i/2] = temp;
            i = i/2; // Child to Parent Node


        }

    }

     public void printHeap(){
            System.out.println("Max_Heap Array: ");
            for(int i = 1; i <= capacity; i++){
                System.out.print(heap[i]+" ");
            }
            System.out.println();
        }

        public static void main (String[] args){
            Maxheap h = new Maxheap(10);
            h.insert(20);
            h.insert(15);
            h.insert(30);
            h.insert(5);
            h.insert(10);

            h.printHeap(); 
        }
}