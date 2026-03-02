package Praktikum_1.Latihan;
import java.time.LocalDate;

public class Variable {
    public static void main(String[] args){
        String nama = "Agus Dewangga";
        String tempatLahir = "Aceh Tengah";
        LocalDate tanggalLahir = LocalDate.of(2006,8,12);
        char golonganDarah = 'B';
        int umur =  19;
        double tinggi = 1.60;
        String Agama = "Islam";
        String jenisKelamin = "Laki-laki";

        System.out.println("Nama "+ nama);
        System.out.println("tempat Lahir "+ tempatLahir);
        System.out.println("Tanggal Lahir "+ tanggalLahir);
        System.out.println("Golongan Darah "+ golonganDarah);
        System.out.println("Umur "+ umur);
        System.out.println("Tinggi "+ tinggi + " cm");
        System.out.println("Jenis Kelamin "+ jenisKelamin);
    }
}
