package Praktikum_1.Latihan;

public class Perulangan {
    public static void main(String[] args){
        System.out.println("for");
        for (int i = 1; i <= 20; i+=2){
            System.out.print(" " + i);
        }
        System.out.println("");
        System.out.println("while");
        int i = 1;
        while (i <= 20) {
            System.out.print(" "+ i);
            i +=2;
        }
        System.out.println("");
        System.out.println("do-while");
        int j = 1;
        do {
            System.out.print(" " + j);
            j += 2;
        }while (j <=20);
    }
}
