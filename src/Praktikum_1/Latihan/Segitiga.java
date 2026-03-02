package Praktikum_1.Latihan;

public class Segitiga {
    public static void main(String[] args){
        int Tinggi = 5;
        for (int i = 1; i <= Tinggi; i++){
            for (int j = 1; j <= i; j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
