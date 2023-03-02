package exerciciocumprimentar;

import java.util.Scanner;

public class Main2 {

    public static void main(String[] args) {

        Scanner read = new Scanner(System.in);

        System.out.println("Qual é o seu nome?");
        String nome = read.nextLine();
        System.out.println("Ola " + nome);
    }
}
