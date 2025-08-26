//Assignment Task (must Submit)
// Complete the isBST method
public class Task6 {

    //===================================TASK#6======================
    // This method takes only one parameter
    // it is root of the given tree
    // You can use extra helper private static methods as per need
    public static Boolean isBST( BSTNode root ){
        return isBSTx(root,Integer.MIN_VALUE,Integer.MAX_VALUE);
    }

    private static boolean isBSTx(BSTNode node, int mn, int mx){
        if (node == null){
            return true;
        }

        if (node.elem < mn || node.elem > mx){
            return false;
        }

        return isBSTx(node.left, mn, node.elem-1) && isBSTx(node.right, node.elem, mx);
    }
    //===============================================================


}
