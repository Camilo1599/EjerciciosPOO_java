package BankAccount;

public class BanckAccount {
    String headline;
    double balance;

    public BanckAccount(String headline, double balance) {
        this.headline = headline;
        this.balance = balance;
    }

    public String getHeadline() {
        return headline;
    }
    public void setHeadline(String headline) {
        this.headline = headline;
    }

    public double getBalance() {
        return balance;
    }
    public void setBalance(double balance) {
        this.balance = balance;
    }

    public void deposit(double amount) {
        if (amount > 0) {
            this.balance += amount;
            System.out.println("Deposito de: " + amount + " Hecho. Nuevo balance: " + balance);
        } else {
            System.out.println("Cantidad De Deposito Invalida.");
        }
    }

    public void withdraw(double amount) {
        if (amount < 0 && amount <= balance){
            this.balance -= amount;
            System.out.println("retiro de " + amount + " Hecho. NUevo balance: " + balance);
        } else {
            System.out.println("Retiro Invalido o Fondos Insuficientes.");
        }
    }

    public void showBalance(){
        System.out.println("Tu balance actual es de:" + balance);
    } 

}
