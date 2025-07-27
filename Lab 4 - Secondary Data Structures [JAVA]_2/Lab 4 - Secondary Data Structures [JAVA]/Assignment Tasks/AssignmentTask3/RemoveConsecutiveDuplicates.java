public class RemoveConsecutiveDuplicates{
	
    // You have to write this method
    // YOU MUST SUBMIT THIS METHOD
    public static String removeConsecDups(String word){

        LinkedListQueue q = new LinkedListQueue();
        char[] wArr = new char[word.length()];

        for (int i = 0; i< word.length(); i++){
            wArr[i] = word.charAt(i);
            q.enqueue(wArr[i]);
        }

        char[] x = new char[word.length()];
        int idx =0;
        char ch = ' ';
        boolean first = true;

        while (!q.isEmpty()){
            Object deque = q.dequeue();
            char curn = (char) deque;

            if (first == true || curn != ch){
                x[idx] = curn;
                idx++;
            }

            ch = curn;
            first = false;
        }

        char[] last = new char[idx];
        for (int i =0; i < last.length; i++){
            last[i] = x[i];
        }

        String st = "";
        for (int i=0; i < last.length; i++){
            st += last[i];
        }

        return st;

    }
    
    //DO NOT CHANGE and DO NOT SUBMIT THIS METHOD
    public static void assertTest(Object actual, Object expected) {
	if( actual==null || !actual.equals(expected)){
            System.out.println("Test Failed! Expected: " + expected + ", but got: " + actual);
	} else {
            System.out.println("Test Success!!! Expected: " + expected + ", but got: " + actual);
        }
    }

    //DO NOT SUBMIT THE TESTER METHOD
    //DO NOT MODIFY THE MAIN METHOD
    public static void main(String[] args) {
        System.out.println("Test 01");
        String string1 = "aabbbccccdd";
        String returned1 = removeConsecDups(string1);
        assertTest(returned1, "abcd");
        System.out.println("-----------------------------------------");

        System.out.println("Test 02");
        String string2 = "aaabbaa";
        String returned2 = removeConsecDups(string2);
        assertTest(returned2, "aba");
        System.out.println("-----------------------------------------");

        System.out.println("Test 03");
        String string3 = "abcabcabc";
        String returned3 = removeConsecDups(string3);
        assertTest(returned3, "abcabcabc");
        System.out.println("-----------------------------------------");

        System.out.println("Test 04");
        String string4 = "aaaaa";
        String returned4 = removeConsecDups(string4);
        assertTest(returned4, "a");
        System.out.println("-----------------------------------------");
    }
}
