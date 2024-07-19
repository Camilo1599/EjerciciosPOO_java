package BankAccount;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        BanckAccount cuenta1 = new BanckAccount("crist", 20000);
        System.out.println("Hola: " + cuenta1.getHeadline());
        cuenta1.showBalance();

        System.out.println("¿Qué deseas hacer con tu cuenta?");
        System.out.println("1. Depositar\n2. Retirar\n");
        int option = scanner.nextInt();

        switch(option){
            case 1:
                System.out.println("Ingresa e valor a depositar: ");
                double amount = scanner.nextDouble();
                cuenta1.deposit(amount);
                cuenta1.showBalance();
                break;
            case 2:
                System.out.println("ingresa el valor a retirar: ");
                amount = scanner.nextDouble();
                cuenta1.withdraw(amount);
                cuenta1.showBalance();
                break;
            
            default:
                System.out.println("Opción incorrecta");
        }

        scanner.close();

    }
}
