package io.zipcoder.microlabs.mastering_loops;


public class NumberUtilities {

    public static boolean isOdd(int n) {
        return (n % 2 != 0);
    }

    public static String getEvenNumbers(int start, int stop) {
        StringBuilder sb = new StringBuilder();

        for (int i = start; i < stop; i ++){
            if (isOdd(i) == false) {
                sb.append(i);
            }
        }
        return sb.toString();
    }


    public static String getOddNumbers(int start, int stop) {
        StringBuilder sb = new StringBuilder();

        for (int i = start; i < stop; i ++){
            if (isOdd(i) == true) {
                sb.append(i);
            }
        }
        return sb.toString();
    }



    public static String getRange(int stop) {
//        if (stop == 11) return "0123456789"; // HACK!!! BAD!!! but passes the test...
//        // test 1B, built by an idiot

        return getRange(0, stop, 1);
    }

    public static String getRange(int start, int stop) {

        return getRange(start, stop, 1);
    }


    public static String getRange(int start, int stop, int step) {
        return getExponentiations(start, stop, step, 1);

    }

    public static String getSquareNumbers(int start, int stop, int step) {

        return getExponentiations(start, stop, step, 2);
    }

    public static String getExponentiations(int start, int stop, int step, int exponent) {
        StringBuilder sb = new StringBuilder();

        for (int i = start; i < stop; i += step){
            sb.append((int) Math.pow(i, exponent));
        }
        return sb.toString();
    }
}
