import java.util.Scanner;
public class coba4 {
    public static void main (String [] args){
        Scanner a = new Scanner(System.in);
        String prodi,nama,kelas;
        System.out.print("Pilih Prodi Anda : ");
        prodi = a.nextLine();
        System.out.println("=================");
        switch (prodi) {
            case "TIF":
                System.out.println("Prodi Anda Teknik Informatika");
                System.out.print("Nama : ");
                nama = a.nextLine();
                System.out.print("Kelas : ");
                kelas = a.nextLine();
                System.out.println("=================");
                System.out.println("Nama Anda : "+nama);
                System.out.println("Kelas Anda : "+kelas);
                break;

                case "TI":
                System.out.println("Prodi Anda Teknik Industri");
                System.out.print("Nama : ");
                nama = a.nextLine();
                System.out.print("Kelas : ");
                kelas = a.nextLine();
                System.out.println("=================");
                System.out.println("Nama Anda : "+nama);
                System.out.println("Kelas Anda : "+kelas);
                break;

                case "DKV":
                System.out.println("Prodi Anda Desain Komunikasi Visual");
                System.out.print("Nama : ");
                nama = a.nextLine();
                System.out.print("Kelas : ");
                kelas = a.nextLine();
                System.out.println("=================");
                System.out.println("Nama Anda : "+nama);
                System.out.println("Kelas Anda : "+kelas);
                break;
        
            default:
            System.out.println("Pilihan Prodi Tidak Ada Euy!!!");
                break;
        }
    }
}
