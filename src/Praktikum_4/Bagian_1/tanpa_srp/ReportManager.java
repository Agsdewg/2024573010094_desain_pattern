package Praktikum_4.Bagian_1.tanpa_srp;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class ReportManager {
    private final String content;

    public ReportManager(String content){
        this.content = content;
    }

    public String generatorReport(){
        return "=== LAPORAN ===\n" + content + "\n=========";
    }

    public void saveTofile(String filename){
        String folderPath = "src\\Praktikum_4\\bagian_1\\tanpa_srp\\";

        File file = new File(folderPath +filename);

        try (FileWriter writer = new FileWriter(file)) {
            writer.write(content);
            System.out.println("Laporan disimpan ke file: " + filename);
        }catch (IOException e) {
            System.out.println("Gagal menympan laporan: " + e.getMessage());
        }
    }
    public void printReport(){
        System.out.println("\nLaporan yang dicetak: \n" + content);
    }
}
