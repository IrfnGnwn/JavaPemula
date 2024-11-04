import java.util.Scanner;

public class percabangan2 {
    public static void main (String [] args){
        int belanja = 0;
        Scanner a = new Scanner(System.in);

        System.out.print("Total Belanjaan : ");
        belanja = a.nextInt();
        
        if (belanja > 100000) {
            System.out.println("Selamat Anda Mendapatkan Supris Tidak Terduga");
        }
        System.out.println("Terima Kasih ...");
    }
}
