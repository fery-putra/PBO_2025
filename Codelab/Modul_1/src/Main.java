import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        String nama;
        char jeniskelamin;
        int tahunlahir;
        java.time.LocalDate currentDate = java.time.LocalDate.now();

        Scanner input = new Scanner(System.in);
        System.out.print("Masukkan nama Anda: ");
        nama = input.nextLine();
        System.out.print("Masukkan jenis kelamin Anda (L/P): ");
        jeniskelamin = input.nextLine().charAt(0);
        System.out.print("Masukkan tahun lahir Anda: ");
        tahunlahir = input.nextInt();
        int umur = currentDate.getYear() - tahunlahir;


        System.out.println("Data Diri :");
        System.out.println("Nama  " + nama);
        if (jeniskelamin == 'L' || jeniskelamin == 'l') {
            System.out.println("Laki-Laki");
        } else if (jeniskelamin == 'P' || jeniskelamin == 'p') {
            System.out.println("Perempuan");
        }

        System.out.println("Umur " + umur);

    }
}
