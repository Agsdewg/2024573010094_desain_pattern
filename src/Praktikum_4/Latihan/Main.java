import Praktikum_4.Latihan.Order;
import Praktikum_4.Latihan.OrderPrinter;
import Praktikum_4.Latihan.OrderRepository;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Masukkan nama produk: ");
        String product = scanner.nextLine();
        System.out.print("Masukkan jumlah: ");
        int quantity = scanner.nextInt();
        System.out.print("Masukkan harga satuan: ");
        double price = scanner.nextDouble();

        Order order = new Order(product, quantity, price);

        OrderRepository repository = new OrderRepository();
        repository.saveToFile(order);

        OrderPrinter printer = new OrderPrinter();
        printer.printReceipt(order);
    }
}