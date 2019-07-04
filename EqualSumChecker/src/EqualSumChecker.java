public class EqualSumChecker {
    public static void main(String args[]) {
    }

    public static boolean hasEqualSum (int x, int y, int z) {
        int theSum = (x + y);
        if (theSum == z) {
            return true;
        }
        else
            return false;
        }
    }