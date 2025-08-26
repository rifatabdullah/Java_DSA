// Complete the levelSum method
//ASSIGNMENT TASK MUST SUBMIT
public class Task6 {

    //===================================TASK#6===================================
    // This method takes only 1 parameter which is root of the given tree
    // This method returns an Integer
    // At times you may need to typeCast root.elem to Integer
    // You can use extra helper private static methods with extra extra params as per need
    public static Integer levelSum( BTNode root ){
        return levelSumx(root,0);
    }

    private static Integer levelSumx( BTNode root, int lvl ){
        if (root ==null){
            return 0;
        }

        int val = (Integer) root.elem;
        
        if(lvl % 2 == 0){
            val = - val;

        }

        int l = levelSumx(root.left, lvl+1);
        int r = levelSumx(root.right, lvl+1);

        return val+l+r;
    }

}
