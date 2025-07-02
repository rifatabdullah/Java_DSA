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

class Animal{
    String name; // Instance Variable inside a Class and which belongs the very object of this Class 

    Animal(String name){ // Same name as Upper class means Constructor 
        this.name  = name ; // Class Attribute (this.name)
        System.out.println("\nPrinting from the depth of the Constructor: "+this.name+"\n");
    }


    public static void main(String [] args){

        Animal dog = new Animal("HAxx");
    }
}




















































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




// Linked List and Node 

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