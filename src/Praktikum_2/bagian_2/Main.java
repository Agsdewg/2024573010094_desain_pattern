package Praktikum_2.bagian_2;

public class Main {
    public static void main(String[] args) {
        Calkulator calk = new Calkulator(); // Pastikan 'C' nya kapital sesuai nama class
        calk.angka1 = 5;
        calk.angka2 = 10;

        // Tambahkan ini kalau mau lihat hasilnya:
        System.out.println("Hasil: " + calk.tambah());
    }
}