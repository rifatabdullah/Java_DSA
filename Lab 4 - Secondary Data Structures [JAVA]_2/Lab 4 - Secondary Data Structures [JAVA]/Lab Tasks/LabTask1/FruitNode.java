public class FruitNode {
    
    //the fruit array is the data of this node class
    //the first index should contain name of the fruit
    //the second index should contain the price of the fruit
    Object[] fruit = new Object[2];
    FruitNode next;
    String name;
    Integer price;

    public FruitNode(String name, Integer price){
        this.name = name;
        this.price = price;
        this.next = null;
        this.fruit[0] = name;
        this.fruit[1] = price;
        
    }
    
}
