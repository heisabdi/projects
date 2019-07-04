public class SpeedConverter {
    public static void main (String args []){}
    /* The purpose of this project is to convert kilometers to miles.
    Once a user enters a value, it converts that value, rounds it, and prints the result in the
    format "XX km/h = YY mi/h", where XX represents the kilometers and YY represents miles. */

    public static long toMilesPerHour(double kilometersPerHour) {
        if (kilometersPerHour < 0) {
            return -1;
        } else {
            return Math.round(kilometersPerHour / 1.609);
        }
    }
    public static void printConversion(double kilometersPerHour){
        if (kilometersPerHour>=0){
            System.out.print(kilometersPerHour + " km/h = ");
            System.out.print(toMilesPerHour(kilometersPerHour) + " mi/h");
        }
        else{
            System.out.print("Invalid Value");
        }
    }

}
