public class EqualityPrinter {
    public static void main (String args[]){
    }
    public static void printEqual(int x, int y, int z){
        if (x < 0 || y < 0 || z < 0){
            System.out.print("Invalid Value");
        }
        else if (x==y && x == z && y==z && y==x && z==x && z==y){
            System.out.print("All numbers are equal");
        }
        else if (x!=y && x !=z && y!=z && y!=x && z!=x && z!=y){
            System.out.print("All numbers are different");
        }
        else
            System.out.print("Neither all are equal or different");
    }
}
