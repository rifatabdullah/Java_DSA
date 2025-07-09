//Assignment Task 01: Container with Most Water
class AssgnTask1{
 
    public static void mostWater( Integer[] height ){
        
        int width = 0;
        int max = 0 ;
        int area = 0;
        int h = 0;
        for (int i = 0; i < height.length - 1; i++){

            for (int j = i+1; j < height.length ;j++){
                width = j - i;
                if ( height[i] > height[j]){
                    h = height[j];
                }
                else{
                    h = height[i];
                }

                area = width*h;

                if ( area > max){
                    max = area;
                }

            }
        }
        System.out.println(max);
































        // int max = 0;
        // int area = 0;
        // for (int i = 0; i < (height.length -1); i++ ){

        //     for (int j = i+1; j < height.length; j++){
        //         int wid = j-i;
        //         int len = 0;
        //         if (height[i] > height[j]){
        //             len = height[j];
        //         }
        //         else{
        //             len = height[i];
        //         }

        //         area = wid * len;
        //         if (max < area){
        //             max = area;
        //         }
        //     }
        // }
        // System.out.println(max);
        
        //TO DO

    }

    //DO NOT CHANGE ANY DRIVER CODE BELOW THIS LINE
    public static void main(String[] args){
        Integer[] array = {1,8,6,2,5,4,8,3,7};
        System.out.println("Given Array: ");
        Arr.print(array);
        System.out.println("\nExpected Output:");
        System.out.print("49");
	System.out.print("\nYour Output:\n");
        mostWater( array );

    }
}
