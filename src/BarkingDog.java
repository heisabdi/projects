public class BarkingDog {
    public static void main (String args[]) {
        System.out.println(shouldWakeUp(true,22));
    }
    public static boolean shouldWakeUp (boolean barking, int hourOfDay){
        if (barking==false){
            return false;
        }
        else if (hourOfDay > 23 || hourOfDay < 0) {
            return false;
        }
        else if (hourOfDay < 8 || hourOfDay > 22){
            return true;
        }
        else{
            return false;
        }
    }
}
