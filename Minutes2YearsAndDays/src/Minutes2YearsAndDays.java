public class Minutes2YearsAndDays {
    public static void main (String args[]){
    }
    public static void printYearsAndDays(long minutes){
        if (minutes < 0){
            System.out.println("Invalid Value");
        }
        else if (minutes==0){
            long day = 1440;
            long year = 525600;
            long Year = minutes/year;
            long Day = minutes;
            System.out.print(minutes + " min = " + Year + " y and " + Day + " d ");
        }
        else if (minutes > 0) {
            long hour = 60;
            long day = 24;
            long year = 365;
            long Year = (minutes/hour/day/year);
            long Day = (minutes/hour/day)%year;
           System.out.print(minutes + " min = " + Year + " y and " + Day + " d ");
        }
    }
}
