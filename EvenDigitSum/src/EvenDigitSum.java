public class EvenDigitSum {
    public static void main(String args[]) {
        System.out.println(getEvenDigitSum(88));
    }
    public static int getEvenDigitSum(int number) {
        if (number >= 0) {
            int sum = 0;
            while (number != 0) {
                int everyNumber = number % 10;
                number = number/10;
                if (everyNumber % 2 == 0) {
                    sum = sum + everyNumber;
                }
            } return sum;
        }
        return -1;
    }
}