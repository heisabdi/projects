public class DecimalComparator {
    public static void main(String args[]) {}

    public static boolean areEqualByThreeDecimalPlaces(double decimal, double decimals) {
        double firstNumber = (decimal) * 1000;
        double secondNumber = (decimals) * 1000;
        if ((int) firstNumber == (int) secondNumber) {
            return true;
        } else {
            return false;
        }
    }
}