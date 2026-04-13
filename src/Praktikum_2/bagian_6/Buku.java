package Praktikum_2.bagian_6;

public class Buku {
    private String judul;
    private String pengarang;
    private int tahunTerbit;

    // Constructor Default
    public Buku() {
        this.judul = "unknown";
        this.pengarang = "unknown";
        this.tahunTerbit = 0;
    }

    // Constructor dengan Parameter
    public Buku(String judul, String pengarang, int tahunTerbit) {
        this.judul = judul;
        this.pengarang = pengarang;
        this.tahunTerbit = tahunTerbit;
    }

    // Getter dan Setter
    public void setJudul(String judul) {
        this.judul = judul;
    }

    // PERBAIKAN: Tidak pakai parameter String judul
    public String getJudul() {
        return this.judul;
    }

    public void setPengarang(String pengarang) {
        this.pengarang = pengarang;
    }

    public String getPengarang() {
        return this.pengarang;
    }

    public void setTahunTerbit(int tahunTerbit) {
        this.tahunTerbit = tahunTerbit;
    }

    public int getTahunTerbit() {
        return this.tahunTerbit;
    }

    public void tampilkanInfo() {
        System.out.println("Judul      : " + judul);
        System.out.println("Pengarang  : " + pengarang);
        System.out.println("Tahun      : " + tahunTerbit);
        System.out.println("------------------------");
    }
}