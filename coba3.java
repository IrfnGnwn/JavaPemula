import java.util.Scanner;

public class coba3 {
    public static void main (String [] args){
        Scanner a = new Scanner(System.in); //objek
        int usia;
        System.out.println("===================");
        System.out.print("Masukkan Usia Anda : ");
        usia = a.nextInt();
        System.out.println("===================");
        System.out.println("Usia Anda adalah : "+usia);
    }
}
