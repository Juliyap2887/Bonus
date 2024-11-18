//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        int balance = 300; // Баланс счета
        int amount = 1200; // Сумма пополнения

        int bonus;
        if (amount > 1000) {
            bonus = amount / 100;
        } else {
            bonus = 0;
        }
        int total = balance + amount + bonus;
        

        System.out.println(total + " Руб.");


    }
}
