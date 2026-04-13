package Praktikum_2.bagian_3;

public class AksesModifier {
    public int publicvar = 1;
    private int privateVar = 2;
    protected int protectedVar = 3;
    int defaultVar = 4;

    public void tampilkan(){
        System.out.println("Public: " + publicvar);
        System.out.println("Private: " + privateVar);
        System.out.println("Protected: "+ protectedVar);
        System.out.println("default: "+ defaultVar);
    }
}
