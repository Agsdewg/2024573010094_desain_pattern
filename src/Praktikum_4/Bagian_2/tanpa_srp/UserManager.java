package Praktikum_4.Bagian_2.tanpa_srp;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class UserManager {
    private final String name;
    private final String email;

    public UserManager(String  name, String email) {
        this.name = name;
        this.email = email;
    }

    public void saveToDatabase(){
        String folderPath = "src\\Praktikum_4\\Bagian_2\\tanpa_srp\\";
        String filename = "user.txt";

        File file = new File(folderPath + filename);

        try (FileWriter writer = new FileWriter(file, true)) {
            writer.write(name + " - " + email + "\n");
            System.out.println("Pengguna berhasil disimpan: " + name);
        }catch (IOException e) {
            System.out.println("Gagal menympan pengguna: " + e.getMessage());
        }
    }
    public void sendWelcomeEmail(){
        System.out.println("\nMengirim email ke " + email + "...");
        System.out.println("Halo " + name + ", selamat datang di sistem kami! \n");
    }
}
