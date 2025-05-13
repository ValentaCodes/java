package Unidentified;

public class KiloByteConverter {
    public static void main(String[] args) {
        printMegaByteAndKiloByte(4000);
    }
    public static void printMegaByteAndKiloByte(int kilobytes) {

        if (kilobytes < 0) {
            System.out.println("Invalid Response");
            return;
        }

        int megabytes = kilobytes / 1024;
        int remainder = kilobytes % 1024;

        System.out.print(kilobytes +" KB " + megabytes + " MB and " + remainder + " KB");
    }
}
