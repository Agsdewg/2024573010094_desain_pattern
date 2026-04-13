package Praktikum_4.Bagian_1.tanpa_srp;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Masukan isi laporan: ");
        String reportText = scanner.nextLine();

        System.out.println("Masukan nama file laporan: ");
        String reportFIleName = scanner.nextLine();

        ReportManager reportManager = new ReportManager(reportText);
        String report = reportManager.generatorReport();

        reportManager.saveTofile(reportFIleName + ".txt");
        reportManager.printReport();
    }
}
