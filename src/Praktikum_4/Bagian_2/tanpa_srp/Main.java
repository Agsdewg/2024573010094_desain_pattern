package Praktikum_4.Bagian_2.tanpa_srp;

import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        System.out.println("Masukan nama pengguna: ");
        String name = scanner.nextLine();

        System.out.println("Masukan email pengguna: ");
        String email = scanner.nextLine();

        UserManager userManager = new UserManager(name, email);
        userManager.saveToDatabase();
        userManager.sendWelcomeEmail();
    }
}
