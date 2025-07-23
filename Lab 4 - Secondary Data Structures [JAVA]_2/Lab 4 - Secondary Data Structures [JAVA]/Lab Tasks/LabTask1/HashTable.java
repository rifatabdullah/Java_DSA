/*You will have to complete the FruitNode Contrustor first
 then within this class you only have to complete two methods
 hashFunction() and insert()
 the rest of the metods are already written
 DO NOT TOUCH any other methods or codes*/
public class HashTable {

    //ht[] :: is the HashTable array that stores the FruitNode objects
    private FruitNode[] ht;

    //Constructor that initializes the HashTable array
	//DO NOT change this Constructor
    public HashTable(int size){
        this.ht = new FruitNode[size];
    }
    
    //This method basically prints the HashTable
    //DO NOT change this method
    public void show(){
        for(int i=0; i<ht.length; i++){
            System.out.print( i+" " );
            FruitNode n = ht[i];
            while (n!=null){
                System.out.print("('"+n.fruit[0]+"', "+n.fruit[1]+") --> ");
                n = n.next;
            }
            System.out.println();
        }
    }

    //you need to COMPLETE this method
    private int hashFunction( String key ){
        int total = 0;

        if (key.length() % 2 == 0 ){
            for (int i = 0; i < key.length(); i++){
                char c = key.charAt(i);
                int n = (int) c;

                if ( n % 2 == 0){
                    total += n;
                }
            }
        }
        else{

            for (int i = 0; i < key.length(); i++){
                char c = key.charAt(i);
                int n = (int) c;

                if ( n % 2 != 0){
                    total += n;
                }
            }

        }
        return total % ht.length; 
    }

    //you need to COMPLETE this method
    //The insert() method will create a FruitNode using name(Key) & price(value)
	//then inserts it in the proper hashed index
    //If collision occurs resolve using the steps explained in the question
    public void insert(String key, Integer value){
        int idx = hashFunction(key);
        FruitNode new_node = new FruitNode(key, value);
        FruitNode prev = null;

        if (ht[idx] == null){
            ht[idx] = new_node;
            return;
        }
        else{
            FruitNode curn = ht[idx];
            while (curn != null ){
                   
                if (curn.name.equals(key)){
                    curn.price = value;
                    return;
                }

                prev = curn;
                curn = curn.next; 
               } 

                if (prev == null){
                    new_node.next = ht[idx];
                    ht[idx] = new_node;
                }
                else{
                    prev.next = new_node;
                    new_node.next = curn;
                }
                  
            }
        }
    }


