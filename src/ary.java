public class ary {
    public static void main(String[] args) {
        int[][] arr = {{2,3,4},
               {5,6,7},
                {8,9,10}};

        for (int i = 0; i < 3; i++ ){
            for (int j = 0; j < 3; j++){
                System.out.print(" "+arr[i][j]+" ");
            }
        }
        System.out.println();

        for (int i = 0; i < 3; i++ ){
            for (int j = 0; j < 3; j++){
                System.out.print(" "+arr[j][i]+" ");
            }
        }
        System.out.println();
    }
}
