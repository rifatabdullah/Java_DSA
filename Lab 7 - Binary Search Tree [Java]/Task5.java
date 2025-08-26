//Assignment Task (must Submit)
// Complete the sumOfLeaves method
public class Task5 {

    //===================================TASK#5======================
    // This method takes only one parameter
    // it is root of the given tree
    // You can use extra helper private static methods as per need
    public static Integer mirrorSum( BSTNode root ){
        if (root == null){
            return 0;
        }
        return mirrorSumx(root.left, root.right);
    }

    private static int mirrorSumx(BSTNode l, BSTNode r){
        if (l == null || r == null){
            return 0;
        }

        int total = l.elem+r.elem;

        total += mirrorSumx(l.left, r.right);
        total += mirrorSumx(l.right, r.left);

        return total;
    }

}
