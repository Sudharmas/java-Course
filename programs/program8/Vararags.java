class maximum {
    static int maximum(int... v) { //function , 3 dots means you can send any number of values of same data type and it will be stored in 'v'
//        v is an array , it will store the any number of arguments or values that are sent to this function
//        int max = Integer.MIN_VALUE;// for example :-  -24567 to +24567 -> max = -24567
        int max = 0;// for example :-  -24567 to +24567 -> max = -24567
        for (int num : v) { //for each - it will start from starting element and go on till ending element of array
//            for all elements in v , if num > max ,if yes,then max = num;
            if (num > max) {
                max = num;//will store the largest number.
            }
        }
        return max;
    }
}


public class Vararags {
    public static void main(String args[]) {
        maximum m = new maximum();// creating object for maximum class
        System.out.println("Maximum of (23, 78): " + m.maximum(23, 78,34,-290,76));//function call inside a statement
        System.out.println("Maximum of (23, -4, -77, 88): " + m.maximum(23, -4, -77, 88));
        int[] A = {-8, 6, 77, 44, 555, 39};
        System.out.println("Maximum of array A: " + m.maximum(A));
    }
}
