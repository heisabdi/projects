public class MegaBytesConverter {
    public static void main (String args []){
    printMegaBytesAndKiloBytes(0);
    }
    public static void printMegaBytesAndKiloBytes(int kiloBytes){
        if(kiloBytes >= 0){
         int megaByte = kiloBytes / 1024;
            System.out.print(kiloBytes + " KB = " + megaByte + " MB and " + kiloBytes % 1024 + " KB");
        }
        else {
            System.out.print("Invalid Value");
        }

    }
}
