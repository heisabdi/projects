public class AreaCalculator {
    public static void main(String args []){
        System.out.println( area(5.0, 4.0));
        System.out.println(area(4));
    }
    public static double area (double radius){
        double areaOfACircle = Math.PI * Math.pow(radius, 2);
        if (radius <=-1.0){
            return -1;
        }
        else
            return areaOfACircle;
    }
    public static double area (double x, double y){
        double areaofRectangle = x * y;
        if (x < 0 || y < 0) {
            return -1;
        }
        else
            return areaofRectangle;
    }
}

