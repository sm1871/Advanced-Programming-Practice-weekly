import java.util.Scanner;

public class Product {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = 5;

        int[] productId = new int[n];
        String[] productName = new String[n];
        double[] price = new double[n];
        int[] quantity = new int[n];
        double[] totalPrice = new double[n];
        double[] discount = new double[n];
        double[] finalPrice = new double[n];

        // Reading details for 5 products
        for (int i = 0; i < n; i++) {
            System.out.println("Enter details for Product " + (i + 1) + ":");

            System.out.print("Product ID: ");
            productId[i] = sc.nextInt();
            sc.nextLine(); // consume newline

            System.out.print("Product Name: ");
            productName[i] = sc.nextLine();

            System.out.print("Price: ");
            price[i] = sc.nextDouble();

            System.out.print("Quantity: ");
            quantity[i] = sc.nextInt();

            System.out.println();
        }

        // Calculating total price, discount and final price
        for (int i = 0; i < n; i++) {
            totalPrice[i] = price[i] * quantity[i];

            if (totalPrice[i] >= 5000) {
                discount[i] = totalPrice[i] * 0.10; // 10% discount
            } else {
                discount[i] = totalPrice[i] * 0.05; // 5% discount
            }

            finalPrice[i] = totalPrice[i] - discount[i];
        }

        // Displaying results for all products
        System.out.println("===== Billing Summary =====");
        for (int i = 0; i < n; i++) {
            System.out.println("\nProduct ID: " + productId[i]);
            System.out.println("Name: " + productName[i]);
            System.out.println("Total Price: Rs." + totalPrice[i]);
            System.out.println("Discount: Rs." + discount[i]);
            System.out.println("Final Price: Rs." + finalPrice[i]);
        }

        sc.close();
    }
}