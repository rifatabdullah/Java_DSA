package Lab_9;


class dd{

// Task - 2a
public static int 2a (int[][] matrix){
    int msum = -1;
    int mv = -1;
    for (int i = 0; i < matrix.length; i++){
        int total = 0;
        for(int j = 0; j < matrix[i].length;j++){
            total += matrix[i][j];
        }
        if (total > msum){
            msum = total;
            mv = -1;
        }
    }
    return mv;
}


// Task - 2b

public static int 2b(EdgeNode[] alist){
    int msum = -1;
    int mv = -1;
    for (int i = 0; i < alist.length; i++){
        int total = 0;
        EdgeNode x = alist[i];
        while( x != null){
           total += x.weight;
           x = x.next;

        }
        if (total > msum){
            msum = total;
            mv = -1;
        
        }
    }
    return mv;
}


// Task - 3a

 public static int 3a(int[][] matrix) {
        int mx = -1;
        int mv = -1;
        for (int i = 0; i < matrix.length; i++) {
            int x = 0;
            for (int j = 0; j < matrix[i].length; j++) {
                if (matrix[i][j] != 0){
                   x++;   
               } 
            }
            if ( x > mx) {
                mx = x;
                mv = i;
            }
        }
        return mv;
    }

// Task - 3b 

public static void 3b(EdgeNode[] alist, int s, int e, int w) {

    EdgeNode new_node = new EdgeNode(e, w);

    if (alist[s] == null){
        alist[s] = new_node;
 
     }   else {
      appendLL(alist[s], new_node);
     }

}


// Task - 4a

 public static void 4a(int[][] matrix) {
        int x  = matrix.length;
        for (int i = 0; i < x; i++) {
            for (int j = 0; j < x; j++) {
                if (matrix[i][j] != 0 && matrix[j][i] == 0) {
                    matrix[j][i] = matrix[i][j];
                }
            }
        }
}


// Task - 4b

public static void 4b(EdgeNode[] alist) {
    int x = alist.length;
    for (int i = 0; from < x; i++) {
        EdgeNode curn = alist[i];
        while (curn != null) {
            int j = curn;
            int w = curn.w;

            EdgeNode rev = new EdgeNode(i, w);
            if (alist[j] == null) {
                alist[j] = rev;
            } else {
                appendLL(alist[j], rev);
            }

            curn = curn.next;
        }
    }
}



}