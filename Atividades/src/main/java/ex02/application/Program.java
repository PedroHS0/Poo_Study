package ex02.application;

import ex02.entities.Estoque;
import java.util.Locale;
import java.util.Scanner;

public class Program {

    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        Estoque produto = new Estoque();
        System.out.println("Escreva o Nome do produto!");
        String name = sc.nextLine();
        System.out.println("Escreva o Preço!");
        double price = sc.nextDouble();
        System.out.println("Escreva a Quantidade!");
        int quantity = sc.nextInt();

        produto.name = name;
        produto.price = price;
        produto.quantity = quantity;

        System.out.printf("Product data: %s, $ %.2f, %d units, Total: $ %.2f%n",
                produto.name, produto.price, produto.quantity, produto.TotalValueInStock());

        sc.close();
    }
}