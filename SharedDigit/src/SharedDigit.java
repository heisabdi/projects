public class SharedDigit {
    public static void main(String args[]) {
        System.out.println(hasSharedDigit(12, 13));
    }
    public static boolean hasSharedDigit(int number1, int number2) {
        if ((number1 <= 10 || number1 >= 99) && (number2 <= 10 || number2 >= 99)) {
            return false;
        }
        int fakeNumber2 = number2;
        while (number1 != 0) {
            int sharedDigit1 = number1 % 10;
            number1 = number1 / 10;
            number2 = fakeNumber2;
            while (number2 != 0) {
                int sharedDigit2 = number2 % 10;
                number2 = number2 / 10;
                if (sharedDigit1 == sharedDigit2) {
                    return true;
                }
            }

        } return false;
    }
}