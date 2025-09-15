//Assignment Task 02: Row Rotation Policy
class AssgnTask2{

    public static Integer rowRotation( Integer examWeek, String[][] matrix ){

        // String[] curn = new String[matrix.length-1];


        for ( int i = 0; i < examWeek-1; i++){
            String[] last = matrix[matrix.length - 1];
            for ( int j = matrix.length - 1; j > 0; j--){
                matrix[j] = matrix[j-1];

            }
            matrix[0] = last;
        }

        int row = 0;

        for (int i = 0; i < matrix.length ; i++){
            for (int j = 0; j < matrix[0].length ; j++){
                if (matrix[i][j].equals("AA")){
                    row = i+1;
                }

                System.out.print(" "+matrix[i][j]+" ");
            }
            System.out.println();
        }

        return row;


   
        // //For this task you don"t need to create new arrays
        // //After rotation the Matrix should be printed inside the method
        // //Only the integer row number is to be returned

        // //TO DO
        // return row;
    }

    //DO NOT CHANGE ANY DRIVER CODE BELOW THIS LINE
    public static void main(String[] args){
        String[][] seatStatus = {
                {"A" , "B"  , "C"  , "D"  , "E"},
                {"F" , "G"  , "H"  , "I"  , "J"},
                {"K" , "L"  , "M"  , "N"  , "O"},
                {"P" , "Q"  , "R"  , "S"  , "T"},
                {"U" , "V"  , "W"  , "X"  , "Y"},
                {"Z" , "AA" , "BB" , "CC" , "DD"}
        };
        System.out.println("Given Seat Status: ");
        Arr.print2D(seatStatus);
        
        System.out.println("\nExpected Output:");
        System.out.println("| U  | V  | W  | X  | Y  | ");
        System.out.println("| Z  | AA | BB | CC | DD | ");
        System.out.println("| A  | B  | C  | D  | E  | ");
        System.out.println("| F  | G  | H  | I  | J  | ");
        System.out.println("| K  | L  | M  | N  | O  | ");
        System.out.println("| P  | Q  | R  | S  | T  | ");
        System.out.println("Your friend AA will be on row 2");
        
        System.out.print("\nYour Output:\n");
        Integer examWeek = 3;
        //This following should print modified seat status after rotation and return the current exam week
        Integer rowNumber = rowRotation( examWeek, seatStatus );
        //The following should print Your friend AA will be on row 2
        System.out.println("Your friend AA will be on row "+rowNumber);
    }
}