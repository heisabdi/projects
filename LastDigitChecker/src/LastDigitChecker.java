public class LastDigitChecker {
    public static void main (String args []) {
        System.out.println(hasSameLastDigit(10,10,10));
        System.out.println(isValid(10));
    }
    public static boolean hasSameLastDigit (int number1, int number2, int number3) {
        if ((number1 < 10 || number1 > 1000) || (number2 < 10 || number2 > 1000) || (number3 < 10 || number3 > 1000)) {
            return false;
        }
            int lastDigit1 = number1 % 10;
            int lastDigit2 = number2 % 10;
            int lastDigit3 = number3 % 10;
            if (lastDigit1 == lastDigit2 || lastDigit1 == lastDigit3){
                return true;
            }
            else if (lastDigit2 == lastDigit1 || lastDigit2 == lastDigit3){
                return true;
            }
            else if (lastDigit3 == lastDigit1 || lastDigit3 == lastDigit2){
                return true;
            }
        return false;

    }
    public static boolean isValid (int number1) {
        if (number1 < 10 || number1 > 1000) {
            return false;
        } return true;
    }
}
