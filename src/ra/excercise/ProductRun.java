package ra.excercise;

import java.util.Scanner;

public class ProductRun {
    static Product[] arrProduct = new Product[100];
    static int currentIndex = 0;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ProductRun.inputListProduct(scanner);
    }

    public static void inputListProduct(Scanner scanner){
        System.out.println("Nhập vào số sản phẩm cần nhập thông tin:");
        int n = Integer.parseInt(scanner.nextLine());
        for (int i = 0; i < n; i++) {
            arrProduct[currentIndex] = new Product();
            arrProduct[currentIndex].inputData(scanner);
        }
    }
}
