import java.util.Scanner;
public class percabangan1 {
    public static void main (String [] args ) {
        int nilai;
        String grade;
        Scanner a = new Scanner(System.in);

        System.out.print("Masukkan Nilai : ");
        nilai = a.nextInt();

        if (nilai >= 90){
            grade = "A";
        } else if ( nilai >= 80) {
            grade = "B+";
        }
        else if ( nilai >= 70) {
            grade = "B";
        }
        else if ( nilai >= 60) {
            grade = "C+";
        }
        else if ( nilai >= 50) {
            grade = "C";
        }
        else if ( nilai >= 40) {
            grade = "D";
        } else {
            grade = "aku syedih banget";
        }
        System.out.println("Grade : " + grade);
    }
}
